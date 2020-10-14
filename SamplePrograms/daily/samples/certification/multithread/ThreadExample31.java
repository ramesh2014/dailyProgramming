package daily.samples.certification.multithread;

public class ThreadExample31 {
	//Example: Extending Thread but using mainThread to start the child thread
	public static void main(String[] args) {
		
		System.out.println("Main Thread Started: "+Thread.currentThread());
		
		NewThreadImpl th = new NewThreadImpl();
		//th.start(); //if Thread class extends Thread.
		
		th.t.start();
		//new Thread(th.t,"New Thread").start();
		
		try {
			for(int i = 5; i > 0 ; i--) {
				System.out.println("Main Thread: "+ i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		
		System.out.println("Main Thread Exiting: "+Thread.currentThread());
	}

}

//class NewThreadImpl extends Thread{
class NewThreadImpl implements Runnable{
	
	Thread t;
	static int counter = 0;
	
	NewThreadImpl(){
		t = new Thread(this, "Demo Thread");
		System.out.println("Child Thread Started: "+t);
	}
	
	public void run(){
		
		try {
			for(int i = 5; i > 0 ; i--) {
				System.out.println("Child Thread: "+ i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			System.out.println("Child thread interrupted");
		}
		
		System.out.println("Child Thread Exiting: "+this);
	}
}