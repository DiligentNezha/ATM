package io.vicp.goradical.atm.entity;

public class ApplicationData {
	private static User currentUser;

//	static {
//		UserDao userDao = DaoManager.getDao(UserDao.class);
//		currentUser = userDao.getUserWithUserId(JDBCTools.getConnection(), 1);
//	}

	public static User getCurrentUser() {
		return currentUser;
	}

	public static void setCurrentUser(User currentUser) {
		ApplicationData.currentUser = currentUser;
	}
}
