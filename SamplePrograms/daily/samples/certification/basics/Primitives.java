package daily.samples.certification.basics;

public class Primitives {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer type - byte - 1byte, short - 2bytes, int - 4bytes, long - 8bytes (Whole number)
		//1 byte = 8 bits, each bit can hold either 0 or 1, so that defines the range like for int = 4*8 = 32 bits = 2^32 to 2^32-1 bit signed integer
		//Although you might think that using a byte or short would be more efficient than using an int in situations in which the larger range of an int is not needed, 
		//this may not be the case. The reason is that when byte and short values are used in an expression, they are promoted to int when the expression is evaluated.
		//prefix: binary - 0b, decimal, octal - 0 [0-7], hexadecimal - 0x [0-9,A-F]
		//suffix: long - l or L
		//Underscore used for readability between numbers and compiler ignores the same.
		byte by = 1;
		short s = 2;
		int i = 10;
		long l = 1234567L;
		
		//Floating Point type - real numbers.
		//float - 4bytes, double - 8bytes,
		//Standard Notation (Whole number followed by decimal point values) and Scientific Notation (Standard Notation + suffix E specify power of 10 which number is multiplied or suffix P for hexadecimal number)
		//Suffix: float - f or F; double - d or D
		//Hexadecimal value in floating is feasible with prefix 0x
		float f = 3.14f; //single precision (faster in old processor) //for fraction
		double d = 1234.567d; //double precision (faster in modern processor) //for fraction with large degree of precision
		
		//Characters - ASCII characters in single quote, \', \", \\, \r - carriage return, \n - new line (line feed), \t - horizontal tab, \f - form feed, \b - backspace
		//for impossible characters use backslash, 
		//octal - backslash followed by 3 digit number, 
		//hexadecimal - backslash-u followed by four hex decimal digit.
		//In former java, char was part of Integer, so increment or decrement of value is feasible.
		// http://www.unicode.org.
		char c = 'a';
		char o = '\141';
		char h = '\u0061'; //ISO LATIN-01 a
		
		//Boolean
		boolean b = false;
		
		//String literals
		String str = "String";
		
		//Widening Conversion (automatic type conversions, dest > source)
		//numerical type is not converted to char and boolean as well as even between char and boolean.
		// byte, short -> int
		// byte, short, int -> long
		
		//Narrowing Conversion
		//long -> int
		//int -> byte like int a = 10; byte b; b = (byte)a;
		//this need explicit casting of type as user wants to narrow down the value
		
		//During incompatible, two kinds of exception are possible, compile time and run time. {this applies to object as well}
		//compile time, trying to map higher to lower. long -> int
		//run time, if casting is specified during higher to lower and if range is out of bound then casting exception is thrown. int a = (int) l;
		
		//scope of variable - class, method or block {}
		
		//Automatic type promotion in expression
		//In expression, byte, short and char are promoted to int
		byte b1 = 40;
		byte b2 = 50;
		byte b3 = 60;
		int i1 = b1 * b2 * b3; //out of range from byte range perspective
		
		//byte = b1 * 2; //compile time error, int -> byte needs explicit casting. 
		
		//Promotion rules: (in expr)
		//byte, short, char -> int
		//byte, short, char, int, long -> long (if one operand is long then expr is promoted to long)
		//if one operand in expr is float -> float
		//if one operand in expr is double -> double
		
	}

}
