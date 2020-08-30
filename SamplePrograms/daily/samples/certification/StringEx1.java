package daily.samples.certification;

public class StringEx1 {

	public static void main(String[] args) {

		String s1 = "WOW";
	    StringBuilder s2 = new StringBuilder(s1);
	    String s3 = new String(s2);
	    System.out.println((s1.hashCode() == s2.hashCode()) + " " +
	                       (s1.hashCode() == s3.hashCode()));
	}
}
