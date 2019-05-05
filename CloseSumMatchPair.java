import java.util.Arrays;
import java.util.HashMap;

public class CloseSumMatchPair {

	public static void main(String[] args) {
	
		int a[] = { 1,4,0,5,7,2,-3};
		int match=5;
		findCloseMatch(a,match);
		
	}

	
	static void findCloseMatch(int[] numbers,int target){
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
	 
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index ;
				result[1] = i;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
		
		System.out.println(result[0] + " " + result[1] + result[2]);
		
		
		
		
	}
	
	static void findCloseMatch1(int[] a,int match){
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<a.length;j++){
				
				if(i==j)
					continue;
				
				map.put((a[i] + a[j]), a[i]+","+a[j]);
				
			}
			
		}
				
		System.out.println(map.get(match));
	}
	
}
