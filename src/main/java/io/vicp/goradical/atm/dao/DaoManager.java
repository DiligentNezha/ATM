package io.vicp.goradical.atm.dao;

import java.util.HashMap;
import java.util.Map;

public class DaoManager {
	private static final Map<Class, Object> daoMap = new HashMap<>();

	static {
		init();
	}

	private static void init() {
		UserDao userDao = new UserDao();
		daoMap.put(UserDao.class, userDao);

		AccountDao accountDao = new AccountDao();
		daoMap.put(AccountDao.class, accountDao);

		UserAccountDao userAccountDao = new UserAccountDao(userDao, accountDao);
		daoMap.put(UserAccountDao.class, userAccountDao);

		RecordDao recordDao = new RecordDao(accountDao);
		daoMap.put(RecordDao.class, recordDao);

		userDao.setUserAccountDao(userAccountDao);
	}

	public static <T> T getDao(Class<T> cla) {
		return (T) daoMap.get(cla);
	}

	public static Map<Class, Object> getDaoMap() {
		return daoMap;
	}
}
