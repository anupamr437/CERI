package lab1;
import java.util.Scanner;
public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:");
		int n=sc.nextInt();
		System.out.println(checkNumber(n));
	}
	static boolean checkNumber(int n) {
		int ptr=10,preptr=10;
		while(n>0) {
			preptr=ptr;
			ptr=n%10;
			if(ptr>preptr)
				return false;
			n/=10;
		}
		return true;
	}

}
