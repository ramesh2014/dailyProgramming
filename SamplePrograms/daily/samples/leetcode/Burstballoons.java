package daily.samples.leetcode;

import java.util.HashMap;
import java.util.Map;

/*Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. 
 * If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. 
 * Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.

Find the maximum coins you can collect by bursting the balloons wisely.

Note:

You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100
Example:

Input: [3,1,5,8]
Output: 167 
Explanation: nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
             coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167 */
             
public class Burstballoons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nBalloons = 5;
		int low = 0;
		int high = 100;
		int[] nums;
		
		//0 ≤ n ≤ 500
		if (nBalloons >= 0 && nBalloons <= 500)
		 nums = new int[nBalloons];
		else
		 return;
		
		for(int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * (high-low) + low); //0 ≤ nums[i] ≤ 100
		} 
		
	   // int maxCoins = Solution.maxCoins(nums);
		
	//	System.out.println(maxCoins);
	}
	
//	class Solution {
//	    static public int maxCoins(int[] nums) {
//	        
//	    	//nums[-1] = nums[n] = 1
//	    	int lowerBoundN = 1;
//	    	int higherBoundN = 1;
//	    	
//	    	int maxCoins = 1;
//	    	
//	    	Map<Integer, Character> hm = new HashMap<>();
//	    	
//	    	//move the content from array to hashmap
//	    	for(int i = 0; i < nums.length; i++) {
//	    		hm.put(Integer.valueOf(nums[i]), Character.valueOf('Y'));
//	    	}
//	    	
//	    	//bursting balloons and marking them as complete
//	    	while(hm.containsValue('Y')) {
//	    		
//	    		
//	    		
//	    	}
//	    	
//	    	//nums[left] * nums[i] * nums[right]
//	    	
//	    	
//	    	
//	    	return maxCoins;
//	    }
//	}
	
}
