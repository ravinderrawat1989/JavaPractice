package oneMorePractice;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;
import java.util.Set;

import org.junit.Test;

public class LinkedHashMap1 {
	@Test
	public static void main(String[] args) {

		   LinkedHashMap<Integer, String> map 
		      = new LinkedHashMap<>(16, .75f, true);
		    map.put(1, null);
		    map.put(2, null);
		    map.put(3, null);
		    map.put(4, null);
		    map.put(5, null);
		    map.put(null, null);
		    map.put(null, null);
		    
		    
		    
		 
//		    Set<Integer> keys = map.keySet();
//		    assertEquals("[1, 2, 3, 4, 5]", keys.toString());
//		  
//		    map.get(4);
//		    assertEquals("[1, 2, 3, 5, 4]", keys.toString());
//		  
//		    map.get(1);
//		    assertEquals("[2, 3, 5, 4, 1]", keys.toString());
//		  
//		    map.get(3);
//		    assertEquals("[2, 5, 4, 1, 3]", keys.toString());
		
	}

}
