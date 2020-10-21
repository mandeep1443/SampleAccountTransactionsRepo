package com.anz.sampleAccounts.dto;

/**
 * DTO class to hold Transaction details
 * 
 * @author Mandeep_Singh20
 *
 */
public class Transaction {
	/**
	 * Attribute to hold valueDate
	 */
	private String valueDate;
	/**
	 * Attribute to hold currency
	 */
	private String currency;
	/**
	 * Attribute to hold debitAmount
	 */
	private double debitAmount;
	/**
	 * Attribute to hold creditAmount
	 */
	private double creditAmount;
	/**
	 * Attribute to hold mode
	 */
	private String mode;
	/**
	 * Attribute to hold transactionNarative
	 */
	private String transactionNarative;

	/**
	 * Parameterized constructor
	 * 
	 * @param valueDate
	 * @param currency
	 * @param debitAmount
	 * @param creditAmount
	 * @param mode
	 * @param transactionNarative
	 */
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
