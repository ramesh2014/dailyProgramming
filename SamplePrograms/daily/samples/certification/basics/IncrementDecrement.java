package daily.samples.certification.basics;

public class IncrementDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i++);
//		}
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(++i);
//		}
		
		int x = 0;
		while(x < 100){
			
		    if(x%3 == 0){
		        x += 3;
		    }
		    if(x%2 == 0){
		        x += 2;
		    continue;
		   }
		    x++;
		}
		
	}

}
