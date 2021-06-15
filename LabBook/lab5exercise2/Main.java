package lab5exercise2;

import java.util.Scanner;

public class Main {
	static void validate(String firstName, String lastName) throws ValidateName {
		if (firstName.isEmpty() && lastName.isEmpty())
			throw new ValidateName("\nException cause: Whole name field is empty");
		else if (lastName.isEmpty())
			throw new ValidateName("\nException cause: Last Name field is empty");
		else if (firstName.isEmpty())
			throw new ValidateName("\nException cause: First Name field is empty");
		else
			System.out.println("Welcome to our Portal, " + firstName + " " + lastName + "!");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your firstname: ");
		String fName = sc.nextLine();
		System.out.print("Enter your lastname: ");
		String lName = sc.nextLine();
		try {
			validate(fName, lName);
		} catch (Exception e) {
			System.out.println("Exception occurred! Naming Convention Invalid\n" + e);
			System.out.println("-----------------------------------------");
		}
		sc.close();
	}
}