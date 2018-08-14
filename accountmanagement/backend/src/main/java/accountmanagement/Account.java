package accountmanagement;

import javax.persistence.*;

@Entity
@Table(name="account")
public class Account {
	@Id
	@GeneratedValue
	private Long accountID;
	
	@Column(name ="first_name")
	private String firstName;
	
	@Column(name ="last_name")
	private String lastName;
	
	@Column(name ="account_number")
	private String accountNo;
	
	public Account(String firstName, String lastName, String accountNo) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountNo = accountNo;
	}
	
	public Long getAccountID() {
		return accountID;
	}
	public void setAccountID(Long accountID) {
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
	
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", accountNo=" + accountNo + ", getAccountID()=" + getAccountID() + ", getFirstName()="
				+ getFirstName() + ", getLastName()=" + getLastName() + ", getAccountNo()=" + getAccountNo() + "]";
	}
}
