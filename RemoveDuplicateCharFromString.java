package oneMorePractice;

public class RemoveDuplicateCharFromString {

	public static void main(String[] args) {

		String str="Ravinder Singh Rawat 1233111";
		
		StringBuffer stb=new StringBuffer();
		
		 boolean seen[] = new boolean[256];
		
		char[] chArr=str.toCharArray();
		
		seen['a'] = true;
		
		for(char ch:chArr){
			
			if(!seen[ch])
			{
				seen[ch]=true;
				stb.append(ch);
			}
			
		}
		
		System.out.println(stb.toString());
 
	}

	
}
