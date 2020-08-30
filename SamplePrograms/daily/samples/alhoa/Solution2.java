package daily.samples.alhoa;
import java.math.*;

public class Solution2 {

	/*
     * Complete the reduce function below.
     */
    static int reduce(int n) {
        /*
         * Write your code here.
         */
        int operationCount = 0;
        
        if (n == -2)
        	return -1;
        
        while(!isPrime(n)){
            
            for(int i=(int) Math.round(Math.sqrt(n)); i>=1; i-- ){
                if(n%i == 0){
                    n = Math.max(i, n/2);
                    operationCount ++;
                    break;
                }
            }

            if(n <=1){
                break;
            }

        }
        
        operationCount = operationCount+n;
        return operationCount;
    }

    //this method tries to check whether method is isPrime or not
    //learnt from geeksForgeeks
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        if(n<=3){
            return true;
        }

        if(n%2==0 || n%3 ==0){
            return false;
        }

        for(int i = 5; i*i <=n ; i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
    	
    	System.out.println(reduce(6));
    	
    }
}
