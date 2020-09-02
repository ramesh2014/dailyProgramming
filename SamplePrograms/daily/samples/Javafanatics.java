package daily.samples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Javafanatics{

//Example3
//public class Javafanatics extends Building {

//Example4
//public class Javafanatics extends Raptor{
	
	//Example1
//	public static void main(String[] args) {
//		SpecialSerial s = new SpecialSerial();
//		
//		try {
//			java.io.ObjectOutputStream os = new java.io.ObjectOutputStream(new java.io.FileOutputStream("myFile"));
//			os.writeObject(s);
//			os.close();
//			
//			System.out.print(++s.z+ " ");
//			
//			java.io.ObjectInputStream is = new java.io.ObjectInputStream(new java.io.FileInputStream("myFile"));
//			SpecialSerial rs = (SpecialSerial)is.readObject();
//			is.close();
//			System.out.print(rs.y + " " + rs.z);
//			
//		}catch(Exception e) {
//			System.out.println("Exception");
//		}
//	}
	
	//Example2
//	public static void main(String[] args) {
//		X x1 = new X();
//		X x2 = new Y();
//		Y y1 = new Y();
//		
//		//x2.do2(); //compilation error as do2 definition not found in X class
//		//(Y)x2.do2(); //compilation error
//		((Y)x2).do2();
//		
//	}
	
	//Example3
//	Javafanatics(){
//		System.out.print("h ");
//	}
//	
//	Javafanatics(String s){
//		this();
//		System.out.print("hn "+s);
//	}
//	 public static void main(String[] args) {
//		 new Javafanatics("x ");
//	}
	
	//Example4
//	public static void main(String[] args) {
//		System.out.print("pre ");
//		new Javafanatics();
//		System.out.println("hawk ");
//	}
	
	//Example5
//	public static void main(String[] args) {
//		String s1 = new String("Hello World");
//		String s2 = new String("Hello World");
//		String s3 = "Hello World";
//		String s4 = "Hello World";
//		
//		System.out.println(s2 == s3);
//		System.out.println(s1 == s2);
//		System.out.println(s1.intern() == s3);
//	}

	public static void main(String[] args) {
//		Integer ten = new Integer(10);
//		Long nine = new Long(9);
//		
//		System.out.println(ten + nine);
//		
//		int i = 1;
//		
//		System.out.println(i +  ten);
		
		
		//System.out.println("null".valueOf(54321));
		
		//Example7
//		Tree tree = new Pine();
//		if(tree instanceof Pine) System.out.println("Pine");
//		if(tree instanceof Tree) System.out.println("Tree");
//		if(tree instanceof Oak) System.out.println("Oak");
//		else System.out.println("Oops");
		
		//Example8
//		System.out.println(x);
		//Integer y = null;
		//Javafanatics.doStuff(x);
		
		//Example9
//		Javafanatics.Class1(null);
		
		
		//Example10
//		try {
//			System.out.println("Test1");
//			throw new RuntimeException("Test2");
//		}catch(Exception e) {
//			
//			System.out.println("Catched");
//			
//			try {
//				throw new Exception("Test3", e);
//			}catch(Exception e2) {
//				System.out.println("Catched2");
//				System.out.println(e2.getMessage());
//				System.out.println(e2.getLocalizedMessage());
//				System.out.println(e2.getCause().getMessage());
//				//System.out.println(e2.printStackTrace());
//			}
//		}
		
//		String date = LocalDate.parse("2014-05-01T10:20:00.000").format(DateTimeFormatter.ISO_DATE_TIME);
//		System.out.println(date);
//		
//		String date1 = LocalDateTime.parse("2014-05-01T10:20:00.000").format(DateTimeFormatter.ISO_DATE_TIME);
//		System.out.println(date1);
		
//		StringBuilder sb = new StringBuilder(5);
//		String s = "";
//		
//		if (sb.equals(s)) System.out.println("match1");
//		else if (sb.toString().equals(s.toString())) System.out.println("match2");
//		else System.out.println("no match");
		
		//switch example
		int a = 2;
		switch(a) {
			default:
				System.out.println("default");
			case 1://fall through
				System.out.println("case1");
			case 0:
				System.out.println("case0");	
		}
		System.out.println("outer switch");
		
		//Example11
		//collections and List example
//		List al = new ArrayList<String>();
//		al.add("String");
//		
//		Foo f = new Foo();
//		f.foo(al);
		//f.foo();
	}	
		
}
//Example11
//collections and List example	
//class Foo{
//	void foo(Collection<T> c) {
//		System.out.println("Collections");
//	}
//	
//	void foo(List<?> l) {
//		System.out.println("List");
//	}
//}

	
//	class Vehicle{
//		int mS = 100;
//		String t = "4w";
//		
////		Vehicle{
////			this.mS = 0;
////		}
//		
//		Vehicle(String t){
//			this.t = t;
//		}
//		
//		Vehicle(String t, int mS){
//			this.t = t;
//			this.mS = mS;
//		}
//	}
//	
//	class Car extends Vehicle{
//		
//		String trans;
//		Car(String trans){
//			super(trans);
//			this.trans = trans;
//		}
//		
//		Car(String type, int mS, String trans){
//			super(type, mS);
////			this(trans);
//		}
//	}
	
	//Example8
//	static Integer x;
//	static void doStuff(int z) {
//		int z2 = 5;
//		System.out.println(z2 + z);
//	}
	
	//Example9
//	public static void Class1(String s) {
//		System.out.println("String");
//	}
//	
//	public static void Class1(Object o) {
//		System.out.println("Object");
//	}
//	
//	public static void Class1(Integer i) {
//		System.out.println("Integer");
//	}
//}


//Example7
//class Tree{}
//class Pine extends Tree{}
//class Oak extends Tree{}

//Example1
//class SpecialSerial implements java.io.Serializable{
//	transient int y = 7;
//	static int z = 9;
//}

//Example2
//class X{
//	void do1(){
//		System.out.println("do1");
//	}
//}
//
//class Y extends X{
//	void do2(){
//		System.out.println("do2");
//	}
//}

//Example3
//class Building{
//	Building(){
//		System.out.print("b ");
//	}
//	
//	Building(String s){
//		this();
//		System.out.print("bn "+s);
//	}

//Example4
//class Bird{
//	{
//		System.out.print("b1 ");
//	}
//	
//	Bird(){
//		System.out.print("b2 ");
//	}
//}
//
//class Raptor extends Bird{
//	static{
//		System.out.print("r1 ");
//	}
//	
//	public Raptor(){
//		System.out.print("r2 ");
//	}
//	
//	{
//		System.out.print("r3 ");
//	}
//	
//	static{
//		System.out.print("r4 ");
//	}
//}

//Example6
//class SubException extends Exception{}
//class SubSubException extends SubException{}
//
//class CC {
//	void doStuff()throws SubException{}
//}
//
//	class CC2 extends CC {
//		void doStuff() throws SubSubException{}
//		
//		class CC3 extends CC {
//			void doStuff() throws Exception{}
//		}
//
//		class CC4 extends CC {
//			void doStuff(int x) throws SubSubException{}
//		}
//	}
	
	




