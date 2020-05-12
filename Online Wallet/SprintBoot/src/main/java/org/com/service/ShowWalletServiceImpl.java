
package org.com.service;



import java.util.List;

import java.util.Optional;

import org.com.dao.WalletAccountDao;

import org.com.dao.WalletTransactionDao;
import org.com.model.WalletAccount;
import org.com.model.WalletTransaction;
import org.com.model.WalletUser;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;





@Service("walletCreationServiceImpl")

public class ShowWalletServiceImpl implements ShowWalletService{
   @Autowired

   WalletAccountDao accountDao;

   @Autowired

   WalletTransactionDao transactDao;


   WalletUser user;
   WalletAccount account;
   
public double showBalance(int uid) {

         return accountDao.getAccountBalance(uid);

   }

   public List<WalletTransaction> showTransactions(int uid){
   return transactDao.getTransaction(uid);

   }


   public Optional<Integer> getAccountId(int uid){
		
		return accountDao.getAccountId(uid);
	}



	public Optional<String> getAccountName(int uid) {
		
		return accountDao.getAccountName(uid);
	}



}

