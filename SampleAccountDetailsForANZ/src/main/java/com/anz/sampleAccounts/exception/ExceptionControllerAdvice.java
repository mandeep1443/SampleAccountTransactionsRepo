package com.anz.sampleAccounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {
	
	@ExceptionHandler(AccountNotExistForUserException.class)
	public ResponseEntity<ErrorDetails> exceptionHandler2(AccountNotExistForUserException ex) {
		ErrorDetails errDet =  new ErrorDetails();
		errDet.setErrCode(HttpStatus.NOT_FOUND.toString());
		errDet.setErrMess(ex.getMessage());
		return new ResponseEntity<>(errDet, HttpStatus.OK);
	}
}
