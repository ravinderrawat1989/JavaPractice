
public class Power {

	public static void main(String[] args) {
		
		System.out.println(pow(2,4));
	}

	 static  double pow(int x, int n) {
	        if(n>=0)
	            return powPositive(x,n);
	        else
	            return 1/powPositive(x,-n);
	    }
	    
	 static  int powPositive(int x, int n) {
		 
	        if(n==0) return 1; // base case
	     
	        int res = powPositive(x, n/2);
	        
	        res *= res;
	        
	        if(n%2 ==1)
	        	res *= x;
	        
	        return res;
	    }
}
