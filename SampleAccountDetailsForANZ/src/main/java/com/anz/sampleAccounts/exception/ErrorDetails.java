package com.anz.sampleAccounts.exception;

/**
 * Class to hold Customized Error Details which can be returned as response
 * 
 * @author Mandeep_Singh20
 *
 */
public class ErrorDetails {
	/**
	 * to hold errCode
	 */
	private String errCode;

	/**
	 * to hold errMess
	 */
	private String errMess;

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getErrMess() {
		return errMess;
	}

	public void setErrMess(String errMess) {
		this.errMess = errMess;
	}

}
