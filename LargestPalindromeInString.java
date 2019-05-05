
public class LargestPalindromeInString {

	public static void main(String[] args) {
		
		String str="123ekabcba4kg321";
		
		System.out.println(getLargestPalindrome(str));
	}
	
	
	static String getLargestPalindrome(String str){
		
		if(str==null || str.length()==1)
			return str;
		
		StringBuffer buf=new StringBuffer(str);
		
		for(int i=1;i<buf.length()/2;i++){
			
			StringBuffer buf1= new StringBuffer(str.substring(0, i));	
			
			if(buf.lastIndexOf(buf1.reverse().toString() ) > 0 ){
				
				
			}else{
				String charfirst=buf1.charAt(0)+"";
				return getLargestPalindrome(str.substring(str.indexOf(charfirst)));
			}
			
		}
		
		if(buf!=null && buf.length()!=0 && buf.charAt(0)!=buf.charAt(buf.length()-1))
			buf.replace(buf.lastIndexOf(buf.charAt(0)+"")+1, buf.length(), "");
		
		return buf.toString();
		
		
	}

	
}
