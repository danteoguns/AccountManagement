package accountmanagement;

import org.springframework.stereotype.Component;

@Component
public class Account {

	private int accountID;
	private String firstName;
	private String lastName;
	private String accountNo;
	
	public Account(String firstName, String lastName, String accountNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNo = accountNo;
	}
	
	public int getAccountID() {
		return accountID;
	}
	public void setAccountID(int accountID) {
		this.accountID = accountID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
}
