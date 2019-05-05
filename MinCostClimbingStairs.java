
public class MinCostClimbingStairs {

	public static void main(String[] args) {

	//	int[] cost= {10, 15, 20};
		int[] cost={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		
		int[] dp=new int[cost.length+1];
		dp[0]=0;
		dp[1]=0;
		
		for(int i=2;i<dp.length;i++) {
			
			dp[i]=Math.min( dp[i-2]+cost[i-2], dp[i-1]+cost[i-1]);
			
		}
		
		System.out.println(dp[dp.length-1]);
		
	}

}
