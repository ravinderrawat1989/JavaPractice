package oneMorePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoStringsIsomorphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(" is checkIfIsomorphic  " + checkIfIsomorphic("foo","bar"));
		
		stringConjugate("12345689",3);
	}

	
	static boolean checkIfIsomorphic(String a1,String a2){
	
		if(a1==null || a2==null || a1.length()==0 || a2.length()==0 || a1.length() != a2.length())
			return false;
		
		HashMap<Character,Character> map=new HashMap<>();
		
		char[] ch1=a1.toCharArray();
		char[] ch2=a2.toCharArray();
		
		
		for(int i=0;i<ch1.length;i++){
			
			if(!map.containsKey(ch1[i])){
				map.put(ch1[i],ch2[i]);
			}else{
				
				if(map.get(ch1[i]) != ch2[i])
					return false;
			}
			
		}
		
		return true;
	}

	
	static void stringConjugate(String txt,int rows){

		StringBuffer sb=new StringBuffer();
		int columnCount=txt.length() / rows + 2;	

		char[] ch= txt.toCharArray();
		int stringLen=ch.length;
		
		for(int i=0;i<rows;i++){
			
			for(int j=0;j<columnCount;j++){
			
				int next=(int)(Math.random()*100 % stringLen);
				
				if(ch[next]!=' '){
					for(int k=0;k<stringLen;k++){
						if(ch[k]!=' '){
							next=k;
							break;
						}
							
					}
				}
				
				if(ch[next]!=' ' )
					{
						System.out.print(ch[next]+" ");
						sb.append(ch[next]);
						ch[next]=' ';						
					}else{
						sb.append(ch[(next+1)% stringLen]);
						System.out.print(ch[(next+1)% stringLen]);
						ch[(next+1)% stringLen]=' ';
					}
			}			
			System.out.println();
		}
					
			
				
			
		
		
//		System.out.println(sb.toString());
	}
}
