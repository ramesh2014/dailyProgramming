package daily.samples.alhoa;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {


    /*
     * Complete the doit function below.
     */
    static int doit(int input) {
        /*
         * Write your code here.
         */

//    	int combinationCount = 0;
//    	HashMap<Integer,Character> alphabets = new HashMap<Integer,Character>();
//    	
//    	char[] alphaChar = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n','o','p','q','r','s','t','u','v','w','x','y','z' };
//    	
//    	for ( int i = 0; i < 26; i++ )
//        {
//    		alphabets.put(Integer.valueOf(i)+1, Character.valueOf(alphaChar[i]));
//        }
//    	
//    	if(input == 10001)
//    		return -1;
//    				
//    	if(input > 0) {
//    		
//    		char[] inputArray = String.valueOf(input).toCharArray();
//    		
//    		for(int j = 0; j < inputArray.length; j++) {
//    			if( alphabets.containsKey(Integer.valueOf(inputArray[j]+1))) {
//    				combinationCount++;
//    			}
//    		}
//    	}
//    	
//    	return combinationCount;
    	
    	return findCombination(input);
    }
    
    static int findCombination(int n) {
    	
    	String strValue = Integer.toString(n);
    	char[] charArray = strValue.toCharArray();
    	
    	int count = 0;
    	int match = 0;
    	
    	for(int i = 0; i < charArray.length; i++) {
    		int intValue = Integer.parseInt(String.valueOf(charArray[i]));
    		
    		if(intValue < 1 || intValue > 26) {
    			
    		}else {
    			match++;
    		}
    	}
    	
    	if(match == charArray.length) {
    		count++;
    	}
    	
    	for(int i = 0; i < charArray.length; i++) {
    		boolean stageOne = false;
    		
    		for(int j = 0; j < i -1; j++) {
    			int intValue = Integer.parseInt(String.valueOf(charArray[i]));
    			if(intValue >=1 || intValue <= 26) {
        			stageOne = true;
        		}else {
        			stageOne = false;
        			break;
        		}
    		}
    		
    		if(!stageOne) {
    			break;
    		}
    		
    		String testString = Character.toString(charArray[i-1]) + Character.toString(charArray[i]);
    		int testStringValue = Integer.parseInt(String.valueOf(testString));
    		
    		if(testStringValue < 1 || testStringValue > 26) {
    			break;
    		}
    		
    		boolean stageThree = false;
    		for(int j=i+1; j<charArray.length; j++) {
    			
    			int intValue = Integer.parseInt(String.valueOf(charArray[i]));
    			
    			if (intValue < 1 || intValue > 26) {
    				stageThree = false;
    				break;
    			}
    		}
    		
    		if(stageThree) {
    			break;
    		}
    		
    		count ++;
    	}
    	
    	boolean twoCharBreak = false;
    	
    	for(int i =1; i< charArray.length; i = i+2) {
    		String testString = Character.toString(charArray[i-1])+Character.toString(charArray[i]);
    		int testStringValue = Integer.parseInt(String.valueOf(testString));
    		
    		if (testStringValue < 1 || testStringValue >26) {
    			twoCharBreak = false;
    			break;
	    	}else {
	    		twoCharBreak = true;
	    	}
    		
    		if(twoCharBreak) {
    			count++;
    		}
    	}
    	return count; 
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int input = 1226;
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int res = doit(input);

        System.out.println(res);
        
//        bufferedWriter.write(String.valueOf(res));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
