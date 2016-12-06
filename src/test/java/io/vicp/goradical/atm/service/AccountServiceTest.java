package io.vicp.goradical.atm.service;

import io.vicp.goradical.atm.dao.AccountDao;
import io.vicp.goradical.atm.dao.DaoManager;
import io.vicp.goradical.atm.dao.RecordDao;
import org.junit.Test;

import java.util.Random;

public class AccountServiceTest {
	private AccountService accountService = new AccountService(DaoManager.getDao(AccountDao.class), DaoManager.getDao(RecordDao.class));

	@Test
	public void drawMoney() throws Exception {
		Random random = new Random();
		for(int i = 0; i < 100; i++) {
			System.out.println(accountService.drawMoney(random.nextInt(5) + 1, (random.nextInt(10) + 1) * 100));
		}
	}

	@Test
	public void saveMoney() throws Exception {
		Random random = new Random();
		for(int i = 0; i < 100; i++) {
			System.out.println(accountService.saveMoney(random.nextInt(5) + 1, (random.nextInt(10) + 1) * 100));
		}
	}

}