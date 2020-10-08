package daily.samples.certification.basics;

public class CompileError2 {

}


abstract class testClass {
	double taxRate = 0.05;

    //Abstract methods do not specify a body
	//abstract void increaseTax(){
	void increaseTax(){	
		taxRate = taxRate + 0.01; 
	}
}

interface TestInterface {
	static double taxRate = 0.05;

	abstract void increaseTax();
}

interface TestInterface1 {
	double taxRate = 0.05;

	default void increaseTax() {
		//The final field TestInterface1.taxRate cannot be assigned.
		//taxRate = taxRate + 0.01;
	}
}

interface TestInterface2 {
	double taxRate = 0.05;

	void increaseTax();
}

abstract class testClass2 {
	double taxRate = 0.05;

	public void increaseTax() {
		taxRate = taxRate + 0.01;
	}
}