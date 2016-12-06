package io.vicp.goradical.atm.dao;

import io.vicp.goradical.atm.model.Record;
import io.vicp.goradical.atm.tools.JDBCTools;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecordDao {
	private AccountDao accountDao;

	public RecordDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public synchronized int balanceIncreaseRecord(Connection conn, int accountId, double amount) {
		String saveMoneySql = "insert into t_record values (null, " + accountId + ", 1, " + amount + ", now())";
		return updateBalanceRecord(conn, saveMoneySql);
	}

	public synchronized int balanceDecreaseRecord(Connection conn, int accountId, double amount) {
		String drawMoneySql = "insert into t_record values (null, " + accountId + ", 2, " + amount + ", now())";
		return updateBalanceRecord(conn, drawMoneySql);
	}

	private synchronized int updateBalanceRecord(Connection conn, String sql) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTools.closeStatementAndResultSet(rs, pstmt);
		}
		return result;
	}

	public int getRecordCountWithAccountId(Connection conn, int accountId) {
		Statement stmt = null;
		ResultSet rs = null;
		int count = 0;
		String countRecordCountWithAccountIdSql = "select count(record_id)  from t_record where account = " + accountId;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(countRecordCountWithAccountIdSql);
			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTools.closeStatementAndResultSet(rs, stmt);
		}
		return count;
	}

	public List<Record> getRecordListWithAccountId(Connection conn, int accountId, int pageNum, int pageSize ) {
		List<Record> recordList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectRecordListWithAccountIdSql = "select * from t_record where account = ? limit " + (pageNum - 1) * pageSize + ", " + pageSize;
		try {
			pstmt = conn.prepareStatement(selectRecordListWithAccountIdSql);
			pstmt.setInt(1, accountId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Record record = new Record();
				record.setRecordId(rs.getInt(1));
				record.setAccount(accountDao.getAccountWithAccountId(conn, rs.getInt(2)));
				record.setActionType(rs.getInt(3));
				record.setAmount(rs.getDouble(4));
				record.setDate(rs.getTimestamp(5));
				recordList.add(record);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTools.closeStatementAndResultSet(rs, pstmt);
		}
		return recordList;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
}
