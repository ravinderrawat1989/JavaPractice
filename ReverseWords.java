package oneMorePractice;

public class ReverseWords {

	public static void main(String[] args) {
		
		System.out.println(reverseWords("   a   b "));
		
	}

public static String reverseWords(String s) {
        
        s=s.trim();
        if(s.length()<=1) return s;
        
        String[] str=s.split(" ");
        
        StringBuffer buf=new StringBuffer();
        
        for(int i=str.length-1;i>=0;i--)
        {
            if(! (str[i].equals(" ") || str[i].equals("")) ) 
                 buf=buf.append(str[i]+" ");
        }
        
        return buf.toString().trim();
    }
}
