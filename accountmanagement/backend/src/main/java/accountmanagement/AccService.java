package accountmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class AccService {
	
	@Autowired
	private AccJdbcRepo repo;
	
	public List<Object> getAllAccounts() {
		List<Object> accounts = new ArrayList<>();
		repo.findAll().forEach(accounts::add);
		
		return accounts;
	}
	
	public Optional<Account> getAccount(Long accountID) {
		return repo.findById(accountID);
	}
	
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
