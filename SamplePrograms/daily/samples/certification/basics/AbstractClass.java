package daily.samples.certification.basics;

abstract class Parent{
	
	protected void methodA() { 
		
	}
	
	abstract void methodB();
}

public class AbstractClass extends Parent {

	public void methodA() { //marking public or protected is the solution if parent is marked with protected or public.
		System.out.println("MethodA");
	}
	
	protected void methodB() {
	    System.out.println("MethodB");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractClass ab = new AbstractClass();
		ab.methodA();
		ab.methodB();
	}

}

