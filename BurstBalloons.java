import java.util.Arrays;

public class BurstBalloons {

	/*
	 * 
	 * Given n balloons, indexed from 0 to n-1. Each balloon is painted with a number on it represented by array nums. You are asked to burst all the balloons. If the you burst balloon i you will get nums[left] * nums[i] * nums[right] coins. Here left and right are adjacent indices of i. After the burst, the left and right then becomes adjacent.

Find the maximum coins you can collect by bursting the balloons wisely.

Note:

You may imagine nums[-1] = nums[n] = 1. They are not real therefore you can not burst them.
0 ≤ n ≤ 500, 0 ≤ nums[i] ≤ 100

Input: [3,1,5,8]
Output: 167 
Explanation: nums = [3,1,5,8] --> [3,5,8] -->   [3,8]   -->  [8]  --> []
             coins =  3*1*5      +  3*5*8    +  1*3*8      + 1*8*1   = 167
	 * */
	public static void main(String[] args) {

		int arr[]= {3,1,5,8};
		
		System.out.println(maxCoins(arr));
		
	}

	
    public static int maxCoins(int[] nums) {
    		
        // Extend list with head and tail (both are 1), index starts at 1
        int array[] = new int[nums.length + 2];
        array[0] = 1;
        array[array.length-1] = 1;
        for (int i = 0; i < nums.length; i++) {
            array[i+1] = nums[i];
        }

        int dp[][] = new int[array.length][array.length]; //dp[i][j] stands for max coins at i step, burst j


        for (int i=1; i< array.length-1; i++) {
            for (int j=i; j >=1; j--) {
                // k as last
                for (int k=j; k <= i; k++) {
                    
                		if(k==2)
                			System.out.println("dp[i][j]" + dp[j][i]);
                		
                		dp[j][i] = Math.max(array[j-1]*array[k]*array[i+1] + dp[j][k-1] + dp[k+1][i], dp[j][i]);
                    
                    
                    
                }
            }
        }

        System.out.println(Arrays.toString(dp[0]));
        System.out.println(Arrays.toString(dp[1]));
        System.out.println(Arrays.toString(dp[2]));
        System.out.println(Arrays.toString(dp[3]));
        
        
        return dp[1][array.length-2];
    }	
    
}
