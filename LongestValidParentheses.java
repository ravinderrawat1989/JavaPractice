
public class LongestValidParentheses {

	public static void main(String[] args) {

		String s="()((()))";
		
		System.out.println(longestValidParentheses(s));
		
	}

    public static int longestValidParentheses(String s) {
    	
    		char[] chArr=s.toCharArray();
    		int len=chArr.length;
    		
    		int maxSoFar=0;
    		
    		int[] dp=new int[len];
    		
    		for(int i=1;i<dp.length;i++) {
    			
    			int oneBefore=i -dp[i-1] -1;
    			
    			if(chArr[i] == ')' && chArr[i-1]=='(') {
    				
    				dp[i]= (i>=2 ? dp[i-2]:0)+2;
    				
    			}
    			else if(chArr[i] == ')' && chArr[i-1]==')' && oneBefore >= 0   && chArr[oneBefore] == '(') {
    				
    				dp[i]=dp[i-1] +  ( oneBefore >=1 ? dp[oneBefore-1]:0 )      + 2;
    				
    			}
    				
    			maxSoFar=Math.max(maxSoFar, dp[i]);
    			
    		}
    	
		return maxSoFar;
        
    	
    }
}
