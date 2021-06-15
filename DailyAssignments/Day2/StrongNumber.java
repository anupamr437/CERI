
import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int rem,sum=0,temp=n;
		while(temp>0) {
			rem=temp%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
			sum=sum+fact;
			temp/=10;
		}
		if(sum==n)
			System.out.println("Strong");
		else
			System.out.println("Not Strong");
	}

}
