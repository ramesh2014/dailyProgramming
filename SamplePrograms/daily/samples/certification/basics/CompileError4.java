package daily.samples.certification.basics;

public class CompileError4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short s1 = 200;
		int s2 = 400;
		Long s3 = (long)s1 + s2;
		//String s4 = (String)(s3 * s2); //compile error, not cast exception, cannot cast from long to String
		//String s4 = (String)((Long)((s3 * (Long)s2))); //cannot cast from int to Long and Long to String
		//String s4 = (String)((Long)((s3 * s2))); //cannot cast from Long to String
		String s4 = (String)((Long)((s3 * (long)s2))).toString();
		System.out.println("Sum is "+s4);
	}

}
