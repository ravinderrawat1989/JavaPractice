
public class MaximumSubarray1 {

	public static void main(String[] args) {

		//int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		//int[] arr= {-1,2,3,-5,4,3,4,-9};
		
		int[] arr= {-1,2,3,2};
		
		System.out.println(maxSubArray(arr));
	}

	
    public static int maxSubArray(int[] nums) {
    	
    		int[] sum = new int[nums.length];
    		
    		int maxSoFar=sum[0]=nums[0];

    		for(int i=1;i<sum.length;i++) {
    			
    			sum[i]=Math.max(sum[i-1] + nums[i], nums[i]);
    			maxSoFar=Math.max(maxSoFar, sum[i]);
    		}
    		
    		return maxSoFar;
    }
    
}
