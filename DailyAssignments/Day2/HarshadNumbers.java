import java.util.*;
public class HarshadNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Input number:");
		int n=sc.nextInt();
		int temp=n,rem,sum=0;
		
		while(temp>0) {
			rem=temp%10;
			sum+=rem;
			temp/=10;
		}
		if(n%sum==0) {
			System.out.println(n+" is a Harshad Number.");
		}
		else
			System.out.println(n+" is not a Harshad Number.");
	}

}
