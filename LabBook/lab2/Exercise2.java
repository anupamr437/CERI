/*Create a method that can accept an array of String objects and sort in alphabetical order.
 *The elements in the left half should be completely in uppercase and the elements in the right
 *half should be completely in lower case. Return the resulting array.
 *Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
*/
package lab2;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of String Array:");
		int n=sc.nextInt();
		String[] s=new String[n+1];
		System.out.println("Enter the String elements:");
		for(int i=0;i<=n;i++)
			s[i]=sc.nextLine();
		sc.close();
		System.out.println("The Sorted String is:");
		s=sortStrings(s);
		for(int i=0;i<=n;i++) {
			System.out.print(s[i]+" ");
		}
	}
	static String[] sortStrings(String[] s) {
		int len=s.length;
		String temp;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++)
				if(s[i].compareTo(s[j])>0) {
					temp=s[i];
					s[i]=s[j];
					s[j]=temp;
			}
			if(i<=len/2)
				s[i]=s[i].toUpperCase();
			else
				s[i]=s[i].toLowerCase();
		}
		return s;	
	}

}
