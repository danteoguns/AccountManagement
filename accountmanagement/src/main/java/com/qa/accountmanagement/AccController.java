package com.qa.accountmanagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccController {

	@Autowired
	private AccService service;
	
	@RequestMapping(value = "/allaccounts", method = RequestMethod.GET)
	public List<Object> getAllAccounts() {
		return service.getAllAccounts();
	}
	
	@RequestMapping(value = "/allaccounts/{accountID}", method = RequestMethod.GET)
	public Account getAccount(@PathVariable Long accountID) {
		return service.getAccount(accountID);
	}
	
	@RequestMapping(value = "/allaccounts", method = RequestMethod.POST)
	public void addAccount(@RequestBody Account account) {
		service.addAccount(account);
	}
	
	@RequestMapping(value = "/allaccounts/{accountID}", method = RequestMethod.PUT)
	public void updateAccount(@RequestBody Account account, @PathVariable Long accountID) {
		service.updateAccount(accountID, account);
	}
	
	@RequestMapping(value = "/allaccounts/{accountID}", method = RequestMethod.DELETE)
	public void deleteAccount(@RequestBody Account account, @PathVariable Long accountID) {
		service.deleteAccount(accountID);
	}
	
}