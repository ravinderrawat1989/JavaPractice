
public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {

		//int[] arr= {7,1,5,3,6,4};
		int[] arr= {};
		System.out.println(maxProfit(arr));
	}

	

    public static  int maxProfit(int[] prices) {
        
    		if(prices.length==0 || prices.length==1)
    			return 0;
    		
    		int[] sum=new int[prices.length];    		
    		
    		sum[0]=prices[0];
    		int maxSoFar=0;
    		
    		for(int i=1;i<sum.length;i++) {
    			
    			sum[i]=Math.min( prices[i],sum[i-1] );
    			
    			
    			maxSoFar=Math.max(maxSoFar, prices[i]-sum[i]);
    			
    		}
    		
    		return maxSoFar;
    	
    }
    
}
