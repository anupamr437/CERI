package lab1;
import java.util.Scanner;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter:");
		int n=sc.nextInt(),c;
		for(int i=2;i<=n;i++) {
			c=0;
			for(int j=1; j<=i/2; j++) {
				if(i%j==0)
					c+=1;
			}
			if(c==1)
				System.out.print(i+" ");
		}
	}

}
