package daily.samples.certification.lambda;

interface IntEx2{
	boolean getValue(int val);
}

public class FuncInterfaceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntEx2 ie = (n) -> (n%2 == 0); // no compilation error
		System.out.println(ie.getValue(2));
		
//		IntEx2 ie2 = (m) -> (n%2 == 0); // n cannot be resolved to a variable
//		System.out.println(ie2.getValue(2));
		
//		IntEx2 ie3 = (n) -> (m%2 == 0); // m cannot be resolved to a variable
//		System.out.println(ie3.getValue(2));
		
//		IntEx2 ie4 = (m) -> (m%2 == 0); // no compilation error
//		int n = 2; //even number
//		System.out.println(ie4.getValue(n));

//		int n = 2; //even number
//		IntEx2 ie5 = (m) -> (n%2 == 0); // no compilation error - CONFUSING
//		System.out.println(ie5.getValue(n));
		
//		int n = 2; //even number // CONFUSING
//		IntEx2 ie5 = (n) -> (m%2 == 0); //Lambda expression's parameter n cannot redeclare another local variable defined in an enclosing scope. m cannot be resolved to a variable
//		System.out.println(ie5.getValue(n));
		
	}

}
