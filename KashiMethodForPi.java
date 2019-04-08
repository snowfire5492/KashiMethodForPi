 /**
 * CS 301: Numerical Methods
 * Professor: A. Khakpour
 *
 * Computer Exercise: 1.2 (handout)
 *
 * @author - Eric Schenck
 * last modified: June 30, 2017
 *   
 */

public class KashiMethodForPi {
	public static void main(String[] args){
		
		float cn = 0;				// initializing all to zero to please java
		float an = 0;		
		float pi = 0;
		float temp = 0;
		float c1 = (float) Math.sqrt(3);
		boolean firstIt = true;		// used to keep track of initial iteration
		
		int n = 6;					// was discovered that n = 6 is most 
									// accurate value of n
		
		
		for (int i=1; i < n; ++i){
			
			if(firstIt == false){
				cn = (float) Math.sqrt(2 + temp);	// calculate value of cn
				temp = cn;			// store value of cn into temp
			}else {// initially true
				temp = (float) Math.sqrt(2 + c1);	// initial calc to get C2
				firstIt = false;
			}
		}
		
		an = (float)Math.sqrt( 4 - (cn*cn));
		
		pi = an * (float)(1.5 * Math.pow(2, n));
		
		System.out.printf("The value of Pi is %.16f", pi);
	}
}
