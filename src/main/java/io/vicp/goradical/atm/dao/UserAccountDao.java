package io.vicp.goradical.atm.dao;

import io.vicp.goradical.atm.entity.Account;
import io.vicp.goradical.atm.tools.JDBCTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserAccountDao {
	private UserDao userDao;
	private AccountDao accountDao;

	public UserAccountDao(UserDao userDao, AccountDao accountDao) {
		this.userDao = userDao;
		this.accountDao = accountDao;
	}

	public List<Account> getUserAccountListWithUserId(Connection conn, int userId) {
		List<Account> userAccountList = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectUserAccountListWithUserAccountIdSql = "select account from t_user_account where user = ?";
		try {
			pstmt = conn.prepareStatement(selectUserAccountListWithUserAccountIdSql);
			pstmt.setInt(1, userId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Account account = accountDao.getAccountWithAccountId(conn, rs.getInt(1));
				userAccountList.add(account);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTools.closeStatementAndResultSet(rs, pstmt);
		}
		return userAccountList;
	}

	public AccountDao getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
}
