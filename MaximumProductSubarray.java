import java.util.Arrays;

public class MaximumProductSubarray {

	/*
	 * Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.


	 * */
	
	public static void main(String[] args) {
		
		int[] arr= {2,-1,1,1};
		System.out.println(maxProduct1(arr));
		System.out.println(maxProduct(arr));
		
	}

	public static int maxProduct1(int[] nums) {
		
		int[][] dp=new int[nums.length][nums.length];
		int maxSoFar=Integer.MIN_VALUE;
		
		for(int i=0;i<dp.length;i++) {
			
			for(int j=0;j<dp.length;j++) {
				
				if(j<i)
					continue;
				else if(i==j)
					dp[i][j]=nums[j];
				else
					dp[i][j]=dp[i][j-1]*nums[j];
				
				maxSoFar=Math.max(maxSoFar, dp[i][j]);
				
			}
			
			
			
		}
		
		return maxSoFar;
	}
	
    public static int maxProduct(int[] nums) {
    	
    	if(nums.length==1) return nums[0]; 
    	
    	int[] max=new int[nums.length];
    	int[] min=new int[nums.length];
    	
    	max[0]=min[0]=nums[0];
    	
    	int maxSoFar=nums[0];
    	
    	
    	for(int i=1;i<nums.length;i++) {
    		
    		if(nums[i]>0) {
    			max[i]=Math.max( nums[i], nums[i]*max[i-1]);
    			min[i]=Math.min( nums[i], nums[i]*min[i-1]);
    		}else {
    			
    			max[i]=Math.max( nums[i], min[i-1]*nums[i]);
    			min[i]=Math.min( nums[i], max[i-1]*nums[i]);
    		}
    		
    		maxSoFar=Math.max(maxSoFar, max[i]);
    	}
    	
    	
    	return maxSoFar;
    }
    
    
}
