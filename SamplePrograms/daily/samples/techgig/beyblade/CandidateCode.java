package daily.samples.techgig.beyblade;

import java.io.*;
import java.util.*;
public class CandidateCode {
	
	static long maxFightsTGRWin(long pNumberTestCase, long pNumberMembers, String[] pGTeamMember, String[] pOppTeamMember) {
		
		long maxFightsTGRWin = 0L;
		
		long lMinTestCase = 1L;
		long lMaxTestCase = 100000L;
		
		long lMinMembers = 1L;
		long lMaxMembers = 100000L;
		
		long lMinVal = 0L;
        long lMaxVal = Long.MAX_VALUE;
        
		//Constraint1: 1<= T <=100000
		if(!( pNumberTestCase >=lMinTestCase && pNumberTestCase <= lMaxTestCase)) {
			return maxFightsTGRWin;
		}
		
		//Constraint2: 1<= N <=100000
		if(!( pNumberMembers >=lMinMembers && pNumberMembers <= lMaxMembers)) {
			return maxFightsTGRWin;
		}
		
		
		//Constraint3: 0<= Power of Beyblade <= LLONG_MAX 
		return maxFightsTGRWin;
	}
    public static void main(String args[] ) throws Exception {

    	//Write code here
    	Scanner scanner = new Scanner(System.in);
    	long lNumberTestCase = scanner.nextLong();
    	long lNumberMembers = scanner.nextLong();
        
        String[] sGTeamMember = scanner.nextLine().split(" ");
        sGTeamMember = scanner.nextLine().split(" ");
        String[] sOppTeamMember = scanner.nextLine().split(" ");

        long lCalcMaxGTeamWin = 0L;

        lCalcMaxGTeamWin = maxFightsTGRWin(lNumberTestCase, lNumberMembers, sGTeamMember, sOppTeamMember);

        System.out.println(lCalcMaxGTeamWin);
        scanner.close();
        
   }
}


/*
9 7 6 6 5 5 3 3 2 1 - sorting in increasing - false
0 0 2 2 3 6 6 6 7 9 - sorting array in decreasing 

3 9 7 5 5 3 6 2 6 1 - keeping the value and searching for highest - false

right solution:
3 9 1 2 5 7 3 5 6 6 - solution find the nearest highest value of the current opponent in given strength and replace


3 9 1 2 5 7 3 5 6 6 
2 7 0 9 3 6 0 6 2 6
*/	