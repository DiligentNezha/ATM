package io.vicp.goradical.atm.service;

import io.vicp.goradical.atm.dao.AccountDao;
import io.vicp.goradical.atm.dao.RecordDao;
import io.vicp.goradical.atm.tools.JDBCTools;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Savepoint;

public class AccountService {
	private AccountDao accountDao;
	private RecordDao recordDao;

	public AccountService(AccountDao accountDao, RecordDao recordDao) {
		this.accountDao = accountDao;
		this.recordDao = recordDao;
	}

	public int saveMoney(int accountId, double amount) {
		Connection conn = JDBCTools.getConnection();
		Savepoint sp = null;
		int result = 1;
		try {
			conn.setAutoCommit(false);
			sp = conn.setSavepoint();
			recordDao.balanceIncreaseRecord(conn, accountId, amount);
			accountDao.increaseBalance(conn, accountId, amount);
			conn.commit();
		} catch (Exception e) {
			result = 0;
			e.printStackTrace();
			try {
				conn.rollback(sp);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			JDBCTools.closeConnection(conn);
		}
		return result;
	}

	public int drawMoney(int accountId, double amount) {
		Connection conn = JDBCTools.getConnection();
		Savepoint sp = null;
		int result = 1;
		try {
			conn.setAutoCommit(false);
			sp = conn.setSavepoint();
			double balance = accountDao.getAccountWithAccountId(conn, accountId).getBalance();
			if (amount > balance) {
				result = 2;
				return result;
			}
			recordDao.balanceDecreaseRecord(conn, accountId, amount);
			accountDao.reduceBalance(conn, accountId, amount);
			conn.commit();
		} catch (Exception e) {
			result = 0;
			e.printStackTrace();
			try {
				conn.rollback(sp);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			JDBCTools.closeConnection(conn);
		}
		return result;
	}

}
