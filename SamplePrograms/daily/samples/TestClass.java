package daily.samples;

import java.io.*;

import daily.samples.pkg.TestClass2;

//public class TestCalss {
//	public static void main(String[] args) {
//		SpecialSerial name = new SpecialSerial();
//		try {
//			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("myFile.txt"));
//			os.writeObject(name);
//			System.out.print(++name.z + " ");
//			ObjectInputStream is = new ObjectInputStream(new FileInputStream("myFile.txt"));
//			SpecialSerial var = (SpecialSerial) is.readObject();	
//			is.close();
//			
//			System.out.print(var.y + " " + var.z);
//		}catch(Exception ex) {
//			//System.out.println(ex.getStackTrace());
//		}
//	}
//}
//
//class SpecialSerial implements Serializable {
//	transient int y = 7;
//	static int z = 9;
//}

//class Foo {
//	int a = 5;
//	protected int b = 6;
//	public int c = 7;
//}

public class TestClass{
	
	public static void main(String[] args) {
//	    TestClass2 name = new TestClass2();
//	    //System.out.println(" "+name.a);
//	    //System.out.println(" "+name.b);
//	    System.out.println(" "+name.c);
		
//		long  giant  = (long)  4415961481999.03D;    // (1) double to long.
//
//		int   big    = (int)   giant;                // (2) long to int.
//
//		short small  = (short) big;                  // (3) int to short.
//
//		byte  tiny   = (byte)  small;                // (4) short to byte.
//
//		char  symbol = (char)  112.5F;               // (5) float to char.
//		
//		System.out.println(giant);
//		System.out.println(big);
//		System.out.println(small);
//		System.out.println(tiny);
//		System.out.println(symbol);
		
//		boolean leapYear = false;
//		int v28 = 28;
//		int v29 = 29;
//		
//		byte daysInFebruary =  (leapYear ? (byte)v29 : (byte)v28);
//		System.out.println(daysInFebruary);
		
		int i = 3;
		int j = 4;
		int minValue2 = i < j ? (int) i : (int)Double.MIN_VALUE;
		
		//System.out.println(Double.MIN_VALUE);
		//System.out.println(Double.MAX_VALUE);
		//System.out.println(Integer.MIN_VALUE);
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Math.pow(2,63)-2);
		System.out.println(minValue2);
	}
	
}