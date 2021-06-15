package lab1;
import java.util.*;
import java.lang.Math;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter:");
		int n=sc.nextInt(),rem,sum=0;
		double res;
		while(n>0) {
			rem=n%10;
			res=Math.pow(rem,3);
			sum+=res;
			n/=10;
		}
		System.out.println(sum);

	}

}
