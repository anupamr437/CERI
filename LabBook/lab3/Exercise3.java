/*Create a method which accepts a String and replaces all the consonants in the String with
 *the next alphabet. 
 */
package lab3;
import java.util.Scanner;
public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise3 e=new Exercise3();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		System.out.println(e.alterString(str));
		sc.close();
		
	}
	public String alterString(String str) {
		StringBuffer sb=new StringBuffer(str);
		for(int i=0; i<str.length(); i++) {
			char c=sb.charAt(i);
			if(!(c=='A'||c=='a'||c=='E'||c=='e'||c=='I'||c=='i'||
					c=='O'||c=='o'||c=='U'||c=='u'))
				sb.replace(i, i+1, String.valueOf((char)(c+1)));
		}
		return sb.toString();
	}

}
