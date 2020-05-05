package org.com;

import org.com.model.WalletAccount;
import org.com.model.WalletTransaction;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

@SpringBootTest

class OnlineWallet3ApplicationTests {
	 static Logger logger = LoggerFactory.getLogger(OnlineWallet3ApplicationTests.class);
	 
	RestTemplate restTemplate;

	@BeforeEach
	public void setUp() {
		
		
		restTemplate = new RestTemplate();
		
	}
	/////////****************************************

	@Test
	public void showTransactionById()
	{
	
ResponseEntity<WalletTransaction> entity=
		restTemplate.getForEntity("http://localhost:9060/wallet/showTransactions/103",WalletTransaction.class );

Assertions.assertNotNull(entity);
logger.info("search for balance");

	}
	////////////******************************************************
	
	
	@Test
	public void showBalanceById() {

ResponseEntity<WalletAccount> entity1=
restTemplate.getForEntity("http://localhost:9060/wallet/showBalance/102",WalletAccount.class );


Assertions.assertNotNull(entity1);
logger.info("search for transaction histoy");


	}
	}



