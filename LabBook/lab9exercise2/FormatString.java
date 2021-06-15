package lab9exercise2;

import java.util.Scanner;

public class FormatString {
	
	   public static void main(String[] args) {
		   
		Space formattedStr = ()-> {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a string: ");
			String str = sc.next();
			sc.close();
			return str.replace(""," ").trim();
		};
		
		System.out.println("Output string: "+ formattedStr.addSpace());
	}
}