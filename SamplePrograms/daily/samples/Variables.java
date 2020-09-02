package daily.samples;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Variables {

	//static int a = 20;
	static void modify(int a) {
		a = a +10;
	}
	
	static void modify2(Integer a1) {
		a1 = a1 +10;
	}
	
	static void modify3(Test t) {
		t.a = t.a +10;
	}
	
	class Test{
		int a;
	}
	
	public static void main(String[] args) {
		
		int a = 20;
		
	    Variables.modify(a);
	    System.out.println(a);
	    
	    Integer a1 = new Integer(10);
	    Variables.modify2(a1);
	    System.out.println(a1);
	    
//	    Variables vt = new Variables();
//	    Test tt = vt.new Test();
//	    
	    Test t = new Variables().new Test();
	    t.a = 30;
	    Variables.modify3(t);
	    System.out.println(t.a);
	    
	    try{
	    	throw new Exception();
	    }catch(Exception e){
	        StringWriter trace = new StringWriter();
	        e.printStackTrace(new PrintWriter(trace)); //PrintWriter constructor takes Writer (parent) as input param
	        System.out.println(trace.toString());
	    }
	    
	    
	}
}
