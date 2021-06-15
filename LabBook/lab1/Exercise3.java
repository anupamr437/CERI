package lab1;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:");
		int n=sc.nextInt();
		System.out.println("NonRecursive:");
		System.out.println(nonRecursive(n));
		System.out.println("Recursive:");
		System.out.println(recursive(n));
	}
	static int nonRecursive(int n) {
		if (n<=2)
			return 1;
		int a=1,b=1,c=0;
		for(int i=0;i<n-2;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	static int recursive(int n) {
		if(n<=2)
			return 1;
		return recursive(n-1)+recursive(n-2);
	}
}
