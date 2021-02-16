package daily.samples.certification.basics;
import java.util.*;

public class PublicInterfaceExample implements Pancake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> x = new ArrayList<String>();
	     x.add("3"); x.add("7"); x.add("5");
	     List<String> y = new PublicInterfaceExample().doStuff(x);
	     y.add("1");
	     System.out.println(x);
	}
	
	 //List<String> doStuff(List<String> z) { //Cannot reduce the visibility of the inherited method from Pancake
	  public List<String> doStuff(List<String> z) {
	     z.add("9");
	     return z;
	   }
}

interface Pancake {
	   List<String> doStuff(List<String> s);
	 }

