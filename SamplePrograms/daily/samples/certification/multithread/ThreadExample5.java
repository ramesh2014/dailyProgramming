package daily.samples.certification.multithread;

public class ThreadExample5 {

	public static void main(String[] args) {
		System.out.println("Main Thread Started: "+Thread.currentThread());
		
		//Example: Multiple Thread + join method which helps to wait for thread to complete
		ThreadImpl t1 = new ThreadImpl("One");
		ThreadImpl t2 = new ThreadImpl("Two");
		ThreadImpl t3 = new ThreadImpl("Three");
		
		t1.t.start();
		t2.t.start();
		t3.t.start();
		
		System.out.println("Thread one is alive: "+t1.t.isAlive());
		System.out.println("Thread two is alive: "+t1.t.isAlive());
		System.out.println("Thread three is alive: "+t1.t.isAlive());
		
		System.out.println("Waiting for thread to finish.");
		
		try {
			t1.t.join(); //Throws InterruptedException
			t2.t.join();
			t3.t.join();
		}catch(InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		
		System.out.println("Thread one is alive: "+t1.t.isAlive());
		System.out.println("Thread two is alive: "+t1.t.isAlive());
		System.out.println("Thread three is alive: "+t1.t.isAlive());
		
		
		System.out.println("Main Thread Exited: "+Thread.currentThread());

	}

}

class ThreadImpl implements Runnable{
	
	String name;
	Thread t;
	
	ThreadImpl(String threadName){
		name = threadName;
		t = new Thread(this, name);
		System.out.println("Child Thread: "+t+" started.");
	}
	
	public void run() {
		try {
			for(int i = 5; i > 0; i--) {
				System.out.println(name + ": "+ i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException ex) {
			System.out.println("Child Thread"+ name + " is interrupted");
		}
		
		System.out.println("Child Thread: "+t+" exited.");
	}
	
}