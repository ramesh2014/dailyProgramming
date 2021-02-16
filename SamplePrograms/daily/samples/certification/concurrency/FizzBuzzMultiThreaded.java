package daily.samples.certification.concurrency;

import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

class FizzBuzz {
    private int n;

    public FizzBuzz(int n) {
        this.n = n;
    }

    // printFizz.run() outputs "fizz".
    public void fizz(Runnable printFizz) throws InterruptedException {
        System.out.print("fizz ");
    }

    // printBuzz.run() outputs "buzz".
    public void buzz(Runnable printBuzz) throws InterruptedException {
    	System.out.print("buzz ");
    }

    // printFizzBuzz.run() outputs "fizzbuzz".
    public void fizzbuzz(Runnable printFizzBuzz) throws InterruptedException {
    	System.out.print("fizzbuzz ");
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void number(IntConsumer printNumber) throws InterruptedException {    	
    	printNumber = x -> System.out.print(x+" ");
    	//printNumber.accept(this.n);
    }
}

class ThreadClass implements Runnable{
    
    Semaphore sem;
    FizzBuzz fb;
    
    ThreadClass(Semaphore sem, FizzBuzz fb){
        this.sem = sem;
        this.fb = fb;
    }
     
    public void run(){
        
//        try{
//            
//            for(int i = 0; i < fb.n; i++){
//                
//                if (i%3 == 0 && i%5 == 0){
//                    fb.fizzbuzz();
//                } 
//            }
//            
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
    }
} 


public class FizzBuzzMultiThreaded {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        if (n > 0){ //minimum criteria: number should be greater than zero
            
            FizzBuzz fb = new FizzBuzz(n);
            
            Semaphore sem = new Semaphore(1);
            
            new Thread(new ThreadClass(sem, fb)).start();
            new Thread(new ThreadClass(sem, fb)).start();
            new Thread(new ThreadClass(sem, fb)).start();
            new Thread(new ThreadClass(sem, fb)).start();
            
        }
        
	}
}