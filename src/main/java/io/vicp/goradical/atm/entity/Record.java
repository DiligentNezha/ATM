package io.vicp.goradical.atm.entity;

import java.util.Date;

public class Record {
	private int recordId;
	private Account account;
	private int actionType;
	private double amount;
	private Date date;

	public int getRecordId() {
		return recordId;
	}

	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public int getActionType() {
		return actionType;
	}

	public void setActionType(int actionType) {
		this.actionType = actionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Record{" +
				"recordId=" + recordId +
				", account=" + account +
				", actionType=" + actionType +
				", amount=" + amount +
				", date=" + date +
				'}';
	}
}
