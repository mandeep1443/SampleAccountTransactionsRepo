package com.anz.sampleAccounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * This is a advice class to handle for various type of exceptions
 * 
 * @author Mandeep_Singh20
 *
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {

	/**
	 * Function to handle AccountNotExistForUserException type of exceptions thrown
	 * from Rest API's
	 * 
	 * @param ex
	 * @return ResponseEntity<ErrorDetails>
	 */
	@ExceptionHandler(AccountNotExistForUserException.class)
	public ResponseEntity<ErrorDetails> exceptionHandler2(AccountNotExistForUserException ex) {
		ErrorDetails errDet = new ErrorDetails();
		errDet.setErrCode(HttpStatus.NOT_FOUND.toString());
		errDet.setErrMess(ex.getMessage());
		return new ResponseEntity<>(errDet, HttpStatus.OK);
	}
}
