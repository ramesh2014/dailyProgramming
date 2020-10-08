package daily.samples.certification;

public class ParentChildObject {
	public static void main(String[] args) {
		
		//https://stackoverflow.com/questions/16266559/why-in-java-incompatibility-of-types-to-casting-is-checked-at-runtime-and-type-m
		
		//Example1 - Compilation Error
		//Type mismatch: cannot convert from Square to Cube
//		Cube shape = new Square();  //NOTE: Compiler does implicit casting and errors out.
//		System.out.println(shape.calcArea(1));
		
		//Example2 - Runtime Error
		//daily.samples.certification.Square cannot be cast to daily.samples.certification.Cube
//		Square p= new Square(); 
//		Cube c = new Cube(); 
//		c = (Cube) p; //NOTE: Developers take responsibility of casting, so compiler fails it at runtime.
		
		//Example3 - Successfully Executes
		// p and c refers to same object of Cube
		//with p, we get exclusive function access of Cube
		//with c, we get inclusive function access of Cube (methods that are not overridden)
		Square p= new Cube(); 
		Cube c = (Cube)p;
		System.out.println(c.calcArea(1));
		System.out.println(p.calcArea(1));
		System.out.println(c.cubeValue(3));
		
		//Compilation Error: The method cubeValue(int) is undefined for the type Square
		//System.out.println(p.cubeValue(3));
	}
}

class Square {
	public int calcArea(int x) {
		return (x * x);
	}
}

class Cube extends Square {
	public int calcArea(int x) {
		return super.calcArea(x * 6);
	}
	
	public int cubeValue(int x) {
		return x*x*x;
	}
}