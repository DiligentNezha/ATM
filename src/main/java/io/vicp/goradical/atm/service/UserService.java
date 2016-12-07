package io.vicp.goradical.atm.service;

import io.vicp.goradical.atm.dao.UserDao;
import io.vicp.goradical.atm.entity.User;
import io.vicp.goradical.atm.tools.JDBCTools;

import java.sql.Connection;

public class UserService {
	private UserDao userDao;

	public UserService(UserDao userDao) {
		this.userDao = userDao;
	}

	public User login(String identityCard, String password) {
		Connection conn = JDBCTools.getConnection();
		User user = userDao.getUserWithIdAndPsd(conn, identityCard, password);
		return user;
	}

}
