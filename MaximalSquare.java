import java.util.Arrays;

public class MaximalSquare {

	/*
	 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.
	 * 
	 * Input: 

1 0 1 0 0
1 0 1 1 1
1 1 1 1 1
1 0 0 1 0

Output: 4
	 * 
	 * */
	
	public static void main(String[] args) {
		
		char[][] arr= { {'0','0','0'},{'0','0','0'},{'0','0','0'},{'0','0','0'}};
		
		System.out.println(maximalSquare(arr));
	}

    public static int maximalSquare(char[][] matrix) {
    	
        if(matrix.length==0)
            return 0;
    	
    		int rowCount=matrix.length;
    		int colCount=matrix[0].length;
    		
    		int[][] dp=new int[rowCount+1][colCount+1];
    		
    		int maxSoFar=0;
    		
    		for(int i=1;i<=rowCount;i++) {
    			
    			for(int j=1;j<=colCount;j++) {
    				
    				if( matrix[i-1][j-1] =='0' )
    					dp[i][j]=0;
    				else
    				{
    					int temp=Math.min(dp[i][j-1], dp[i-1][j]);
    					temp=Math.min(temp, dp[i-1][j-1]);
    					dp[i][j]=temp +  ( (int)matrix[i-1][j-1]-48 );
    				}
    				
    				maxSoFar=Math.max(maxSoFar, dp[i][j]);
    			}
    			
    		}
    		    		
    		return maxSoFar*maxSoFar;
        
    }
    
}