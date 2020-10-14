package daily.samples.certification.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo {
	
	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(1);
		
		Future<Integer> f;
		
		f = es.submit(new Sum(5));
//		f = es.submit(new Sum(6));
//		f = es.submit(new Sum(7));
		
		try {
			System.out.println(f.get());
		}catch(Exception e) {
			
		}
		
	}
}

class Sum implements Callable<Integer>{
	int stop;
	
	Sum(int v){
		stop = v;
	}
	
	public Integer call() {
		int sum = 0;
		
		for(int i =1; i <=stop; i++) {
			sum +=i;
		}
		return sum;
	}
}