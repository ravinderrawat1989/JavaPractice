package oneMorePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
 
class CoinChangeDP
{
    static long countWays(int S[], int m, int n)
    {
        //Time complexity of this function: O(mn)
        //Space Complexity of this function: O(n)
 
        // table[i] will be storing the number of solutions
        // for value i. We need n+1 rows as the table is
        // constructed in bottom up manner using the base
        // case (n = 0)
        long[] table = new long[n+1];
 
        // Initialize all table values as 0
        Arrays.fill(table, 0);   //O(n)
 
        // Base case (If given value is 0)
        table[0] = 1;
 
        // Pick all coins one by one and update the table[]
        // values after the index greater than or equal to
        // the value of the picked coin
        for (int i=0; i<m; i++)
            for (int j=S[i]; j<=n; j++)
                {
            	
            	table[j] += table[j-S[i]];
            	System.out.println("i=" +i + " n="+n +  " j="+j + " table[j]=" + table[j]);
                }
 
        return table[n];
    }
 
    // Driver Function to test above function
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3};
        int m = arr.length;
        int n = 4;
        System.out.println(countWays(arr, m, n));
        Map<Integer,Long> computedValues = new HashMap<Integer, Long>();
        computedValues.put(1,1L);
        computedValues.put(2,1L);
        System.out.println(fibonacci(40,computedValues));
        //System.out.println("fibonacciOld "+fibonacciOld(10));
        System.out.println(" fibonacciDP " + fibonacciDP(40));
    }
    
    public static long fibonacciOld(int n) {
    	
    	    return (n < 3) ? 1 : fibonacciOld(n-2) + fibonacciOld(n-1);
    	
    	}

    
    
    public static long fibonacci(int n,Map<Integer,Long> computedValues) {
    	
    		if(computedValues.containsKey(n)){
    			return computedValues.get(n);
    		}else{
    			 Long ll=fibonacci(n-1,computedValues ) + fibonacci(n-2,computedValues );
    			 computedValues.put(n,ll);
    			 return ll;
    		}
    		
    	}

    public static long fibonacciDP(int n) {
    	
//    	long[] results=new long[n+1];
//    	results[1]=1;
//    	results[2]=1;
//    	
//    	for (int i=3;i<=n;i++){
//    		
//    		results[i]=results[i-1]+results[i-2];
//    		
//    	}
//    	
//    	return results[n];

    	long n1=1;
    	long n2=1;
    	long current=2;
    	for (int i=3;i<=n;i++){
    		
    		current=n2+n1;
    		n1=n2;
    		n2=current;
    		
    	}
    	
    	return current;

    }
}