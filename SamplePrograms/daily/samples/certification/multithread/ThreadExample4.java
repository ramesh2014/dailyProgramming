package daily.samples.certification.multithread;

public class ThreadExample4 {

	public static void main(String[] args) {
		
		System.out.println("Main Thread Started: "+Thread.currentThread());
		
		//Example: Multiple Thread
		ThreadImplementation t1 = new ThreadImplementation("One");
		ThreadImplementation t2 = new ThreadImplementation("Two");
		ThreadImplementation t3 = new ThreadImplementation("Three");
		
		t1.t.start();
		t2.t.start();
		t3.t.start();
		
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		
		System.out.println("Main Thread Exited: "+Thread.currentThread());
	}

}

class ThreadImplementation implements Runnable{
	
	String name;
	Thread t;
	
	ThreadImplementation(String threadName){
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