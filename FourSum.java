import java.util.Arrays;

public class FourSum {

	public static void main(String[] args) {
		
			
			int[]  s = {1, 0, -1, 0, -2, 2};
			//sortLong(s);
			sortBetter(s);
		}
		
		
		
		public static void sortBetter(int s[]){
			
			Arrays.sort(s);
			int l,r,m;
			for (int i = 0; i < s.length - 2; i++){
				
				l = i + 1; 
				m = i + 2;
				r = s.length  - 1;
				
				while (l < r  && l < s.length && r < s.length) 
	            {
	                if (s[i] + s[l] +  s[m] + s[r] == 0) 
	                {
	                    System.out.print("[" + s[i] + " ," + s[l]
	                            + " ," + s[m] +"," + s[r] + "]");
	                    break;
	                }
	                else if (s[i] + s[l] + s[m] + s[r] < 0)
	                 {l++;
	                 m++;
	                 }
	                else
	                  r--;
	                	
	            }
				System.out.println();
			}
			return;
		}
		
		

}
