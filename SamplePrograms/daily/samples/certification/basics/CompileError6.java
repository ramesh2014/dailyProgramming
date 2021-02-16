package daily.samples.certification.basics;

public class CompileError6 { // public - top level
	
	int u = 5; //no modifier or package-private, This falls between protected and private, 
	           //allowing only classes in the same package access. 
	          //(protected is like this, but also allowing access to subclasses outside of the package.)

	private int x = 6;
	protected int y = 4;
	public int z = 4; //public = member level
	static int w = 4;
	final int v = 4;	
	//default int r = 7; // Unresolved compilation problem: 
	
	CompileError6(){
		
		int u = 5;
		//Illegal modifier for parameter x; only final is permitted
//		private int x = 6;
//		protected int y = 4;
//		public int z = 4;
//		static int w = 4;
		final int v = 4;
		//default int r = 7; //Syntax error on token "default", delete this token

	}
	
	public static void main(String[] args) {
		
		//Illegal modifier for parameter x; only final is permitted
		//private int x = 4;
		//protected int x = 4;
		//public int x = 4;
		//static int x = 4;
		
		//Local variables can't have access modifier
		final int x = 4;
		
		new CompileError6().new Cell().print();
		new CompileError6().methodTest();
		
		//default int r = 7; //Syntax error on token "default", delete this token

	}
	
	void methodTest() {
		int u = 5;
		//Illegal modifier for parameter x; only final is permitted
		//if methodTest() is not invoked then declaring variables with access modifier doesn't throws any compilation error.
//		private int x = 6;
//		protected int y = 4;
//		public int z = 4;
//		static int w = 4;
		final int v = 4;	
		//default int r = 7; //Syntax error on token "default", delete this token
	}
	
	class Cell{
		void print() {
			System.out.println("throw key: "+ x);
		}	
	}
}
