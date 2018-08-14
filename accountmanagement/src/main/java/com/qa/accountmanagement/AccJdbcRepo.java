package com.qa.accountmanagement;

import org.springframework.data.repository.CrudRepository;
import com.qa.accountmanagement.Account;

public interface AccJdbcRepo extends CrudRepository<Account, Long>{
	
}
