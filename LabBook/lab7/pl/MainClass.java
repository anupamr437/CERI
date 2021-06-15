package lab7.pl;

import eis.service.EmpService;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);

		EmpService emp1 = new EmpService();
		emp1.getDetails();
		emp1.insuranceScheme();
		emp1.empDetails();

		sc1.close();
		sc2.close();
	}
}