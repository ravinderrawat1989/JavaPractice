import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	/**
	 * [
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(generateParenthesis(3));
		
		//permute("abc",0,2);
	}
	
	
	public static List<String> generateParenthesis(int n) {
	    ArrayList<String> result = new ArrayList<String>();
	    dfs(result, "", n, n);
	    return result;
	}
	/*
	left and right represents the remaining number of ( and ) that need to be added. 
	When left > right, there are more ")" placed than "(". Such cases are wrong and the method stops. 
	*/
	public static  void dfs(ArrayList<String> result, String s, int left, int right){
	    if(left > right)
	        return;
	 
	    if(left==0&&right==0){
	        result.add(s);
	        return;
	    }
	 
	    if(left>0){
	        dfs(result, s+"(", left-1, right);
	    }
	 
	    if(right>0){
	        dfs(result, s+")", left, right-1);
	    }
	}

    	
    
    private static void permute(String str,int l,int r) {
    	
    		if(l==r)
    			System.out.println(str);
    		else {
    			
    			for(int i=l;i<=r;i++) {
    				
    				str=swap(str,l,i);
    				permute(str,l+1,r);
    				
    			}
    			
    		}
    		
    }
    

    private static String swap(String a,int i,int j) {
    		
    		char temp;
    		char[] charArry=a.toCharArray();
    		
    		temp=charArry[i];
    		charArry[i]=charArry[j];
    		charArry[j]=temp;
    		
    		return String.valueOf(charArry);
    		
    }
    
    
}
