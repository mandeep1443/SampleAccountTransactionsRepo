package com.anz.sampleAccounts.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.anz.sampleAccounts.constants.ApplicationConstants;
import com.anz.sampleAccounts.dto.Account;
import com.anz.sampleAccounts.dto.Transaction;
import com.anz.sampleAccounts.exception.AccountNotExistForUserException;

/**
 * This class is created to interact with Database and get the required data 
 * Here for the purpose of this POC , I have mocked the data of DB and instantiated objects in constructor because if I have to get data
 * from DB then other user who is testing this application after downloading from GITHUB will have to setup all required data and tables.
 * But by doing this way now he can directly test the features by simplete downloading from GITHub  
 *  
 * 
 * @author Mandeep_Singh20
 *
 */
@Repository
public class AccountTransactionsDAO {
	
	/**
	 * Logger logger using SLF4J
	 */
	private static final Logger logger = LoggerFactory.getLogger(AccountTransactionsDAO	.class);
	
	List<Account> accountListForUser1 = new ArrayList<Account>();
	
	List<Account> accountListForUser2 = new ArrayList<Account>();
	
	/**
	 * For this POC purpose we have simulated the database objects and initialized in this constructor.
	 * But for actual scenario , we need to make DB connection to fetch the data.
	 * 
	 * Default constructor is used to create sample 
	 * account and Transaction related data for this POC
	 * 
	 */
	public AccountTransactionsDAO() {
		logger.info("Entering constructor : AccountTransactionsDAO");
		Account account1 = new Account(585309209, "SGSavings726", "Savings", LocalDate.of(2018, 11, 8).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)), ApplicationConstants.SGD, 84327.51, getTransactionsForAccount(ApplicationConstants.User1, 585309209));
		Account account2 = new Account(791066619, "AUSavings933", "Savings", LocalDate.of(2018, 11, 8).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)), ApplicationConstants.AUD, 88005.93, getTransactionsForAccount(ApplicationConstants.User1,791066619));
		Account account3 = new Account(321143048, "AUCurrent433", "Current", LocalDate.of(2018, 11, 8).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)), ApplicationConstants.AUD, 38010.62, getTransactionsForAccount(ApplicationConstants.User1,321143048));
		
		
		Account account4 = new Account(347786244, "SGCurrent166", "Current", LocalDate.of(2018, 11, 8).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)), ApplicationConstants.SGD, 34327.51, getTransactionsForAccount(ApplicationConstants.User2,347786244));
		Account account5 = new Account(680168913, "AUCurrent374", "Current", LocalDate.of(2018, 11, 8).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)), ApplicationConstants.AUD, 58005.93, getTransactionsForAccount(ApplicationConstants.User2,680168913));
		Account account6 = new Account(136056165, "AUSavings938", "Savings", LocalDate.of(2018, 11, 8).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)), ApplicationConstants.AUD, 88010.22, getTransactionsForAccount(ApplicationConstants.User2,136056165));
		
		
		accountListForUser1.add(account1);
		accountListForUser1.add(account2);
		accountListForUser1.add(account3);
		
		
		accountListForUser2.add(account4);
		accountListForUser2.add(account5);
		accountListForUser2.add(account6);
		
		logger.info("Exit constructor : AccountTransactionsDAO");
		

	}
