package daily.samples.sorting;

public class BubbleSort {
	
	static void invoke(int[] inputArr) {
		// TODO Auto-generated method stub

		//int temp;
		
		//boundary condition
		if(inputArr.length > 0) {
			
			for(int i=0; i<inputArr.length; i++) {
				for(int j=0; j<inputArr.length-i; j++) {
					
					if(j!=inputArr.length-i-1 && inputArr[j] > inputArr[j+1]) {
						//temp = inputArr[j];
						//inputArr[j] = inputArr[j+1];
						//inputArr[j+1] = temp;
						
						//same swap possible using / and *
						//swap using without third variable
						inputArr[j] = inputArr[j] + inputArr[j+1];
						inputArr[j+1] = inputArr[j] - inputArr[j+1];
						inputArr[j] = inputArr[j]-inputArr[j+1];
						
					}
				}
			}
		}
		
		//return inputArr;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {6,5,4,3,2,1,6,5,4,3,2};
		BubbleSort.invoke(arr);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
