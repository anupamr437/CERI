import java.util.*;

public class DuplicateNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int arr[]=new int [10];
		while(n!=0)
		{
			int d=n%10;
			arr[d]++;
			n/=10;
		}

		for(int i=0;i<10;i++)
		{
			if(arr[i]>1)
			{
				System.out.println(i+" is duplicated.");
			}
		}
	}

}