/**
 * Function to get Transactions for specific account for a user
 * 
 * @param user
 * @param accountNumber
 * @return List<Transaction>
 */
	private List<Transaction> getTransactionsForAccount(String user , int accountNumber) {
		logger.info("Entering into AccountTransactionsDAO.getTransactionsForAccount");
		List<Transaction> transactionListForAccount = new ArrayList<Transaction>();
		if((ApplicationConstants.User1).equalsIgnoreCase(user) && accountNumber==585309209) {
			Transaction transaction1 =  new Transaction(LocalDate.of(2018, 10, 12).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.SGD, 0, 1000, "Credit", "");
			Transaction transaction2 =  new Transaction(LocalDate.of(2018, 10, 11).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.SGD, 0, 3000, "Credit", "");
			Transaction transaction3 =  new Transaction(LocalDate.of(2018, 10, 6).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.SGD, 0, 4000, "Credit", "");
			Transaction transaction4 =  new Transaction(LocalDate.of(2018, 9, 2).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.SGD, 0, 6000, "Credit", "");
			Transaction transaction5 =  new Transaction(LocalDate.of(2018, 9, 1).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.SGD, 0, 9000, "Credit", "");


			transactionListForAccount.add(transaction1);
			transactionListForAccount.add(transaction2);
			transactionListForAccount.add(transaction3);
			transactionListForAccount.add(transaction4);
			transactionListForAccount.add(transaction5);

		}else if((ApplicationConstants.User1).equalsIgnoreCase(user) && accountNumber==791066619) {

			Transaction transaction1 =  new Transaction(LocalDate.of(2018, 10, 12).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 1000, "Debit", "");
			Transaction transaction2 =  new Transaction(LocalDate.of(2018, 10, 11).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 3000, "Credit", "");
			Transaction transaction3 =  new Transaction(LocalDate.of(2018, 10, 6).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 4000, "Credit", "");
			Transaction transaction4 =  new Transaction(LocalDate.of(2018, 9, 2).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 6000, "Debit", "");
			Transaction transaction5 =  new Transaction(LocalDate.of(2018, 9, 1).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 9000, "Credit", "");


			transactionListForAccount.add(transaction1);
			transactionListForAccount.add(transaction2);
			transactionListForAccount.add(transaction3);
			transactionListForAccount.add(transaction4);
			transactionListForAccount.add(transaction5);

		}else if((ApplicationConstants.User1).equalsIgnoreCase(user) && accountNumber==321143048) {
			Transaction transaction1 =  new Transaction(LocalDate.of(2018, 10, 12).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 1000, "Debit", "");
			Transaction transaction2 =  new Transaction(LocalDate.of(2018, 10, 11).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 3000, "Credit", "");
			Transaction transaction3 =  new Transaction(LocalDate.of(2018, 10, 6).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 4000, "Credit", "");
			Transaction transaction4 =  new Transaction(LocalDate.of(2018, 9, 2).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 6000, "Debit", "");
			Transaction transaction5 =  new Transaction(LocalDate.of(2018, 9, 1).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 9000, "Credit", "");


			transactionListForAccount.add(transaction1);
			transactionListForAccount.add(transaction2);
			transactionListForAccount.add(transaction3);
			transactionListForAccount.add(transaction4);
			transactionListForAccount.add(transaction5);
		} else if((ApplicationConstants.User2).equalsIgnoreCase(user) && accountNumber==347786244) {
			Transaction transaction1 =  new Transaction(LocalDate.of(2018, 10, 12).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.SGD, 0, 1000, "Debit", "");
			Transaction transaction2 =  new Transaction(LocalDate.of(2018, 10, 11).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.SGD, 0, 3000, "Credit", "");
			Transaction transaction3 =  new Transaction(LocalDate.of(2018, 10, 6).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.SGD, 0, 4000, "Credit", "");
			Transaction transaction4 =  new Transaction(LocalDate.of(2018, 9, 2).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.SGD, 0, 6000, "Debit", "");
			Transaction transaction5 =  new Transaction(LocalDate.of(2018, 9, 1).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.SGD, 0, 9000, "Credit", "");


			transactionListForAccount.add(transaction1);
			transactionListForAccount.add(transaction2);
			transactionListForAccount.add(transaction3);
			transactionListForAccount.add(transaction4);
			transactionListForAccount.add(transaction5);
		} else if((ApplicationConstants.User2).equalsIgnoreCase(user) && accountNumber==680168913) {
			Transaction transaction1 =  new Transaction(LocalDate.of(2018, 10, 12).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 1000, "Debit", "");
			Transaction transaction2 =  new Transaction(LocalDate.of(2018, 10, 11).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 3000, "Credit", "");
			Transaction transaction3 =  new Transaction(LocalDate.of(2018, 10, 6).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 9000, "Credit", "");
			Transaction transaction4 =  new Transaction(LocalDate.of(2018, 9, 2).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 6000, "Debit", "");
			Transaction transaction5 =  new Transaction(LocalDate.of(2018, 9, 1).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 9000, "Credit", "");


			transactionListForAccount.add(transaction1);
			transactionListForAccount.add(transaction2);
			transactionListForAccount.add(transaction3);
			transactionListForAccount.add(transaction4);
			transactionListForAccount.add(transaction5);
		} else if((ApplicationConstants.User2).equalsIgnoreCase(user) && accountNumber==136056165) {
			Transaction transaction1 =  new Transaction(LocalDate.of(2018, 10, 12).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 2000, "Debit", "");
			Transaction transaction2 =  new Transaction(LocalDate.of(2018, 10, 11).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 3000, "Credit", "");
			Transaction transaction3 =  new Transaction(LocalDate.of(2018, 10, 6).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 4000, "Credit", "");
			Transaction transaction4 =  new Transaction(LocalDate.of(2018, 9, 2).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 2000, "Debit", "");
			Transaction transaction5 =  new Transaction(LocalDate.of(2018, 9, 1).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)), ApplicationConstants.AUD, 0, 11000, "Credit", "");


			transactionListForAccount.add(transaction1);
			transactionListForAccount.add(transaction2);
			transactionListForAccount.add(transaction3);
			transactionListForAccount.add(transaction4);
			transactionListForAccount.add(transaction5);
		} 
		logger.info("Exit from AccountTransactionsDAO.getTransactionsForAccount");
		return transactionListForAccount;
	}

	/**
	 * Function to fetch account details for user
	 * 
	 * @param userId
	 * @return List<Account>
	 * @throws AccountNotExistForUserException 
	 */
	public List<Account> fetchAccountDetailsForUser(String userId) throws AccountNotExistForUserException {
		logger.info("Entering into AccountTransactionsDAO.fetchAccountDetailsForUser");
		if((ApplicationConstants.User1).equalsIgnoreCase(userId)) {
			
			return accountListForUser1;
			
		}else if ((ApplicationConstants.User2).equalsIgnoreCase(userId)) {
			return accountListForUser2;
		}else {
			logger.error("Error occured in AccountTransactionsDAO.fetchAccountDetailsForUser");
			throw new AccountNotExistForUserException("No account exist for requested User Id");
		}
		
	}

	/**
	 * Function to fetch Transactions linked to account
	 * 
	 * @param user
	 * @param accountId
	 * @return List<Transaction>
	 */
	public List<Transaction> fetchAccountTransactions(String user , int accountId) {
		logger.info("Entering into AccountTransactionsDAO.fetchAccountTransactions");
		List<Transaction> transactionsList = getTransactionsForAccount(user , accountId);
		logger.info("Exit from AccountTransactionsDAO.fetchAccountTransactions");
		return transactionsList;
	}
	
	

}
