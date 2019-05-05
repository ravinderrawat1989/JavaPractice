package oneMorePractice;

import java.math.BigInteger;

public class SuperPow {

	/*Your task is to calculate ab mod 1337 where a is a positive integer and b is an extremely 
	 * large positive integer given in the form of an array.
	 */
	
	public static void main(String[] args) {
		
		superPow(2,new int[]{1,2,3,4});
	}

    public static void superPow(int a, int[] b) {
        
    	BigInteger big = BigInteger.valueOf(2)
                .pow(1234)
                .add(BigInteger.ONE);
    	
    
    	System.out.println(big.mod(BigInteger.valueOf(1337)).intValue());
    }
}
