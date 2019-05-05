import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayNesting {

	public static void main(String[] args) {

		int[] nums ={5,4,0,3,1,6,2};
		System.out.println(Arrays.toString(nums));
		System.out.println(arrayNesting(nums));		
		System.out.println(Arrays.toString(nums));
	}

	
	private static int arrayNesting(int[] nums) {
		
		
		int max=-999;
		
		for(int i=0;i<nums.length;i++) {
			
			
			int count=i;
			int counter=0;

			while( count < nums.length &&  nums[count] != Integer.MIN_VALUE ) {
				int tt=count;
				count=nums[count];
				counter++;
				nums[tt]=Integer.MIN_VALUE;
			}
			
			if(counter>max)
				max=counter;
						
		}
		
		
		return max;
	}
	
	
}
