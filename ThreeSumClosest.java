import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		
		int[]  s = {-1,0,3,1,-2,2,-4};
		//sortLong(s);
		sortBetter(s);
	}
	
	
	
	public static void sortBetter(int s[]){
		
		Arrays.sort(s);
		int l,r;
		for (int i = 0; i < s.length - 2; i++){
			
			l = i + 1; 
			r = s.length  - 1;
			
			while (l < r  && l < s.length && r < s.length) 
            {
                if (s[i] + s[l] + s[r] == 2) 
                {
                    System.out.print("[" + s[i] + " ," + s[l]
                            + " ," + s[r] + "]");
                    break;
                }
                else if (s[i] + s[l] + s[r] < 2)
                 l++;
                 
                else
                  r--;
                	
            }
			
		}
		return;
	}
	
	
	public static void sortLong(int s[]){


		
		int sum=0;
		
		for(int i=0;i<s.length;i++){
			
			
			for(int j=i+1;j<s.length;j++){
				
				
				for(int k=j+1;k<s.length;k++){
				
					sum=s[i] + s[j] + s[k];
					
					if(sum==0)
						{System.out.println("["+s[i] + "," + s[j] + "," + s[k]+"]");}
				}	
				
            }			

			
            }			
			
			
			
		
	}
		
		
	
}
