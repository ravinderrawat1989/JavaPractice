package oneMorePractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list=new ArrayList<>();
		list.add("aaaa");
		list.add("aa");
		list.add("a");
		Collections.sort(list, new Comparator<String>() {

			public int compare(String a,String b){
				return a.length()-b.length();
			}
			
		});
		
		
		System.out.println(wordBreak("aaaaaaaa",list));
	}

	
	 public static boolean wordBreak(String s, List<String> wordDict) {
		    Collections.sort(wordDict, new Comparator<String>() {

				public int compare(String a,String b){
					return a.length()-b.length();
				}
				
			});
			
	        
	        for(int i=0;i<wordDict.size();i++){
	            
	            String str=wordDict.get(i);
	            
	            if(s.contains(str)){
	                s=s.substring(s.indexOf(str)+str.length());
	                i=0;
	            }
	            
	            if(s.isEmpty())
	                break;
	        }
	        
	        return s.isEmpty();
	 }
}
