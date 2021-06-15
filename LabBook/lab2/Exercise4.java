/*Create a method which accepts an integer array and removes all the duplicates in the array.
 *Return the resulting array in descending order*/
package lab2;
import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0; i<n; i++)
			arr[i]=sc.nextInt();
		sc.close();
		arr=modifyArray(arr);
		int len=arr.length;
		for(int i=0; i<len; i++)
			System.out.print(arr[i]+" ");
	}
	static int[] modifyArray(int[] arr) {
		int len=arr.length,j=0;
		Arrays.sort(arr);
		int[] temp=new int[len];
		for(int i=0; i<len-1; i++)
			if(arr[i]!=arr[i+1])
				temp[j++]=arr[i];
		temp[j++]=arr[len-1];
		int[] b=new int[j];
		for (int i=0; i<j; i++) 
            b[j-i-1] = temp[i];  
		return b;
	}

}
