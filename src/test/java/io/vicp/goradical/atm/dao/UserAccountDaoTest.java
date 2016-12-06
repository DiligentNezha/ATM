package io.vicp.goradical.atm.dao;

import io.vicp.goradical.atm.model.Account;
import io.vicp.goradical.atm.tools.JDBCTools;
import org.junit.Test;

import java.sql.Connection;
import java.util.List;

public class UserAccountDaoTest {
	private UserDao userDao = new UserDao();
	private AccountDao accountDao = new AccountDao();
	private UserAccountDao userAccountDao = new UserAccountDao(userDao, accountDao);

	@Test
	public void getUserAccountListWithUserId() throws Exception {
		Connection conn = JDBCTools.getConnection();
		List<Account> accountList = userAccountDao.getUserAccountListWithUserId(conn, 1);
		for (Account account : accountList) {
			System.out.println(account);
		}
		JDBCTools.closeConnection(conn);
	}

}