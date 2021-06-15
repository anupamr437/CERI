package lab4exercise1;

public class Account extends Person {
	private long accNum;
	private double balance;
	private Person accHolder;

	public boolean deposit(double amount) {
		balance += amount;
		System.out.println("-----------------------------------------------");
		System.out.println("Deposited INR " + amount + " by " + getName());
		return true;
	}

	public boolean withdraw(double amount) {
		balance -= amount;
		System.out.println("-----------------------------------------------");
		System.out.println("Withdrawn INR " + amount + " by " + getName());
		return true;
	}
	
	//setters
	public void setAccNum(long newAccNum) {
		this.accNum = newAccNum;
	}
	
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	
	//getters
	public long getAccNum() {
		return accNum;
	}

	public double getBalance() {
		return balance;
	}
	
}
