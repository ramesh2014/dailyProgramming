package daily.samples;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class AddNumByTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] integerArray = {4,6,7,8,9,1};
		int target = 10;
		
		//int[] output = AddNumByTarget.addNumbers(integerArray, target);
		
		//System.out.println(Arrays.toString(output));
		
		int[][] output = AddNumByTarget.addNumbers(integerArray, target);
		System.out.println(Arrays.deepToString(output)); //to print nested array
	}

	static int[][] addNumbers(int num[], int target) {
		
		Map<Integer, Integer> storage = new HashMap<Integer, Integer>();
		
//		int[] output = new int[2];
		int[][] output = new int[2][2];
		
		Integer val = null;
		
		for(int i=0; i<num.length; i++) {
			
			val = storage.get(target - num[i]);
			
			if( val == null) {
				storage.put(num[i], i);
			}else {
//				output[0] = storage.get(target - num[i]);
//				output[1] = i;
				
//				output[0] = target - num[i];
//				output[1] = num[i];
				
				output[0][0] = storage.get(target - num[i]);
				output[0][1] = target - num[i];
				
				output[1][0] = i;
				output[1][1] = num[i];
				
				break;
			}
			
		}
		
		return output;
		
	}
}
