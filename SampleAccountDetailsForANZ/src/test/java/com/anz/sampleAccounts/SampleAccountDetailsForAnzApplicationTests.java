package com.anz.sampleAccounts;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.anz.sampleAccounts.constants.ApplicationConstants;
import com.anz.sampleAccounts.controller.AccountTransactionsController;
import com.anz.sampleAccounts.dto.Account;
import com.anz.sampleAccounts.dto.Transaction;
import com.anz.sampleAccounts.exception.AccountNotExistForUserException;

/**
 * This is a test class created to test functionalities present in
 * AccountTransactionsController Api I have created positive and negative test
 * cases for each of the functionalities This test class should be run as
 * SpringBootTest only, as I'm are not using mocking here.
 * 
 * @author Mandeep_Singh20
 *
 */
@SpringBootTest
class SampleAccountDetailsForAnzApplicationTests {

	/**
	 * Logger logger using SLF4J
	 */
	private static final Logger logger = LoggerFactory.getLogger(SampleAccountDetailsForAnzApplicationTests.class);

	@Autowired
	AccountTransactionsController accountsApi;

	@Test
	void contextLoads() {
	}

	/**
	 * This test case is for testing the positive case of fetchAccountDetailsForUser
	 * service of AccountTransactionsController API Test. 
	 * Scenario : When service is called with valid users
	 */
	@Test
	public void fetchAccountDetailsForValidUser() {

		try {
			logger.info("Start of test for fetchAccountDetailsForValidUser");

			List<Account> accountsForUser1 = accountsApi.fetchAccountDetailsForUser(ApplicationConstants.User1);

			List<Account> accountsForUser2 = accountsApi.fetchAccountDetailsForUser(ApplicationConstants.User2);

			assertTrue((!accountsForUser1.isEmpty() && !accountsForUser2.isEmpty()));
			logger.info("End of test for fetchAccountDetailsForValidUser");
		} catch (AccountNotExistForUserException e) {
			logger.error("Account not exist for requested user : " + " " + e.getMessage());
		}

	}

	/**
	 * This test case is for testing the negative case of fetchAccountDetailsForUser
	 * service of AccountTransactionsController API Test. 
	 * Scenario : When service is called with some invalid user for which no account exist.
	 */
	@Test
	public void fetchAccountDetailsForInvalidUser() {
		logger.info("Start of test for fetchAccountDetailsForInvalidUser");
		List<Account> accountsForUser1 = null;
		try {
			accountsForUser1 = accountsApi.fetchAccountDetailsForUser(ApplicationConstants.User3);

			logger.info("End of test for fetchAccountDetailsForInvalidUser");
		} catch (AccountNotExistForUserException e) {
			logger.error("Account not exist for requested user : " + " " + e.getMessage());
			assertTrue(accountsForUser1 == null);

		}

	}

	/**
	 * This test case is for testing the positive case of fetchAccountTransactions
	 * service of AccountTransactionsController API Test,
	 * Scenario : When service is called to fetch all transactions of selected valid account
	 */
	@Test
	public void fetchAccountTransactionsForValidAccount() {
		logger.info("Start of test for fetchAccountTransactionsForValidAccount");

		List<Transaction> accountTransactions = accountsApi.fetchAccountTransactions(ApplicationConstants.User1, 585309209);

		assertTrue(!accountTransactions.isEmpty());

		logger.info("End of test for fetchAccountTransactionsForValidAccount");

	}

	/**
	 * This test case is for testing the negative case of fetchAccountTransactions
	 * service of AccountTransactionsController API Test. 
	 * Scenario : When service is called to fetch all transactions of selected Invalid 
	 * account which does not exist
	 */
	@Test
	public void fetchAccountTransactionsForInvalidAccount() {
		logger.info("Start of test for fetchAccountTransactionsForInvalidAccount");

		List<Transaction> accountTransactions = accountsApi.fetchAccountTransactions(ApplicationConstants.User1, 585309899);

		assertTrue(accountTransactions.isEmpty());

		logger.info("End of test for fetchAccountTransactionsForInvalidAccount");
	}
}
