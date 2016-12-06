package io.vicp.goradical.atm.dao;

import io.vicp.goradical.atm.model.Account;
import io.vicp.goradical.atm.tools.JDBCTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDao {

	public synchronized int increaseBalance(Connection conn, int accountId, double amount) {
		String saveMoneySql = "update t_account set balance = balance + " + amount + "where account_id = " + accountId;
		return updateBalance(conn, saveMoneySql);
	}

	public synchronized int reduceBalance(Connection conn, int accountId, double amount) {
		String drawMoneySql = "update t_account set balance = balance - " + amount + "where account_id = " + accountId;
		return updateBalance(conn, drawMoneySql);
	}

	private synchronized int updateBalance(Connection conn, String sql) {
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTools.closeStatement(pstmt);
		}
		return result;
	}

	public Account getAccountWithBankCard(Connection conn, String bankCard) {
		String selectAccountWithBankCardSql = "select * from t_account where bank_card = '" + bankCard + "'";
		return getAccountWithSql(conn, selectAccountWithBankCardSql);
	}

	public Account getAccountWithAccountId(Connection conn, int accountId) {
		String selectAccountWithAccountIdSql = "select * from t_account where account_id = " + accountId;
		return getAccountWithSql(conn, selectAccountWithAccountIdSql);
	}

	private Account getAccountWithSql(Connection conn, String sql) {
		Account account = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				account = new Account();
				account.setAccountId(rs.getInt(1));
				account.setBankCard(rs.getString(2));
				account.setBank(rs.getString(3));
				account.setBalance(rs.getDouble(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTools.closeStatementAndResultSet(rs, pstmt);
		}
		return account;
	}
}
