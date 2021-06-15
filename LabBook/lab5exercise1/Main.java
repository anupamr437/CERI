package lab5exercise1;

import java.util.Scanner;

public class Main {
	static void validate(int age) throws ValidateAge {
		if (age < 15)
			throw new ValidateAge("\n* Exception cause: Age is less than 15.");
		else
			System.out.println("You are eligible for the next process!");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		try {
			validate(sc.nextInt());
		} catch (Exception e) {
			System.out.println("Exception occurred. Age is below the limit.\n" + e);
			System.out.println("------------------------------------------");
		}
		sc.close();
	}
}
