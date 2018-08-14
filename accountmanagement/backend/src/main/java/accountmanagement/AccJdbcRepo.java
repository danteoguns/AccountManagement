package accountmanagement;

import org.springframework.data.repository.CrudRepository;
import accountmanagement.Account;

public interface AccJdbcRepo extends CrudRepository<Account, Long>{
	
}
