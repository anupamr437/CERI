package lab3;
import java.util.*;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println("Mirror Image:"+getImage(str));
		sc.close();
	}
	static String getImage(String str) {
		StringBuffer sb1=new StringBuffer(str);
		StringBuffer sb2=new StringBuffer(str);
		sb2.reverse();
		sb1.append("|");
		sb1.append(sb2);
		return sb1.toString();
	}
}
