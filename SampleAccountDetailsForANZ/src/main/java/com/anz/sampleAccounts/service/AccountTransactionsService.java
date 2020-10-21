package com.anz.sampleAccounts.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anz.sampleAccounts.dao.AccountTransactionsDAO;
import com.anz.sampleAccounts.dto.Account;
import com.anz.sampleAccounts.dto.Transaction;
import com.anz.sampleAccounts.exception.AccountNotExistForUserException;

/**
 * This is a service class 
 * 
 * @author Mandeep_Singh20
 *
 */
@Service
public class AccountTransactionsService {
	
	/**
	 * Logger logger using SLF4J
	 */
	private static final Logger logger = LoggerFactory.getLogger(AccountTransactionsService.class);
	
	@Autowired
	AccountTransactionsDAO accTransDAO;

	public List<Account> fetchAccountDetailsForUser(String userId) throws AccountNotExistForUserException {
		logger.info("Entering into AccountTransactionsService.fetchAccountDetailsForUser");
		List<Account> accountList = accTransDAO.fetchAccountDetailsForUser(userId);
		logger.info("Exit from AccountTransactionsService.fetchAccountDetailsForUser");
		return accountList;
	}

	public List<Transaction> fetchAccountTransactions(String user , int accountId) {
		logger.info("Entering into AccountTransactionsService.fetchAccountTransactions");
		List<Transaction> accTransList =  accTransDAO.fetchAccountTransactions(user, accountId);
		logger.info("Exit from AccountTransactionsService.fetchAccountTransactions");
		return accTransList;
	}
	
	

}
