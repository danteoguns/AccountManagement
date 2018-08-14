package com.qa.accountmanagement;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccService {
	
	@Autowired
	private AccJdbcRepo repo;
	
	public List getAllAccounts() {
		ArrayList<Object> accounts = new ArrayList<>();
		repo.findAll().forEach(accounts::add);
		
		return accounts;
	}
	
//	public Account getAccount(Long accountID) {
//		return repo.findById(accountID);
//	}
	
	public void addAccount(Account account) {
		repo.save(account);
	}

	public void updateAccount(Long accountID, Account account) {
		repo.save(account);
	}
	
	public void deleteAccount(Long accountID) {
		repo.deleteById(accountID);
	}
}
