package lab4exercise1;

public class CurrentAccount extends Account {
	private double overdraftLimit;
	@Override
	public boolean withdraw(double amount) {
		overdraftLimit = getBalance();
		if (amount < overdraftLimit) {
			super.withdraw(amount);
			return true;
		}
		else {
			System.out.println("-----------------------------------------------");
			System.out.println(getName() + ", INR "+ amount + " can't be withdrawn. "
					+ "\nOverdraft limit reached!");
			System.out.println("Transaction failed!");
			System.out.println("-----------------------------------------------");
			return false;
		}
	}
}