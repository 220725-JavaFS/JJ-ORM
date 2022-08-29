package com.revature.models;

public class Report {

//	account_Number SERIAL primary key, 
//	account_First_Name varchar(20),
//	account_Last_Name varchar(30),
//	account_Year varchar(10),
//	account_Grade int not null
	
	private int accountNumber;
	private String accountFirstName;
	private String accountLastName;
	private String accountYear;
	private int accountGrade;
	
	public Report(int accountNumber, String accountFirstName, String accountLastName, String accountYear,
			int accountGrade) {
		super();
		this.accountNumber = accountNumber;
		this.accountFirstName = accountFirstName;
		this.accountLastName = accountLastName;
		this.accountYear = accountYear;
		this.accountGrade = accountGrade;
	}

	public Report() {
		super();
	}
	
	public Report(String accountFirstName, String accountLastName, String accountYear, int accountGrade) {
		super();
		this.accountFirstName = accountFirstName;
		this.accountLastName = accountLastName;
		this.accountYear = accountYear;
		this.accountGrade = accountGrade;
	}

	//GETTER AND SETTER
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountFirstName() {
		return accountFirstName;
	}

	public void setAccountFirstName(String accountFirstName) {
		this.accountFirstName = accountFirstName;
	}

	public String getAccountLastName() {
		return accountLastName;
	}

	public void setAccountLastName(String accountLastName) {
		this.accountLastName = accountLastName;
	}

	public String getAccountYear() {
		return accountYear;
	}

	public void setAccountYear(String accountYear) {
		this.accountYear = accountYear;
	}

	public int getAccountGrade() {
		return accountGrade;
	}

	public void setAccountGrade(int accountGrade) {
		this.accountGrade = accountGrade;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountFirstName == null) ? 0 : accountFirstName.hashCode());
		result = prime * result + accountGrade;
		result = prime * result + ((accountLastName == null) ? 0 : accountLastName.hashCode());
		result = prime * result + accountNumber;
		result = prime * result + ((accountYear == null) ? 0 : accountYear.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Report other = (Report) obj;
		if (accountFirstName == null) {
			if (other.accountFirstName != null)
				return false;
		} else if (!accountFirstName.equals(other.accountFirstName))
			return false;
		if (accountGrade != other.accountGrade)
			return false;
		if (accountLastName == null) {
			if (other.accountLastName != null)
				return false;
		} else if (!accountLastName.equals(other.accountLastName))
			return false;
		if (accountNumber != other.accountNumber)
			return false;
		if (accountYear == null) {
			if (other.accountYear != null)
				return false;
		} else if (!accountYear.equals(other.accountYear))
			return false;
		return true;
	}

	@Override
	public String toString() {
//		return "Report [accountNumber=" + accountNumber + ", accountFirstName=" + accountFirstName
//				+ ", accountLastName=" + accountLastName + ", accountYear=" + accountYear + ", accountGrade="
//				+ accountGrade + "]";
		
		return "Student account #" + accountNumber + ": The Student is " + accountFirstName + " " + accountLastName + " that is currently a " + accountYear + 
				". The student currently has a score of: " + accountGrade + "." ;
	}
	
	
	

}
