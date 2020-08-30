package daily.samples.alhoa;

import java.util.*;

/*
 * Alphabetical Combination from a given number
 * 1226 - ABBF, ABZ, LZ, LBF, AVF
 * A represents 1, B represents 2 ... Z represents 26
 */
public class FindCombination {

	static List<String> AlphaCombination(int number){
		
		List<String> returnString = new ArrayList<String>();
		
		//first case: each number represents character
		String strChar = String.valueOf(number);
		char[] charArr = strChar.toCharArray();
		StringBuilder tempString = new StringBuilder("");
		char tempChar;
		for(char val: charArr) {
			tempChar = (char) (Integer.valueOf(String.valueOf(val)).intValue() + 64);
			//{char -> String -> Integer -> int } + int -> char (narrowing conversion)
			tempString.append(tempChar);
		}
		returnString.add(tempString.toString());
		
		//second case: two number represents a character - combination
		tempString = new StringBuilder("");
		tempChar = (char) (Integer.valueOf(String.valueOf(strChar.charAt(0))).intValue() + 64);
		tempString.append(tempChar);
		for(int i=1; i<charArr.length; i++) {
			if(i+1 == charArr.length-1) {
				tempChar = (char)(Integer.valueOf((new StringBuilder().append(charArr[i]).append(charArr[i+1])).toString()).intValue() + 64);
				tempString.append(tempChar);
				break;
			}else {
				tempChar = (char)(Integer.valueOf(String.valueOf(charArr[i])).intValue() + 64);
			}
			tempString.append(tempChar);
		}
		returnString.add(tempString.toString()); 
		
		//third case:
		tempString = new StringBuilder("");
		if(charArr.length%2 == 0) {
			for(int i=0; i< charArr.length; i+=2) {
				tempChar = (char)(Integer.valueOf((new StringBuilder().append(charArr[i]).append(charArr[i+1])).toString()).intValue() + 64);
				tempString.append(tempChar);
			}
		}else {
			for(int i=0; i< charArr.length-1; i+=2) {
				tempChar = (char)(Integer.valueOf((new StringBuilder().append(charArr[i]).append(charArr[i+1])).toString()).intValue() + 64);
				tempString.append(tempChar);
			}
		}
		returnString.add(tempString.toString());
		
		//fourth case:
		tempString = new StringBuilder("");
		tempChar = (char) (Integer.valueOf(String.valueOf(new StringBuilder().append(strChar.charAt(0)).append(strChar.charAt(1)))).intValue() + 64);
		tempString.append(tempChar);
		for(int i=2; i<charArr.length; i++) {
			tempChar = (char)(Integer.valueOf(String.valueOf(charArr[i])).intValue() + 64);
			tempString.append(tempChar);
		}
		returnString.add(tempString.toString());
		
		//fifth case:
		tempString = new StringBuilder("");
		tempChar = (char) (Integer.valueOf(String.valueOf(strChar.charAt(0))).intValue() + 64);
		tempString.append(tempChar);
		for(int i=1; i<charArr.length; i++) {
			if(i+1 == charArr.length-1) {
				tempChar = (char)(Integer.valueOf(String.valueOf(charArr[i+1])).intValue() + 64);
				tempString.append(tempChar);
				break;
			}else {
				tempChar = (char)(Integer.valueOf((new StringBuilder().append(charArr[i]).append(charArr[i+1])).toString()).intValue() + 64);
			}
			tempString.append(tempChar);
		}
		returnString.add(tempString.toString()); 
	
		return returnString;
	}
	
	public static void main(String[] args) {

		List<String> actualValue = AlphaCombination(1223);
		
		for (String val: actualValue) {
			System.out.println(val);
		}
	}
}
