package daily.samples.certification.multithread;

public class ThreadExample3 {
	//Example: Extending Thread Class
	public static void main(String[] args) {
		
		System.out.println("Main Thread Started: "+Thread.currentThread());
		
		ExtendThread th = new ExtendThread();
		th.start();
		
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

class ExtendThread extends Thread{
	
	static int counter = 0;
	
	ExtendThread(){
		//t = new Thread(this, "Demo Thread");
		super("Demo Thread"); //HIGHLIGHT
		System.out.println("Child Thread Started: "+this);
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