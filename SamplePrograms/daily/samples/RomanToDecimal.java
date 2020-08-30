package daily.samples;

import java.util.HashMap;

public class RomanToDecimal {

	static int convert(String romanNumber) {
		
		int convertedNumber = 0;
		
		HashMap<String,Integer> romanNumeralsMap = new HashMap<String,Integer>();
		romanNumeralsMap.put(String.valueOf("I"),Integer.valueOf(1));
		romanNumeralsMap.put(String.valueOf("V"),Integer.valueOf(5));
		romanNumeralsMap.put(String.valueOf("X"),Integer.valueOf(10));
		romanNumeralsMap.put(String.valueOf("L"),Integer.valueOf(50));
		romanNumeralsMap.put(String.valueOf("C"),Integer.valueOf(100));
		romanNumeralsMap.put(String.valueOf("D"),Integer.valueOf(500));
		romanNumeralsMap.put(String.valueOf("M"),Integer.valueOf(1000));
		
		Integer currVal = 0;
		Integer nextVal = 0;
		Integer sum = 0;
		
		for(int i=0;i<romanNumber.length();i++) {
		
			currVal = romanNumeralsMap.get(String.valueOf(romanNumber.charAt(i)));
					
			if(i+1 < romanNumber.length()) {
				
				nextVal = romanNumeralsMap.get(String.valueOf(romanNumber.charAt(i+1)));
				
				if (currVal > nextVal) {
					sum = sum + currVal;
				}else {
					sum = sum + nextVal - currVal;
					i++;
				}
					
			}else {
				sum = sum + currVal;
				i++;
			}
		}
		
		convertedNumber = sum.intValue();
		
		return convertedNumber;
	}
	
	public static void main(String[] args) {
		
		String romanNumber = "VI";
		System.out.println("Input: "+romanNumber);
		System.out.println("Output: "+convert(romanNumber));
	}
}