package daily.samples.certification.multithread;

public class ThreadExample2 {
	//Example: Implementing Runnable Interface
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main Thread Started: "+Thread.currentThread());
		
		NewThread th = new NewThread();
		th.t.start();
		
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

class NewThread implements Runnable{
	
	Thread t;
	static int counter = 0;
	
	NewThread(){
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
		
		System.out.println("Child Thread Exiting: "+t);
	}
}