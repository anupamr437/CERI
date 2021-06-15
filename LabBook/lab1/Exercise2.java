package lab1;
import java.util.Scanner;
public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Press:\nR for Red.\nY for Yellow.\nG for Green.");
		char c=sc.next().charAt(0);
		switch(c) {
		case 'R':
			System.out.println("STOP");
			break;
		case 'Y':
			System.out.println("READY");
			break;
		case 'G':
			System.out.println("GO");
			break;
		default:
			System.out.println("enter a valid choice");
		}
	}

}
