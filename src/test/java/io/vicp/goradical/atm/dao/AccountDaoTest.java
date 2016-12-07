package io.vicp.goradical.atm.dao;

import io.vicp.goradical.atm.entity.Account;
import io.vicp.goradical.atm.tools.JDBCTools;
import org.junit.Test;

import java.sql.Connection;

public class AccountDaoTest {
	private AccountDao accountDao = DaoManager.getDao(AccountDao.class);

	@Test
	public void saveMoney() throws Exception {
		Connection conn = JDBCTools.getConnection();
		System.out.println(accountDao.increaseBalance(conn, 1, 1000));
		JDBCTools.closeConnection(conn);
	}

	@Test
	public void drawMoney() throws Exception {
		Connection conn = JDBCTools.getConnection();
		System.out.println(accountDao.reduceBalance(conn, 1, 500));
		JDBCTools.closeConnection(conn);
	}

	@Test
	public void getAccountWithBankCard() throws Exception {
		Connection conn = JDBCTools.getConnection();
		Account account = accountDao.getAccountWithBankCard(conn, "6227078230050231");
		System.out.println(account);
		JDBCTools.closeConnection(conn);
	}

	@Test
	public void getAccountWithAccountId() throws Exception {
		Connection conn = JDBCTools.getConnection();
		Account account = accountDao.getAccountWithAccountId(conn, 1);
		System.out.println(account);
		JDBCTools.closeConnection(conn);
	}
}