
package org.com.dao;



import java.util.List;
import java.util.Optional;

import org.com.model.WalletAccount;
import org.com.model.WalletUser;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;



@Repository

public interface WalletUserDao extends JpaRepository<WalletAccount, Integer>{
	
	@Query( value = "select user_name from wallet_user where user_id = (select user_id from wallet_account where account_id = :account_id) ", nativeQuery=true)
	Optional<String> getAccountUserId(@Param("account_id") Integer account_id);

}

