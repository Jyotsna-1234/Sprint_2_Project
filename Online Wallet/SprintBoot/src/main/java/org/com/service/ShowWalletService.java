
package org.com.service;



import java.util.List;



import org.com.model.WalletTransaction;

import org.com.model.WalletUser;

import org.springframework.stereotype.Component;



@Component

public interface ShowWalletService {



   public double showBalance(int uid);

   public List<WalletTransaction> showTransactions(int uid);

}