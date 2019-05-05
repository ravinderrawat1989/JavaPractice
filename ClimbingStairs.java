
public class ClimbingStairs {

	public static void main(String[] args) {

		System.out.println(climbStairs(5));
		
	}

	
	public static int climbStairs(int n) {
		
		if(n==0 || n==1 || n==2)
			return n;
		
				
		int[] sum=new int[n];
		
		sum[0]=1;
		sum[1]=2;
        
		
		for(int i=2;i<n;i++) 
			sum[i]=sum[i-1]+sum[i-2];
		
		return sum[n-1];
    }
	
	
}
