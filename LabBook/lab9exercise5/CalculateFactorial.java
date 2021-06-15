package lab9exercise5;

public class CalculateFactorial {
	
	
	public static int calculateFact(int n) {
		int result = 1;
		for(int i = 1; i <= n; i++) result *= i;
		return result;
	}

	public static void main(String[] args) {

		Factorial fac = CalculateFactorial::calculateFact;
		
		System.out.println(fac.test(5));
		
	}

}