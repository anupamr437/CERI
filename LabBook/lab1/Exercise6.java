package lab1;
import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter: ");
		int n=sc.nextInt();
		System.out.println(calculateDifference(n));
	}
	static int calculateDifference(int n) {
		int sumOfSq=0,sqOfSum=0,sum=0;
		for(int i=1;i<=n;i++) {
			sumOfSq+=i*i;
			sum+=i;
		}
		sqOfSum=sum*sum;
		return(sumOfSq-sqOfSum);
	}

}
