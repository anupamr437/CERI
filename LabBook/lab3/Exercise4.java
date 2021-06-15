package lab3;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to modify: ");
		int num = sc.nextInt();

		System.out.println(modifyNumber(num));
		sc.close();

	}

	static int modifyNumber(int number1) {
		String arr = Integer.toString(number1);
		StringBuffer ans = new StringBuffer("");
		int i;
		for (i = 0; i < arr.length() - 1; i++) {
			int diff = Math.abs(charToInt(arr.charAt(i + 1)) - charToInt(arr.charAt(i)));
			ans.append(diff);
		}
		ans.append(charToInt(arr.charAt(i)));
		return Integer.parseInt(ans.toString());
	}

	static int charToInt(char c) {
		return Character.getNumericValue(c);
	}
}