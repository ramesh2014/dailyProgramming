package daily.samples.certification.enums;

//all enumerations automatically inherit one: java.lang.Enum
//enumeration of days in the week
//enum is a class type
enum Weeks{
	
	//each constants are public, static and final implicitly
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY //Ending the enumeration constants with semicolon is optional.
	
	//Predefined methods
//	public static enum_type[] values() {}
//	public static enum_type value_of(String str) {}
}

/* a Java enumeration is a class type. 
 * Although you don’t instantiate an enum using new, it otherwise has much the same capabilities as other classes. 
 * The fact that enum defines a class gives the Java enumeration extraordinary power. 
 * For example, you can give them constructors, add instance variables and methods, and even implement interfaces.
 * */
enum Apples{
	 Cortland(8), Jonathan(10), GoldenDel(9), RedDel, Winesap(15), Ramesh(20,20); //when constructor is used, semicolon is mandatory.
	 
	private int price;
	private int quantity;

	Apples(){ //default
		price = -1;
	}

	Apples(int p){ //overloaded
		price = p;
	}
	
	Apples(int p, int q){
		price = p;
		quantity = q;
	}
	
	int getPrice() {
		return price;
	}
	
	int getQuantity() {
		return quantity;
	}
}

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//We don't instantiate enums but declared and used as we do for any primitive data type
		Weeks day;
		day = Weeks.SUNDAY;
		
		//enums can be used to control the switch case statements
		switch(day) {
		
		//case Weeks.SUNDAY: The qualified case label Weeks.SUNDAY must be replaced with the unqualified enum constant SUNDAY
		case SUNDAY: //constant type is enum is already specified in switch, so same is not needed in case statement 
			System.out.println(day);
			break;
		default:
			System.out.println("No day");
		}
		
		//use values()
		Weeks WeeksArray[] = Weeks.values();
		
		for(Weeks days: WeeksArray) {
			System.out.println(days);
		}
		
		//use valueOf()
		System.out.println(Weeks.valueOf("MONDAY"));
		
		//calling instance method defined in enum
		for(Apples ap: Apples.values()) {
			System.out.println(ap + ", "+ap+" cost: "+ap.getPrice());
			
			//You can obtain a value that indicates an enumeration constant’s position in the list of constants. 
			//This is called its ordinal value, and it is retrieved by calling the ordinal( ) method
			
			System.out.println(ap.ordinal());//starts with Zero, position in constants
			
			//You can compare the ordinal value of two constants of the same enumeration by using the compareTo( ) method.
			//You can compare for equality an enumeration constant with any other object by using equals( )
			
			Apples ap1 = Apples.Jonathan;
			Apples ap2 = Apples.Cortland;
			Apples ap3 = Apples.Cortland;
			
			if(ap1.compareTo(ap2) < 0) {
				System.out.println(ap1 + " comes before "+ ap2);
			}
			
			if(ap1.compareTo(ap2) > 0) {
				System.out.println(ap1 + " comes after "+ ap2);
			}
			
			if(ap2.compareTo(ap3) == 0) {
				System.out.println(ap2 + " equals "+ ap3);
			}
			
			if(ap1.equals(ap2)) {
				System.out.println("Doesn't match");
			}
			
			if(ap2.equals(ap3)) {
				System.out.println(ap2+" matches "+ap3);
			}
			
			if(ap2 == ap3) {
				System.out.println(ap2+" equals "+ap3);
			}
			System.out.println(" ");
		}
		
	}

}
