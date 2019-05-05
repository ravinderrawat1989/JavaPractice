
public class UniquePaths {

	public static void main(String[] args) {

		
		int m=3;
		int n=7;
		
		
		 if(m==0 || n==0) return ;
		 if(m==1 || n==1) return ;
		 
		    int[][] dp = new int[m][n];
		 
		    //left column
		    for(int i=0; i<m; i++){
		        dp[i][0] = 1;
		    }
		 
		    //top row
		    for(int j=0; j<n; j++){
		        dp[0][j] = 1;
		    }
		 
		    //fill up the dp table
		    for(int i=1; i<m; i++){
		        for(int j=1; j<n; j++){
		            dp[i][j] = dp[i-1][j] + dp[i][j-1];
		        }
		    }
		 
		
		System.out.println("counter =" + dp[m-1][n-1]);
	}

}
