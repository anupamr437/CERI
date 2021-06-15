package lab9exercise1;

import java.util.Scanner;

public class ReturnExponent {
	
 public static void main(String[] args) {
	
	 Power valueExp = () -> {
		 	Scanner sc = new Scanner(System.in);
		 	System.out.print("Enter value of x: ");
		 	int x = sc.nextInt();
		 	System.out.print("Enter value of y: ");
		 	int y = sc.nextInt();
		 	sc.close();
		 	return (long) Math.pow(x, y);
		};
		System.out.println("x^y = "+ valueExp.powerOfX());
 	}
}