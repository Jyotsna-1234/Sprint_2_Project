package org.com;

import java.util.List;
import java.util.Optional;

import org.com.model.WalletAccount;
import org.com.model.WalletTransaction;
import org.com.model.WalletUser;
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
	
	@Test
	public void showTransactionById()
	{
	

		List<WalletTransaction>  entity=
				(List<WalletTransaction> )restTemplate.getForObject("http://localhost:9060/wallet/showTransactions/201",List.class );
Assertions.assertNotNull(entity);
logger.info("search for transaction histoy");
}
	
	@Test
	public void showBalanceById() {
		Optional <Integer> entity1=
				(Optional<Integer>) restTemplate.getForObject("http://localhost:9060/wallet/showBalance/102",Optional.class );
Assertions.assertNotNull(entity1);
logger.info("search for balance");
}
	
	@Test
	public void getAccountId() {
		
Optional <Integer> entity2=

(Optional<Integer>) restTemplate.getForObject("http://localhost:9060/wallet/getAccountId/101",Optional.class );
Assertions.assertNotNull(entity2);
logger.info("search for Account Id");
}
	
	
	@Test
	public void getAccountName() {
ResponseEntity<WalletAccount> entity3=
restTemplate.getForEntity("http://localhost:9060/wallet/getAccountName/103",WalletAccount.class );
Assertions.assertNotNull(entity3);
logger.info("search for Account Name");
	}
	
	


	}
	



