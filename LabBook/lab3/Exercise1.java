package lab3;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n, sum=0;
		System.out.println("Enter the Integers with space separating them:");
		String str=sc.nextLine();
		StringTokenizer st=new StringTokenizer(str," ");
		System.out.println("The integers are:");
		while(st.hasMoreTokens()) {
			String temp=st.nextToken();
			n=Integer.parseInt(temp);
			System.out.print(n+" ");
			sum+=n;
		}
		System.out.println("\nsum: "+sum);
		sc.close();
	}

}
