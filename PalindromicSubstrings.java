
public class PalindromicSubstrings {

	public static void main(String[] args) {

		String str="abc";
		
		int count=0;
		
		for ( int i=0;i< str.length();i++) {
		
			for(int j=i;j<=str.length();j++) {
				
				if(str.substring(i, j).equals(""))
					continue;
				
				System.out.println( str.substring(i, j));
				if(isPalin(str.substring(i, j))) {
					
					count++;
				}
				
			}
			
			
		}
		
		System.out.println(count);
		
	}

	
	static boolean isPalin(String s) {
		
		StringBuffer buf=new StringBuffer(s);
		
		return s.equals(buf.reverse().toString()) ? true:false;
	}
	
}
