import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class ImplementToLowerCase {

	public static void main(String[] args) {

			String A = "this apple is sweet" , B = "this apple is sour";
			        Map<String, Integer> count = new HashMap<>();
			        for (String w : (A + " " + B).split(" "))
			            count.put(w, count.getOrDefault(w, 0) + 1);
			        ArrayList<String> res = new ArrayList<>();
			        for (String w : count.keySet())
			            if (count.get(w) == 1)
			                res.add(w);
	        
		
	    
	     System.out.println(res);   
	        
	}
}
