package io.vicp.goradical.atm.model;

public class Account {
	private int accountId;
	private String bankCard;
	private String bank;
	private double balance;

	public Account() {
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getBankCard() {
		return bankCard;
	}

	public void setBankCard(String bankCard) {
		this.bankCard = bankCard;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account{" +
				"accountId=" + accountId +
				", bankCard='" + bankCard + '\'' +
				", bank='" + bank + '\'' +
				", balance=" + balance +
				'}';
	}
}
