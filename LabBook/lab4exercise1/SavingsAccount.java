package lab4exercise1;

public class SavingsAccount extends Account {
	final private int minimumBalance = 500;

	@Override
	public boolean withdraw(double amount) {
		if (amount < minimumBalance) {
			
			super.withdraw(amount);
			return true;
		}
		else {
			System.out.println("-----------------------------------------------");
			System.out.println(getName() + ", INR "+ amount + " can't be withdrawn. "
					+ "\nBalance must be atleast INR " + minimumBalance + "!\nTransaction failed!");
			return false;
		}
	}
}
