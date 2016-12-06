package io.vicp.goradical.atm.service;

import io.vicp.goradical.atm.dao.DaoManager;
import io.vicp.goradical.atm.dao.UserDao;
import org.junit.Test;

public class UserServiceTest {
	private UserService userService = new UserService(DaoManager.getDao(UserDao.class));

	@Test
	public void login() throws Exception {
		System.out.println(userService.login("610424199203214526", "123456"));
	}

}