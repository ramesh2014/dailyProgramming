package daily.samples.certification.concurrency;

import java.util.concurrent.Semaphore;
public class PhilosophersForks {
	
	
	public static void main(String[] args) {
		Semaphore fork1 = new Semaphore(1);
		Semaphore fork2 = new Semaphore(1);
		Semaphore fork3 = new Semaphore(1);
		Semaphore fork4 = new Semaphore(1);
		Semaphore fork5 = new Semaphore(1);
		Thread phil1 = new Thread(new Philosophers("Phil1",fork5, fork1, 5));
		Thread phil2 = new Thread(new Philosophers("Phil2",fork1, fork2, 4));
		Thread phil3 = new Thread(new Philosophers("Phil3",fork2, fork3, 3));
		Thread phil4 = new Thread(new Philosophers("Phil4",fork3, fork4, 2));
		Thread phil5 = new Thread(new Philosophers("Phil5",fork4, fork5, 1));
        phil1.start();
        phil2.start();
        phil3.start();
        phil4.start();
        phil5.start();
	}
}
class Philosophers implements Runnable
{
	Semaphore fork1 ;
	Semaphore fork2 ;
	String name ;
	int food;
	Philosophers(String name, Semaphore f1, Semaphore f2, int food)
	{
		fork1 = f1;
		fork2 = f2;
		this.name = name;
		this.food = food;
		
	}
	
	public void run()
	{
		while(food != 0)
		{
		try
		{
		System.out.println(name+" is trying to acquire lock");
		fork1.acquire();
		fork2.acquire();
		System.out.println(name+" has acquired lock");
		eat();
		System.out.println(name+" has released lock");
		fork1.release();
		fork2.release();
		}catch(Exception ex)
		{
			
		}
		}
	}
	
	private void eat()
	{
		food--;
		System.out.println(name +" is eating, food remaining  " + food );
		
	}
}