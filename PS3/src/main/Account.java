package main;

import java.util.Date;


public class Account {

	/**
	 * • A private int data field named id for the account (default 0). • A
	 * private double data field named balance for the account (default 0). • A
	 * private double data field named annualInterestRate that stores the
	 * current interest rate (default 0). Assume all accounts have the same
	 * interest rate. • A private Date data field named dateCreated that stores
	 * the date when the account was created.
	 */

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	/** A no-arg constructor that creates a default account */
	public Account() {
		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;

	}

	/**
	 * • A constructor that creates an account with the specified id and initial
	 * balance.
	 */
	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
		/**
		 * • The accessor and mutator methods for id, balance, and
		 * annualInterestRate.
		 */
	}

	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	/** The accessor method for dateCreated. */
	public Date getDateCreated() {
		return dateCreated;
	}

	/**
	 * • A method named getMonthlyInterestRate() that returns the monthly
	 * interest rate.
	 */
	public double getMonthlyInterestRate(double monthly) {
		monthly = annualInterestRate / 12;

		return monthly;

	}

	/**
	 * • A method named withdraw that withdraws a specified amount from the
	 * account.
	 */
	public double withdraw(double amount) {
		return balance -= amount;
	}

	/**
	 * • A method named deposit that deposits a specified amount to the account.
	 */
	public double deposit(double amount) {
		return balance += amount;
	}

	public void withdrawNewLogic(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

}
