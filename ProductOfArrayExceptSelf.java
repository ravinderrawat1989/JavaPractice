import java.util.Arrays;
import java.util.BitSet;

public class ProductOfArrayExceptSelf {

	public static void main(String[] args) {

		int[] nums= {1,2,3,4};
		
		int[] result = new int[nums.length];
		 
		
		result[0]=1;
		for(int i=0;i<result.length-1;i++) {			
			result[i+1]=result[i]*nums[i];			
		}

		
		int[] result1 = new int[nums.length];
		result1[nums.length-1]=1;
		for(int i=result1.length-2;i>=0;i--) {			
			result1[i]=result1[i+1]*nums[i+1];			
		}
		
		
		for(int i=0;i<nums.length;i++)
			nums[i]=result[i]*result1[i];
		
		    
		System.out.println(Arrays.toString(nums));
	}

}
