
public class HouseRobber {

	public static void main(String[] args) {
		
		int[] nums= {2,7,9,3,1};
		//int[] nums= {1,3,1};
		//int nums[]= {2,1,1,2};
		
		System.out.println(rob(nums));
		
	}

	
    public static int rob(int[] nums) {
    		
		if(nums.length==0 )
			return 0;
		
		if(nums.length==1)
            return nums[0];
            
        if(nums.length==2)
			return Math.max(nums[0],nums[1]);
        
        
    		int[] sum=new int[nums.length];

    		sum[0]=nums[0];
    		sum[1]=Math.max(nums[0], nums[1]);
    		
    		
    		for(int i=2;i<sum.length;i++) 	
    			sum[i]=Math.max(sum[i-2]+nums[i], sum[i-1]);
    		
    		return sum[sum.length-1];
    }
}
