package daily.samples.certification.basics;

class Game {
	   static String s = "-";
	   static String s1 = "-";
	   String s2 = "s2";
	   Game(String arg) { s += arg; }
	 }

public class InstanceVariableCompileError extends Game {

	{ s += "i "; } 
	 int i;
	InstanceVariableCompileError() { 
		//super(s2); //cannot pass instance variable which is not yet created.
		//i = 0;
		super(s);
		s += "i ";
	}
	  
	   public static void main(String[] args) {
	     new InstanceVariableCompileError();
	     System.out.println(s);
	   }
	   static { s += "sb "; }
	   
	   { s += "i "; } //this block gets called just after constructor calls.
}
