package oneMorePractice;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("longest palindrome " + longestPalin("123101321012458"));
	}


	
	static String longestPalin(String str){
		
		int maxSoFar=Integer.MIN_VALUE;
		String output=null;
		
		if(str.length() < 2 ) return str;
		
		char[] ch = str.toCharArray();
		
		for(int i=0;i<str.length()/2;i++){

			for(int j=i;j<str.length();j++){
				
				if(hasPalindrome(ch,i,j)  && (j-i+1) > maxSoFar){
					maxSoFar=j-i+1;
					output=str.substring(i, j+1);
				}
				
			}
			
		}
		
		return output;
	}	
	
		
	static boolean hasPalindrome(char[] ch,int startIndex,int endIndex){
	
		boolean isPalidrom=true;
		
		while(startIndex<endIndex){
		
			if(ch[startIndex] != ch[endIndex] ){
				isPalidrom=false;
				break;
			}else{
				startIndex++;
				endIndex--;
			}
				
		}	
		return isPalidrom;
	}
		
		
		
		
	
	
}
