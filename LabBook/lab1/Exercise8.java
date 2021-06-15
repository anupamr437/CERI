package lab1;
import java.util.Scanner;
public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:");
		int n=sc.nextInt();
		System.out.println(checkNumber(n));
	}
	static boolean checkNumber(int n) {
		double temp=n;
		while(temp>0) {
			temp/=2;
			if(temp==2.0)
				return true;
		}
		return false;
	}

}
