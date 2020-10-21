package com.anz.sampleAccounts.dto;

import java.util.List;

/**
 * DTO class to hold Account related attributes
 * 
 * @author Mandeep_Singh20
 *
 */
public class Account {

	/**
	 * Attribute to hold accountNumber
	 */
	private int accountNumber;

	/**
	 * Attribute to hold accountName
	 */
	private String accountName;

	/**
	 * Attribute to hold accountType
	 */
	private String accountType;

	/**
	 * Attribute to hold balanceDate
	 */
	private String balanceDate;
	/**
	 * Attribute to hold currency
	 */
	private String currency;
	/**
	 * Attribute to hold balance
	 */
	private double balance;

	/**
	 * Parameterized constructor
	 * 
	 * @param accountNumber
	 * @param accountName
	 * @param accountType
	 * @param balanceDate
	 * @param currency
	 * @param balance
	 * @param transactionList
	 */
	public Account(int accountNumber, String accountName, String accountType, String balanceDate, String currency,
			double balance, List<Transaction> transactionList) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.balance = balance;
		this.transactionList = transactionList;
	}

	/**
	 * List to hold transactions
	 */
	private List<Transaction> transactionList;

	public List<Transaction> getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List<Transaction> transactionList) {
		this.transactionList = transactionList;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBalanceDate() {
		return balanceDate;
	}

	public void setBalanceDate(String balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
