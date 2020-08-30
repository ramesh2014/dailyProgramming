package daily.samples.recurssion;

public class Factorial {
	
	static int FactorialCalc(int n) {
		
		if (n == 0 || n == 1)
			return n;
		else
			n = n * FactorialCalc(n-1);
			
		return n;
	}
	
	public static void main(String[] args) {
		
		int factNum = 10;
		System.out.println("Factorial of "+factNum+" is "+FactorialCalc(factNum));
		
	}

}
