package daily.samples.techgig.powerpuff;

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

//import java.io.*;
import java.util.*;

public class CandidateCode {

    static long minimumfPowerPuff(long pNumberIngredients, String[] pQuantityIng, String[] pQuantityEachIng){

        long minfPowerPuff = 0L;
        long lMinNumIng = 1L;
        long lMaxNumIng = 10000000L;

        long lMinVal = 0L;
        long lMaxVal = Long.MAX_VALUE;

        //constraint 1: 1<= N <=10000000 (1e7)
        if (!( pNumberIngredients >= lMinNumIng && pNumberIngredients <= lMaxNumIng )){
            return minfPowerPuff;
        }else{
            if(pNumberIngredients > 1 && pQuantityIng.length > 0 && pQuantityEachIng.length > 0){
                
                if(!(pNumberIngredients == pQuantityIng.length && pNumberIngredients == pQuantityEachIng.length)){
                    return minfPowerPuff;
                }
                
                long lPreEachQuantity = 0L;
                long lPreQuantity = 0L;
                long qPreQuantity = 0L;
                
                long lNextEachQuantity = 0L;
                long lNextQuantity = 0L;
                long qNextQuantity = 0L;

                for(int i = 0; i < pQuantityIng.length-1; i++){
                    lPreQuantity = Long.valueOf(pQuantityIng[i]);
                    lNextQuantity = Long.valueOf(pQuantityIng[i+1]);

                    //constraint 2: 0<= Quantity_of_ingredient <= LLONG_MAX 
                    if(!( lPreQuantity >= lMinVal && lPreQuantity <= lMaxVal) && !( lNextQuantity >= lMinVal && lNextQuantity <= lMaxVal)){
                        return minfPowerPuff;
                    }

                    lPreEachQuantity = Long.valueOf(pQuantityEachIng[i]);
                    qPreQuantity = lPreEachQuantity/lPreQuantity;

                    lNextEachQuantity = Long.valueOf(pQuantityEachIng[i+1]);
                    qNextQuantity = lNextEachQuantity/lNextQuantity;

                    if ( minfPowerPuff == 0L ) {
                    	minfPowerPuff = Math.min(qPreQuantity, qNextQuantity);
                    }else {
                    	minfPowerPuff = Math.min(minfPowerPuff, qNextQuantity);
                    }
                }
            }
        }

        return minfPowerPuff;
    }

    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner scanner = new Scanner(System.in);
        long lNumberIngredients = scanner.nextLong();
        
        String[] sQuantityIng = scanner.nextLine().split(" ");
        sQuantityIng = scanner.nextLine().split(" ");
        String[] sQuantityEachIng = scanner.nextLine().split(" ");

        long lCalcMinPowerPuff = 0L;

        lCalcMinPowerPuff = minimumfPowerPuff(lNumberIngredients, sQuantityIng, sQuantityEachIng);

        System.out.println(lCalcMinPowerPuff);
        scanner.close();
   }
}

