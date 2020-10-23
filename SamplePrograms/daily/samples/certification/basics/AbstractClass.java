package daily.samples.certification.basics;

public class AbstractClass extends Parent {

	public void methodA() {
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

abstract class Parent{
	
	abstract protected void methodA();
	
	abstract void methodB();
}