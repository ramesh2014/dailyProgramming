package daily.samples.certification.concurrency;

import java.util.concurrent.Semaphore;

class SharedClass{
	static int fork1 = 0;
	static int fork2 = 0;
}

class forkThread implements Runnable{
	
	Semaphore sem;
	String name;
	
	forkThread(Semaphore sem, String name){
		this.sem = sem;
		this.name = name;
	}
	
	public void run() {
		
		try {
			System.out.println(name+" is waiting for permit");
			sem.acquire();
			System.out.println(name+" got permit");
			
			if("Philosopher0".equals(name)) {
				SharedClass.fork1 = 4;
				SharedClass.fork2 = 0;
			}else if("Philosopher1".equals(name)) {
				SharedClass.fork1 = 0;
				SharedClass.fork2 = 1;
			}else if("Philosopher2".equals(name)) {
				SharedClass.fork1 = 1;
				SharedClass.fork2 = 2;
			}else if("Philosopher3".equals(name)) {
				SharedClass.fork1 = 2;
				SharedClass.fork2 = 3;
			}else if("Philosopher4".equals(name)) {
				SharedClass.fork1 = 3;
				SharedClass.fork2 = 4;
			}
			
			System.out.println(name+" accessed fork1: "+SharedClass.fork1);
			System.out.println(name+" accessed fork2: "+SharedClass.fork2);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Releasing the permit");
		sem.release();
	}
}


public class Philosopher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Semaphore sem1 = new Semaphore(1);
		
		new Thread(new forkThread(sem1, "Philosopher0")).start();
		new Thread(new forkThread(sem1, "Philosopher1")).start();
		new Thread(new forkThread(sem1, "Philosopher2")).start();
		new Thread(new forkThread(sem1, "Philosopher3")).start();
		new Thread(new forkThread(sem1, "Philosopher4")).start();
		
	}

}
