package oneMorePractice;

public class PerfectSquares {

	public static void main(String[] args) {

		System.out.println(numSquares(13));
	}

    public static int numSquares(int n) {
        
    	int sqroot=(int) Math.sqrt(n);
    	
    	int[] arr=new int[sqroot];
    	
        for(int i=sqroot-1;i>=0;i--){        	
        	arr[i]=i*i;        	
        }
        
        
        
    }
}
