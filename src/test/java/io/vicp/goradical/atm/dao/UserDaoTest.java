package io.vicp.goradical.atm.dao;

import io.vicp.goradical.atm.model.User;
import io.vicp.goradical.atm.tools.JDBCTools;
import org.junit.Test;

import java.sql.Connection;

public class UserDaoTest {
	private UserDao userDao = DaoManager.getDao(UserDao.class);

	@Test
	public void getUserWithIdAndPsd() throws Exception {
		Connection conn = JDBCTools.getConnection();
		User user = userDao.getUserWithIdAndPsd(conn, "610424199203214526", "123456");
		System.out.println(user);
		JDBCTools.closeConnection(conn);
	}

	@Test
	public void getUserWithIdentityCard() throws Exception {
		Connection conn = JDBCTools.getConnection();
		User user = userDao.getUserWithIdentityCard(conn, "610424199203214526");
		System.out.println(user);
		JDBCTools.closeConnection(conn);
	}

	@Test
	public void getUserWithUserId() throws Exception {
		Connection conn = JDBCTools.getConnection();
		User user = userDao.getUserWithUserId(conn, 2);
		System.out.println(user);
		JDBCTools.closeConnection(conn);
	}
}