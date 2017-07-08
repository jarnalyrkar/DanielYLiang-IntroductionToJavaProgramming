package tk.proghodet.account;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private String dataCreated;
	
	public Account() {
		this.id = id++;
	}
	
	public Account(int id, double balance, double annualInterestRate, String dataCreated) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dataCreated = dataCreated;
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(Account a) {
		this.id = a.id;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(Account a){
		this.balance = a.balance;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public void setAnnualInterestRate(Account a) {
		this.annualInterestRate = a.annualInterestRate/100;
	}
	
	public double getMonthlyInterestRate() {
		return this.getAnnualInterestRate()/12;
	}
	
	public double getMonthlyInterest() {
		// TODO: Dummy-code
		return balance * this.getMonthlyInterestRate();
	}
	
	public void withdraw(double a) {
		// TODO: Dummy-code
		this.balance = this.balance - a;
	}
	
	public void deposit(double a) {
		// TODO: Dummy-code
		// Deposits money to an account
		this.balance = this.balance + a;
	}
	
	
	public String toString() {
		return "id: " + this.getId() + ", balance: " + this.getBalance() + ", annual interest rate: "
					  + this.getAnnualInterestRate() + ", date created: " + dataCreated;
	}
	
	
	
}
