package daily.samples;

public class PrimeNumber {

	/**
	 * Prime Logic:
	 * Number > 1
	 * 2 is even prime
	 * any number is divisible by 
	 * @param number
	 * @return
	 */
	static boolean isPrime(int number) {
		
		boolean isPrime = true;
		
		if(number > 1) {
			
			if(number == 2) {
				//return true; //even prime
			}else{
				
				if(number%2 == 0) {
					isPrime = false;
				}else {
					for(int i = 3; i <= Math.sqrt(number); i+=2) {
					//for(int i = 3; i < number ; i++) {
						if(number%i ==0) {
							isPrime = false;
						}
					}
				}
			}
		}else
			isPrime = false;
		
		return isPrime;
	}
	
	public static void main(String[] args) {

		//int number = 3;
		for (int number = 1; number <= 100000; number++) {
			//System.out.format("Number: %d isPrime: "+isPrime(number),number);
			//System.out.println();
			if(isPrime(number))
				System.out.print(number+", ");
		}
		System.out.println();
	}
}

//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, and 97
