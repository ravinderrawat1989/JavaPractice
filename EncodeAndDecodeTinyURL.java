import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyURL {

	static HashMap<String,String> map= new HashMap<>();
	
	public static void main(String[] args) {

		String str="https://leetcode.com/problems/design-tinyurl";
		
		System.out.println(encode(str));
		System.out.println(decode(encode(str)));
	}

	
	
	
    // Encodes a URL to a shortened URL.
    public static String encode(String longUrl) {
    	
    		if(!longUrl.startsWith("http"))
    			return "";
    		
    		String longUrlTemp=longUrl.substring(longUrl.indexOf("://"));
    		
    		String hashed= "http://tinyurl.com/" + longUrlTemp.hashCode() ;
    		map.put(longUrl,hashed);
    		
		return hashed;
        
    }

    // Decodes a shortened URL to its original URL.
    public static String decode(String shortUrl) {
    		
    		String output="";
    	
    		for(Map.Entry<String,String> s : map.entrySet()) {
    			
    			if( s.getValue().equalsIgnoreCase(shortUrl)) {
    				output=s.getKey();
    			}
    		}
    	
		return output;
        
    }
	
	
	
}
