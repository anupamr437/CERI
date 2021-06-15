/*Create a method which accepts an integer array, reverse the numbers in the array and returns
 *the resulting array in sorted order*/
package lab2;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		arr=getSorted(arr);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		sc.close();
	}
	static int[] getSorted(int arr[]) {
		int len=arr.length,t;
		for(int i=0;i<len;i++) {
			String temp=Integer.toString(arr[i]);
			StringBuilder sb=new StringBuilder(temp);
			sb.reverse();
			temp=sb.toString();
			arr[i]=Integer.parseInt(temp);
		}
		for(int i=0; i<len-1; i++)
			for(int j=i+1; j<len; j++) {
				if(arr[i]>arr[j]) {
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
		return arr;
	}

}
