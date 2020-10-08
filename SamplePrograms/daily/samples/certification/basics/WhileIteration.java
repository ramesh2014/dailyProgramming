package daily.samples.certification.basics;

public class WhileIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		int i = 0;
		while (x < 100) {
			i++;
			if (x % 2 == 1) {
				x++;
			} else if (x % 2 == 0) {
				x += 3;
			}
			if(i == 4) break;
		}
		
		System.out.println(x);
	}

}
