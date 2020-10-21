package com.anz.sampleAccounts.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.sampleAccounts.dto.Account;
import com.anz.sampleAccounts.dto.Transaction;
import com.anz.sampleAccounts.exception.AccountNotExistForUserException;
import com.anz.sampleAccounts.service.AccountTransactionsService;

/**
 * This is the Rest controller class which will accept HTTP requests .
 * The function of this API can be tested using Postman tool
 * Also the functions can be tested using a test class  : SampleAccountDetailsForAnzApplicationTests.java
 * 
 * @author Mandeep_Singh20
 *
 */
@RestController
@RequestMapping("/accounts")
public class AccountTransactionsController {
	
	/**
	 * Logger logger using SLF4J
	 */
	private static final Logger logger = LoggerFactory.getLogger(AccountTransactionsController.class);
	
	@Autowired
	AccountTransactionsService accTransService;
	
	
	/**
	 * This function will fetch the account details for logged in user 
	 * 
	 * @param userId
	 * @return List<Account>
	 * @throws AccountNotExistForUserException
	 */
	@GetMapping(value = "/accountDetails/{user}")
	public List<Account> fetchAccountDetailsForUser(@PathVariable("user") String userId) throws AccountNotExistForUserException{
		logger.info("Entering into AccountTransactionsController.fetchAccountDetailsForUser");
		List<Account> accountList = accTransService.fetchAccountDetailsForUser(userId);
		
		logger.info("Exit from AccountTransactionsController.fetchAccountDetailsForUser");
		return accountList;	
	}
	
	/**
	 * Once the user has logged in to the application , 
	 * this function will be called when user selects any of his displayed accounts from Accounts screen
	 * This will display transactions linked to the selected account only.
	 * 
	 * @param user
	 * @param accountId
	 * @return List<Transaction>
	 */
	@GetMapping(value = "/accountDetails/{user}/transactions/{accountId}")
	public List<Transaction> fetchAccountTransactions(@PathVariable("user") String user, @PathVariable("accountId") int accountId ){
		logger.info("Entering into AccountTransactionsController.fetchAccountTransactions");
		List<Transaction> accTransList = accTransService.fetchAccountTransactions(user , accountId);
		
		logger.info("Exit from AccountTransactionsController.fetchAccountTransactions");
		return accTransList;	
	}

}
