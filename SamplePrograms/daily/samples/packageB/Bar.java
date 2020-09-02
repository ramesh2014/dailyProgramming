package daily.samples.packageB;
import daily.samples.packageA.Foo;

public class Bar extends Foo {
	//int b = 15;
	
	public static void main(String[] args) {
		Foo f = new Foo();
		Foo f1 = new Bar();
		Bar f2 = new Bar();
		
		//System.out.println(f.a);
//		System.out.println(f.b);
		//System.out.println(f1.b); //b variable in packageA is marked as protected.
//		System.out.println(f2.b);
		//System.out.println(f.c);
	}
}
