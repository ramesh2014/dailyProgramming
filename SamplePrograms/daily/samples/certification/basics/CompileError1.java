package daily.samples.certification.basics;

//should we ignore if two class is written as public when java doesn't allow for certification exam ?
public class CompileError1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double cir = Circle.findCircumference(7.5); //double -> int not allowed. 
		double cir = Circle.findCircumference((int)7.5); // int -> double is allowed. or typecast is allowed
		System.out.print("Circumference of circle=" + cir);
	}

}

//public class Circle {
class Circle {
	public static double findCircumference(int radius) {
		return 2 * Math.PI * radius;
	}
}