package daily.samples.alhoa;

/*Number Reducer Program:
 * Reduce the number to ZERO in a minimum number of operations
 * Result: Number of operations
 */
public class NumberReducer {
	
	static int OperationsCount(int number) {
		
		int iOperationCount = 0;
		//number must be greater than zero
		if(number <= 0)
		   return -1;
		
		//if number is not even then add+1
		if(!(number%2 == 0)) {
			number++;
		}	
		
		//find factors for given number i.e., 2 and quotient
		while( number > 3) {
			number = Math.max(2, number/2);
			iOperationCount++;
		}
		
		if(number == 3) {
			iOperationCount += 3; //as number has to be decreased by 3 times, 3-1, 2-1, 1-1
		}else if (number == 2) {
			iOperationCount += 2;
		}else if (number == 1) {
			iOperationCount++;
		}
		
		return iOperationCount;
	}
	
	public static void main(String[] args) {
		
		System.out.println(OperationsCount(3));
	}

}
