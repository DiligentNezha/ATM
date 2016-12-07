package io.vicp.goradical.atm.dao;

import io.vicp.goradical.atm.entity.User;
import io.vicp.goradical.atm.tools.JDBCTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
	private UserAccountDao userAccountDao;

	public UserDao(){
	}

	public UserDao(UserAccountDao userAccountDao) {
		this.userAccountDao = userAccountDao;
	}

	public User getUserWithIdentityCard(Connection conn, String identityCard) {
		String selectUserWithIdentityCardSql = "select * from t_user where identity_card = '" + identityCard + "'";
		return getUserWithSql(conn, selectUserWithIdentityCardSql);
	}

	public User getUserWithUserId(Connection conn, int userId) {
		String selectUserWithUserIdSql = "select * from t_user where user_id = " + userId;
		return getUserWithSql(conn, selectUserWithUserIdSql);
	}

	public User getUserWithIdAndPsd(Connection conn, String identityCard, String password) {
		String selectUserWithIdAndPsdSql = "select * from t_user where identity_card = '" + identityCard + "' and password = '" + password + "'";
		return getUserWithSql(conn, selectUserWithIdAndPsdSql);
	}

	private User getUserWithSql(Connection conn, String sql) {
		User user = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user = new User();
				user.setUserId(rs.getInt(1));
				user.setUserName(rs.getString(2));
				user.setPassword(rs.getString(3));
				user.setIdentityCard(rs.getString(4));
				user.setAccountList(userAccountDao.getUserAccountListWithUserId(conn, rs.getInt(1)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTools.closeStatementAndResultSet(rs, pstmt);
		}
		return user;
	}

	public UserAccountDao getUserAccountDao() {
		return userAccountDao;
	}

	public void setUserAccountDao(UserAccountDao userAccountDao) {
		this.userAccountDao = userAccountDao;
	}
}
