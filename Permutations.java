package oneMorePractice;

import java.util.ArrayList;

public class Permutations {

	public static void main(String[] args) {

		String a="ABC";
		
		char[] ch=a.toCharArray();
		permute(ch);
	}

	
	public static  ArrayList<ArrayList<Character>> permute(char[] ch){
		
		ArrayList<ArrayList<Character>> result = new ArrayList<ArrayList<Character>>();
		result.add(new ArrayList<Character>());
		
		for(int i=0;i<ch.length;i++){
			
			ArrayList<ArrayList<Character>> current = new ArrayList<ArrayList<Character>>();
			
			
			for (ArrayList<Character> l : result) {
				
				for (int j = 0; j < l.size()+1; j++) {
					
					
					l.add(j, ch[i]);
					ArrayList<Character> temp = new ArrayList<Character>(l);
					current.add(temp);
					System.out.println(temp);
					l.remove(j);
				}
				
				
			}
			result = new ArrayList<ArrayList<Character>>(current);
		}
		
		return result;
	}
	
}
