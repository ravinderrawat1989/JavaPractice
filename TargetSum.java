import java.util.Arrays;

public class TargetSum {

	/**
	 * 
	 * Input: nums is [1, 1, 1, 1, 1], S is 3. 
Output: 5
Explanation: 

-1+1+1+1+1 = 3
+1-1+1+1+1 = 3
+1+1-1+1+1 = 3
+1+1+1-1+1 = 3
+1+1+1+1-1 = 3
	 * 
	 *   1,1,1    3
	 *   1+1+1  3
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
//		int[] arr= {1,2,3};
//		System.out.println(findTargetSumWays(arr,4));
		
		int[] arr= {0,0,0,0,0,0,0,0,1};
		System.out.println(findTargetSumWays(arr,1));
	}
	
	
    public static int findTargetSumWays(int[] nums, int S) {
    	
    	int sum=0;
    	for(int i=0;i<nums.length;i++)
    		sum+=nums[i];
    	
    	if(sum<S)
    		return 0;
    	
    	
    	
    	int[][] dp = new int[nums.length+1][nums.length+1];

    	int counter=0;
    	
    	for(int i=0;i<dp.length;i++) {
    		
    		if(i==0)
    			dp[0][0]=0;
    		else
    			dp[i][0]=-nums[i-1];
    		
    		for(int j=1;j<dp.length;j++) {
    			
    			if(i==j)
    				dp[i][j]=dp[i][j-1];
    			else
    				dp[i][j]=dp[i][j-1]+nums[j-1];
    			    			
    		}
    		
    		if(dp[i][dp.length-1] == S)
    			counter++;
    		
    	}
    	
    	System.out.println(Arrays.toString(dp[0]));
    	System.out.println(Arrays.toString(dp[1]));
    	System.out.println(Arrays.toString(dp[2]));	
    	System.out.println(Arrays.toString(dp[3]));
    	System.out.println(Arrays.toString(dp[4]));
    	System.out.println(Arrays.toString(dp[5]));
    	System.out.println(Arrays.toString(dp[6]));
    	System.out.println(Arrays.toString(dp[7]));
    	System.out.println(Arrays.toString(dp[8]));
    	System.out.println(Arrays.toString(dp[9]));
    	return counter;
    }

}
