
package org.com.dao;



import java.util.Optional;

import javax.transaction.Transactional;

import org.com.model.WalletAccount;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;



@Repository

public interface WalletAccountDao extends JpaRepository<WalletAccount, Integer>{






	@Query( value = "select account_balance from wallet_account where user_id = :user_id", nativeQuery=true)
	double getAccountBalance(@Param("user_id") int user_id);
	
	
	@Query( value = "select account_id from wallet_account where user_id= :user_id ", nativeQuery=true)
	Optional<Integer> getAccountId(@Param("user_id") int user_id);
	
	
	@Query( value = "select user_name from wallet_user where user_id = (select user_id from wallet_account where account_id = :uid)", nativeQuery=true)
	Optional<String> getAccountName(@Param("uid")int uid);
}

