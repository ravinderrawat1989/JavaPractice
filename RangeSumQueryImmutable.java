public class RangeSumQueryImmutable {

	public static void main(String[] args) {

		int[] A= {-2, 0, 3, -5, 2, -1};
		
		NumArray aa= new NumArray(A);
		
		System.out.println(aa.sumRange(0, 2));
		System.out.println(aa.sumRange(2, 5));
		System.out.println(aa.sumRange(0, 5));
	}

}


class NumArray {

	int[] A;
	
    public NumArray(int[] nums) {
    	
    		if(nums.length==0)
    		{
    			return;
    		}
    	
    		A=new int[nums.length];
    		A[0]=nums[0];
    		    		
    		for(int i=1;i<A.length;i++) {
    			
    			A[i]=A[i-1]+nums[i];
    			
    		}
    		
    }
    
    public int sumRange(int i, int j) {
    		
    		if(j<i)
    			return -1;
    		else if(A==null)
    			return -1;
    		
    		if(i==0)
    			return A[j];
    		else
    			return A[j]-A[i-1];
    		
    }
}







































/*public class RangeSumQueryImmutable {

	public static void main(String[] args) {

		int[] A= {-2, 0, 3, -5, 2, -1};
		
		NumArray aa= new NumArray(A);
		
		System.out.println(aa.sumRange(0, 2));
		System.out.println(aa.sumRange(2, 5));
		System.out.println(aa.sumRange(0, 5));
	}

}




class NumArray {

	int[][] A;
	
    public NumArray(int[] nums) {
    	
    		if(nums.length==0)
    		{
    			A=new int[0][0];
    			return;
    		}
    	
    		A=new int[nums.length][nums.length];
    		A[0][0]=nums[0];
    		    		
    		for(int i=0;i<A.length;i++) {
    			
    			for(int j=1;j<A.length;j++) {
    				
    				if(j<i)
    					continue;
    				
    				A[i][j]=A[i][j-1]+nums[j];
    				
    			}
    			
    		}
    		
    }
    
    public int sumRange(int i, int j) {
    		
    		if(j<i)
    			return -1;
    		else if(A.length==0)
    			return -1;
    		
    		return A[i][j];
    		
    }
}*/