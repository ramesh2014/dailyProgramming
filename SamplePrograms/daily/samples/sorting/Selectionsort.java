package daily.samples.sorting;

public class Selectionsort {
	
	//array declaration
	//	int[] arrayInt10 = new int[10];
	//	int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
	
//	private void swap(int first, int next) {
//		int temp;
//		temp = next;
//		next = first;
//		first = temp;
//	}
//	
	public static void invoke(Integer[] unsortedArray) {
		
		int i, j, min_idx;
		int tempHolder;
		
		for(i = 0;  i < unsortedArray.length - 1; i++) {
			
			min_idx = i;
			
			for( j = i+1; j < unsortedArray.length; j++ ) {
				if(unsortedArray[j] < unsortedArray[min_idx]) {
					min_idx = j;
				}
			}
			
			if(i != min_idx) {
				tempHolder = unsortedArray[min_idx];
				unsortedArray[min_idx] = unsortedArray[i];
				unsortedArray[i] = tempHolder;
			}	
		}
	}
	
	public static void main(String[] args) {
		
		Integer[] unsortedArray = new Integer[]{ 8,5,3,2,9,1,1 };
		//int[] unsortedArray = new int[]{ 8,1,3,2,9 };
		
		//int[] unsortedArray = new int[]{ 1,1,1,1};
		
		Selectionsort.invoke(unsortedArray);
		
		for(int a : unsortedArray) {
			System.out.print(a+" ");
		}
	}
	
}
