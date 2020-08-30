package daily.samples;

class A
{
	void a() {
		System.out.println("A");
	}
}

class B extends A
{

	 void b(){
			System.out.println("B");
		}
}

class C extends B
{
	
	public void a() {
		System.out.println("a");
	}
	
	public void b() {
		System.out.println("b");
	}
	
	public void c() {
		System.out.println("c");
	}
}

public class DemoClass {
	
	public static void main(String[] args) {
		
		A a1 = new C();
		a1.a();

		B b1 = new C();
		b1.b();
		b1.a();

	}
}
