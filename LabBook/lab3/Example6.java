package lab3;

import java.util.Scanner;

public class Example6 {

	static boolean checkPositive(String str) {
		for (int i = 0; i < str.length() - 1; i++)
			if ((int) str.charAt(i) > (int) (str.charAt(i + 1)))
				return false;
		return true;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();

		boolean ans = checkPositive(str);
		if (ans == true)
			System.out.println("Positive String");
		else
			System.out.println("Not a positive string");

		sc.close();
	}

}