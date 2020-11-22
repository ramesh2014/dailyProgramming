package daily.samples.certification.lambda;

//A lambda expression is, essentially, an anonymous (that is, unnamed) method. However, this method is not executed on its own. Instead, it is used to implement a method defined by a 
//functional interface. Thus, a lambda expression results in a form of anonymous class. Lambda expressions are also commonly referred to as closures.

//A functional interface is an interface that contains one and only one abstract method. 
//Normally, this method specifies the intended purpose of the interface. Thus, a functional interface typically represents a single action. 

//Runnable - is a Functional Interface, defines only one method - run()
//FI - defines the target type of a lambda expression. Lambda expression can be used only in a context in which its target type is specified.
//FI - referred as SAM Type = Single Abstract Method
//the lambda operator or the arrow operator, is −>

//It divides a lambda expression into two parts. The left side specifies any parameters required by the lambda expression. 
//(If no parameters are needed, an empty parameter list is used.) On the right side is the lambda body, which specifies the actions of the lambda expression. 
//The −> can be verbalized as “becomes” or “goes to.”

//Java defines two types of lambda bodies. One consists of a single expression, and the other type consists of a block of code.
//() -> 123.45 => double myMeth() { return 123.45; } . Of course, the method defined by a lambda expression does not have a name.
//() -> Math.random() * 100
//(n) -> (n % 2)==0, returns true if n is even.

//As stated, a functional interface is an interface that specifies only one abstract method. If you have been programming in Java for some time, 
//you might at first think that all interface methods are implicitly abstract. Although this was true prior to JDK 8, the situation has changed.
//Private and static interface methods also supply an implementation. As a result, today, an interface method is abstract only if it does not specify an implementation. 
//Because non-default non-static, non-private interface methods are implicitly abstract, there is no need to use the abstract modifier (although you can specify it, if you like).

//interface MyNumber{ double getValue(); } , main(){ //Create a reference to a MyNumber instance. MyNumber myNum; // Use a lambda in an assignment context. myNum = () -> 12.40; }
//System.out.println(myNum.getValue());
//When a lambda expression occurs in a target type context, an instance of a class is automatically created that implements the functional interface, with the lambda expression defining the behavior of the abstract method declared by the functional interface. When that method is called through the target, the lambda expression is executed. Thus, a lambda expression gives us a way to transform a code segment into an object.


//Example1 - Functional Interface
interface FuncInterface{
	int sum = 0;
	final static int divisor = 3;

	double quotient();

	default void product() {
		System.out.println(3);
	}

	//abstract int remainder(int x, int y);
	
	static int result() {
		return 0;
	}

	private int count() {
		//return sum++; //by default field in interface are static and final
		return 0;
	}
}

public class FuncInterfaceExample implements FuncInterface {
	public static void main(String[] args) {
			
			FuncInterfaceExample fi = new FuncInterfaceExample();
			System.out.println(fi.quotient());
			
			FuncInterface fi2 = () -> 123.45; //This expression is valid because the interface is valid functional interface having only one abstract method.
			//If there were two or more abstract then above expression would throw compile time error: The target type of this expression must be a functional interface
			System.out.println(fi2.quotient()); //overridden the implementation of quotient method.
			
			//System.out.println(fi.remainder(5, 6));
			
			fi.product();
			System.out.println(FuncInterface.result());
			//System.out.println(fi.count()); //count is private method used within Interface
			
	}
	
	@Override
	public double quotient() {
		// TODO Auto-generated method stub
		return 0;
	}

//	@Override
//	public int remainder(int x, int y) {
//		return x%y;
//	}
}




