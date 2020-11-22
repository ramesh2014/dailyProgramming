package daily.samples.certification.concurrency;

import java.util.concurrent.Semaphore;

class Shared{
	static int count = 0;
}

class IncThread implements Runnable{
	
	Semaphore sem;
	String name;
	
	IncThread(Semaphore sem, String name){
		this.sem = sem;
		this.name = name;
	}
	
	public void run() {
		
		System.out.println("Starting name: "+name);
		
		try {
			System.out.println(name+" is waiting for permit");
			sem.acquire();
			System.out.println(name+" got permit");
			
			for(int i=0; i<5; i++) {
				Shared.count++;
				
				System.out.println("Share count: "+Shared.count);
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Releasing the permit");
		sem.release();
	}
}

class DecThread implements Runnable{
	
	Semaphore sem;
	String name;
	
	DecThread(Semaphore sem, String name){
		this.sem = sem;
		this.name = name;
	}
	
	public void run() {
		
		System.out.println("Starting name: "+name);
		
		try {
			System.out.println(name+" is waiting for permit");
			sem.acquire();
			System.out.println(name+" got permit");
			
			for(int i=0; i<5; i++) {
				Shared.count--;
				
				System.out.println("Share count: "+Shared.count);
				Thread.sleep(10);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Releasing the permit");
		sem.release();
	}
}

public class SemaphoreDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Semaphore sem = new Semaphore(1);
		
		new Thread(new IncThread(sem,"A")).start();
		new Thread(new DecThread(sem,"B")).start();

	}

}
