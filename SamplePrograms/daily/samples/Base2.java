package daily.samples;

public class Base2 {

	public static String convert(int num) {
		
		String finalOutput = null;
		StringBuilder tempHoldValue = new StringBuilder("");
		int mod = 0;
		
		while (num > 0) {
			mod = num % 2;
			num = num / 2;
			tempHoldValue.append(mod);
		}
		
		finalOutput = !("".equals(tempHoldValue.toString())) ? tempHoldValue.reverse().toString() : "Unable to Convert to Base2";
		
		return finalOutput;
	}
	
	public static void main(String[] args) {
		
		System.out.println(Base2.convert(1324424323));
	}
}
