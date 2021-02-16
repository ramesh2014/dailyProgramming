package daily.samples.certification.basics;

public class CompileError5 {

	public static void main(String[] args) {
		Square shape = new Cube(1);
		System.out.println(shape.findSurfaceArea());
	}

}
class Square {
    private double length;
    public Square(double length) {
        this.length = length;
    }
    
    double findSurfaceArea() {
    	return 1.0;
    }
}

class Cube extends Square {
    public Cube(double length) {
        super(length);
    }

    public double findSurfaceArea() {
        return super.findSurfaceArea() * 6;
    }
}