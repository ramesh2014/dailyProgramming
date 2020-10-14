package daily.samples.certification.multithread;

public class ThreadExample1 {
	//Example: About Main Thread which controls all child thread
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread th = Thread.currentThread();
		System.out.println(th.getName());
		
		th.setName("NewMainThread");
		System.out.println(th.getName());
		
		try {
			for(int i = 0; i < 5; i++) {
				th.sleep(1000);
				System.out.println("i = "+i);
			}
		}catch(InterruptedException ex) {
			System.out.println("Main thread interrupted");
		}
	}

}

