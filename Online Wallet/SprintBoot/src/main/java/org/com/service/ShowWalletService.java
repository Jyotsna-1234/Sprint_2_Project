
package org.com.service;



import java.util.List;
import java.util.Optional;

import org.com.model.WalletTransaction;

import org.com.model.WalletUser;

import org.springframework.stereotype.Component;



@Component

public interface ShowWalletService {



   public double showBalance(int uid);

   public List<WalletTransaction> showTransactions(int uid);
   public Optional<Integer> getAccountId(int uid);

public Optional<String> getAccountName(int uid);

}