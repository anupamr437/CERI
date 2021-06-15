package lab4exercise1;

public class Main {

	public static void main(String[] args) {
		
		SavingsAccount smith = new SavingsAccount();
		CurrentAccount kathy = new CurrentAccount();

		smith.setName("Smith");
		smith.setAge(25);
		smith.setBalance(2000);
		smith.setAccNum(12345);

		kathy.setName("Kathy");
		kathy.setAge(29);
		kathy.setBalance(3000);
		kathy.setAccNum(67890);

		System.out.println("Smith has: INR " + smith.getBalance());
		System.out.println("Kathy has: INR " + kathy.getBalance());
		
		smith.deposit(2000);
		System.out.println("Smith's present bank balace: INR " + smith.getBalance());
		kathy.withdraw(2000);
		System.out.println("Kathy has: INR " + kathy.getBalance());
		
		smith.withdraw(3600);
		kathy.withdraw(1100);
	}

}
