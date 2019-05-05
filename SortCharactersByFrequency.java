package oneMorePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		
		
		System.out.println(frequencySortFast("BabBbBbBbbABBABBbAabbbABB"));
	}

	
    public static String frequencySortFast(String s) {
    	 int[][] count = new int[256][2];
         
         for(char c: s.toCharArray()) {
             count[c][0] = c;
             count[c][1]++;
         }
         
         Arrays.sort(count, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[1] == b[1] ? 0 : (a[1] < b[1] ? 1 : -1);
            } 
         });
         
         
         StringBuilder sb = new StringBuilder();
         for(int i=0; i<256; i++) {
             if (count[i][1] > 0) {
                 for(int j=0; j<count[i][1]; j++) {
                     sb.append((char)count[i][0]);
                 }
             }
         }
         
         return sb.toString();
    	
    }
    
	
    public static String frequencySort(String s) {
        
    	HashMap<Character,Integer> map=new HashMap<>(); 
        
    	for (char ch:s.toCharArray()){    	
    		
    		if(map.containsKey(ch)){
    			map.put(ch, map.get(ch)+1);
    		}
    		else
    			map.put(ch, 1);
    	}
    	
    	
    	Set<Entry<Character,Integer>> entry=map.entrySet();
    	
    	List<Entry<Character,Integer>> list=new ArrayList<Entry<Character,Integer>>(entry);
    	
    	
    	Collections.sort(list,new Comparator< Map.Entry<Character,Integer>>(){
    		
    		public int compare(Map.Entry<Character, Integer> o1,Map.Entry<Character, Integer> o2){
    			
    			return o2.getValue().compareTo(o1.getValue());
    		}
    	});
    	
    	String str="";
    	for(Entry<Character,Integer> entry1:list){
    		
    		for(int i=0;i<entry1.getValue();i++)
    			str+= entry1.getKey();
    	}
    		
    	
    	
    	return str;
    }
    
    
    
}
