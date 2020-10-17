package daily.samples.certification.lambda;

//Example1
//public class FuncInterfaceExample implements FuncInterface {
//	public static void main(String[] args) {
//			
//			FuncInterfaceExample fi = new FuncInterfaceExample();
//			System.out.println(fi.quotient());
//			System.out.println(fi.remainder(5, 6));
//			
//			fi.product();
//			System.out.println(FuncInterface.result());
//			//System.out.println(fi.count()); //count is private method used with Interface
//			
//	}
//	
//	@Override
//	public double quotient() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int remainder(int x, int y) {
//		return x%y;
//	}
//}
//
//interface FuncInterface{
//	int sum = 0;
//	final static int divisor = 3;
//
//	double quotient();
//
//	default void product() {
//		System.out.println(3);
//	}
//
//	abstract int remainder(int x, int y);
//	
//	static int result() {
//		return 0;
//	}
//
//	private int count() {
//		//return sum++; //by default field in interface are static and final
//		return 0;
//	}
//}


//Example2
public class FuncInterfaceExample{

	public static void main(String[] args) {
		
		FuncInterface fi;
		fi = ()->123;
		
		System.out.println(fi.getValue());
		
	}
}


interface FuncInterface{

	double getValue();
	
}

