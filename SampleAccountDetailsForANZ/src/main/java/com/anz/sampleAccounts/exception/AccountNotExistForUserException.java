package com.anz.sampleAccounts.exception;

/**
 * Customized Exception class to hold information when Account not exist
 * 
 * @author Mandeep_Singh20
 *
 */
public class AccountNotExistForUserException extends Exception {
	
	/**
	 * serial version id
	 */
	private static final long serialVersionUID = -8258658187970437152L;
	/**
	 * to hold errorCode
	 */
	private String errorCode;
	/**
	 * to hold errorMessage
	 */
	private String errorMessage;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public AccountNotExistForUserException(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public AccountNotExistForUserException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AccountNotExistForUserException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public AccountNotExistForUserException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public AccountNotExistForUserException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public AccountNotExistForUserException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
