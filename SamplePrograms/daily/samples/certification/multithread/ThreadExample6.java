package daily.samples.certification.multithread;

public class ThreadExample6 {

	public static void main(String[] args) {
		// Example: MIN_PRIORITY =1, NORM_PRIORITY=5 and MAX_PRIORITY=10
		System.out.println("Main Thread Started: "+Thread.currentThread());
		
		ThrdImpl th1 = new ThrdImpl("One");
		ThrdImpl th2 = new ThrdImpl("Two");
		
		th1.t.setPriority(1);
		th2.t.setPriority(10);
		System.out.println("Child Thread Priority of th1.t: "+th1.t);
		System.out.println("Child Thread Priority of th2.t: "+th2.t);
		
		th1.t.start();
		th2.t.start();
		System.out.println("Main Thread Exited: "+Thread.currentThread());
	}

}

class ThrdImpl implements Runnable{
	
	String name;
	Thread t;
	
	ThrdImpl(String threadName){
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