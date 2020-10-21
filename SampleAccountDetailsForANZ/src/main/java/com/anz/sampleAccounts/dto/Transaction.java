package com.anz.sampleAccounts.dto;

import java.time.LocalDate;

public class Transaction {
	
	private String valueDate;
	
	private String currency;
	
	private double debitAmount;
	
	private double creditAmount;
	
	private String mode;
	
	private String transactionNarative;

	 
	public Transaction(String valueDate, String currency, double debitAmount, double creditAmount, String mode,
			String transactionNarative) {
		this.valueDate = valueDate;
		this.currency = currency;
		this.debitAmount = debitAmount;
		this.creditAmount = creditAmount;
		this.mode = mode;
		this.transactionNarative = transactionNarative;
	}

	public String getValueDate() {
		return valueDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}

	public double getCreditAmount() {
		return creditAmount;
	}

	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getTransactionNarative() {
		return transactionNarative;
	}

	public void setTransactionNarative(String transactionNarative) {
		this.transactionNarative = transactionNarative;
	}
	
	
	

}
