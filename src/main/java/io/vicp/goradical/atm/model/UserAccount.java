package io.vicp.goradical.atm.model;

public class UserAccount {
	private int userAccountId;
	private User user;
	private Account account;

	public UserAccount() {
	}

	public int getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(int userAccountId) {
		this.userAccountId = userAccountId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "UserAccount{" +
				"userAccountId=" + userAccountId +
				", user=" + user +
				", account=" + account +
				'}';
	}
}
