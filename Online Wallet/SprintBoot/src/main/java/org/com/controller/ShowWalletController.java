package org.com.controller;
import java.util.List;
import java.util.Optional;

import org.com.dao.WalletAccountDao;
import org.com.dao.WalletTransactionDao;
import org.com.dao.WalletUserDao;


import org.com.model.WalletAccount;
import org.com.model.WalletTransaction;
import org.com.model.WalletUser;
import org.com.service.ShowWalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/wallet")
@CrossOrigin("http://localhost:4200")

public class ShowWalletController {

   @Autowired

ShowWalletService showService;

   @Autowired
WalletAccountDao  walletAccountdao;
   @Autowired
WalletTransactionDao walletTransactiondao;
   @Autowired
WalletUserDao walletuserdao;



//*******************************************
@GetMapping("/getUser")
public List<WalletAccount> getAllUser() {
	
	return walletAccountdao.findAll();
	
}
//****************************************************
   @RequestMapping("/showBalance/{id}")



   public double showBalance(@PathVariable("id") int uid) {



return  showService.showBalance(uid);


	}



//////////*******************************************************

   @RequestMapping("/showTransactions/{id}")


   public List<WalletTransaction> showTransactions(@PathVariable("id") int uid){
	   
return showService.showTransactions(uid);


}


   

   }



