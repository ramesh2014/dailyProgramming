package daily.samples;

public class UnRepeatedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,1,2,5,4,3,4,2,5};
		
		int i, res = 0;
		
		for(i=0;i<a.length;i++) {
			res = res^a[i];
		}
		System.out.println(res);
	}

}
