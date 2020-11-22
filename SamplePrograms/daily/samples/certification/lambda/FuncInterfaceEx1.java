package daily.samples.certification.lambda;

interface IntEx1{
	double getValue();
}

//The type FuncInterfaceEx1 must implement the inherited abstract method IntEx1.getValue()
//If IMPLEMENTS keyword used then definition for the method is mandatory in the class
//public class FuncInterfaceEx1 implements IntEx1{
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		IntEx1 ie = () -> 12.35;
//		System.out.println(ie.getValue());
//	}
//
//}

//No Errors
public class FuncInterfaceEx1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntEx1 ie = () -> 12.35; //Result: 12.35
		//IntEx1 ie = () -> 12; //Result: 12.0
		//IntEx1 ie = () -> "ABCD"; //Compilation Error: Type mismatch: cannot convert from String to double
		
		System.out.println(ie.getValue());
	}

}