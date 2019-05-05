import java.util.Arrays;

public class CountingBits {

	public static void main(String[] args) {

//	For num = 5 you should return [0,1,1,2,1,2].

		//	0  - 0 
		//	1  - 1
		
		//  2  - 10  
		//  3  - 11
		
		//  4  - 100
		//  5   - 101 
		
		// 6       - 110
		
		 // 7      - 111
		//8			1000
		//9		1001
		//10		1010
		//11		1011	
		//12		1100
		// 13	1101
		//14		1110
		//15		1111
		//16		10000
		
		
		System.out.println(Arrays.toString(countBits(0)));
		
	}

    public static int[] countBits(int num) {
    	
    		if(num==0)
    			return new int[1];
    		
    		int[] arr=new int[num+1];	
    		
    		
    		arr[1]=1;
    		
    		if(num>=2)
    			arr[2]=1;
    		
    		if(num>=3)
    			arr[3]=2;
    		
    		
    		for(int i=4;i<arr.length;i++) {
    			
    			if(i%2==0) {
    				arr[i]=arr[i/2];
    			}else
    				arr[i]=arr[i-1]+1;
    			
    		}
    		
    		return arr;
    		
    }	
    
    
}
