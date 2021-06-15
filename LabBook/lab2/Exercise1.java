/*Create a method which accepts an array of integer elements and return the second smallest
 *element in the array*/
package lab2;
import java.util.Scanner;
public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0; i<n; i++)
			a[i]=sc.nextInt();
		System.out.println("Second smallest element:"+getSecondSmallest(a,n));
		sc.close();
	}
	static int getSecondSmallest(int[] a, int n) {
		int temp;
		for(int i=0; i<(n-1); i++)
			for(int j=i+1; j<n; j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		return a[1];
	}

}
