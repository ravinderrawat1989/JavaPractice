import java.util.Arrays;
import java.util.Random;

public class ShuffleAnArray {

	public static void main(String[] args) {
		
		int[] nums= {1,2,3};
		
		 Solution obj = new Solution(nums);
		 int[] param_1 = obj.reset();
		 int[] param_2 = obj.shuffle();
		System.out.println(Arrays.toString(param_1));
		System.out.println(Arrays.toString(param_2));
	}

}



class Solution {

	int[] nums;
	
    public Solution(int[] nums) {
        this.nums=nums;    	
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
		return this.nums;
        
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
    		
    		int[] cloned=this.nums.clone();
    		Random r=new Random();
    		
    		for(int i=0;i<cloned.length;i++) {
    			
    			int randomIndex= r.nextInt(cloned.length) ;
    			
    			if(i==randomIndex)
    				continue;
    			else {
    				int temp=cloned[i];
    				cloned[i]=cloned[randomIndex];
    				cloned[randomIndex]=temp;
    			}
    			
    		}
    	
		return cloned;
        
    }
}