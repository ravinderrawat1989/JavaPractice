import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {

	public static void main(String[] args) {
		
		String[] arr= { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<String> list=new ArrayList<String>();
 		StringBuffer strBuff=new StringBuffer(); 
		
		
		for(int i=0;i<arr.length;i++){
			
			if(arr[i] == null)
				continue;
			
			strBuff.delete(0,strBuff.length());
			strBuff.append("[" + arr[i] + ",");
			
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[j]==null)
					continue;
				
			
				
				if(arr[i].length() != arr[j].length())
					continue;
					
				char[] base=arr[i].toCharArray();
				char[] comp=arr[j].toCharArray();
				
				Arrays.sort(base);
				Arrays.sort(comp);
				
				if(Arrays.equals(base,comp)){
					strBuff.append(arr[j] + ",");
					arr[j]=null;
				}
				
				
			}
			
			list.add(strBuff.toString() + "]");
		}
		
		
		System.out.println(list);
		
	}

}
