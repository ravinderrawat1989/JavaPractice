import java.util.Arrays;

public class IntegerBreak {

	public static void main(String[] args) {

		System.out.println(integerBreak1(18));
	}

	
    public static int integerBreak1(int n) {
    	
    		int[] arr= new int[n+1];
    		
    		for(int i=0;i<arr.length;i++) {
    			
    			for(int j = 1;j<arr.length;j++)
    				
    				if(i+j <= n)
    					arr[i+j]=    Math.max(Math.max(arr[i], i)*Math.max(arr[j], j) , arr[i+j]);
    			
    		}
    		
    		return arr[arr.length-1];
    }
	
	
	
    public static int integerBreak(int n) {
    	
    	if(n==2) return 1;
    if(n==3) return 2;
    if(n==4) return 4;
 
    int result=1;
    if(n%3==0){
        int m = n/3;
        result = (int) Math.pow(3, m);
    }else if(n%3==2){
        int m=n/3;
        result = (int) Math.pow(3, m) * 2;
    }else if(n%3==1){
        int m=(n-4)/3;
        result = (int) Math.pow(3, m) *4;
    }
 
    return result;
    }	
    
}













//
//public class IntegerBreak {
//
//	public static void main(String[] args) {
//
//		System.out.println(integerBreak(11));
//	}
//
//	
//    public static int integerBreak(int n) {
//    		
//    		int len=(n/2)+2;
//    		int[][] product=new int[len][len];
//    		
//    		product[0][0]=0;
//    		product[0][1]=1;
//    		
//    		int maxSoFar=0;
//    		
//    		for(int i=0;i<len;i++) {
//    			
//    			for(int j=0;j<len;j++) {
//    				
//    				if(i>j)
//    					product[i][j]=product[j][i];
//    				else {
//    					
//    					if(n-i-j == 0)
//    						product[i][j] = (i*j);
//    					else	
//    						product[i][j] = (i*j*(n-i-j));
//    					
//    					maxSoFar=Math.max(maxSoFar,product[i][j] );
//    				}
//    					
//    				
//    				
//    			}
//    			
//    			
//    		}
//    		
//    	return maxSoFar;
//    	
//   }	
//    
//}
