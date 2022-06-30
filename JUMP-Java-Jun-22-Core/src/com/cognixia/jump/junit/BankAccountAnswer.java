package com.cognixia.jump.junit;

public class BankAccountAnswer {
	
	public static enum AccountType {
		CHECKING, SAVINGS
	}
	
	private int balance;
	private AccountType accountType;
	

	public BankAccountAnswer() {
		this(0, AccountType.CHECKING);
	}
	
	public BankAccountAnswer(int balance, AccountType accountType) {
		
		if(balance < 0) {
			this.balance = 0;
		}
		else {
			this.balance = balance;
		}
		
		//this.balance = balance;
		this.accountType = accountType;
	}

	
	public int getBalance() {
		return balance;
	}

	public AccountType getAccountType() { // no setter, once an account is set
		return accountType;				  // we don't want to change it
	}
	
	
	// will have a deposit and withdraw methods instead to change balance
	
	public void deposit(int amount) {
		//this.balance += amount;
		
		if(amount > 0) {
			this.balance += amount;
		}
	}
	
	public void withdraw(int amount) throws OverdraftException {
		//this.balance -= amount;
		
		if(amount > balance) {
			throw new OverdraftException(amount, balance);
		}
		else if(amount > 0) {
			this.balance -= amount;
		}
	}
	
	
	

}

