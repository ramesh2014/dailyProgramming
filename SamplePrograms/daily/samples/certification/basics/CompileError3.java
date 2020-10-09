package daily.samples.certification.basics;

public class CompileError3 extends TheAbstract implements TheInterface {

	//Compilation Error: Cannot reduce the visibility of the inherited method from TheInterface
	//For class: By default, it's default.
	//For interface: By default, they are public
	//so can't reduce from public to default.
	//Interestingly there is NO ambiguity of Multiple Inheritance of behavior from method.
	//void method() {
	public void method() {	
		System.out.println("balloons");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompileError3 ce = new CompileError3();
		ce.method();
		
		TheAbstract ae = new CompileError3();
		ae.method();
		
		TheInterface ie = new CompileError3();
		ie.method();
		
		TheInterface ie2 = (TheInterface)ae;
		System.out.println(ie2.field);
		
		TheAbstract ae2 = (TheAbstract)ie;
		System.out.println(ae2.field);
	}

}

interface TheInterface {
	int field = 99;

	abstract void method();
}

abstract class TheAbstract {
	int field = 1983;

	abstract void method();
}
