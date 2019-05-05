package oneMorePractice;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	public static void main(String[] args) {
		int[] a= {824,8247};
		
		System.out.println(largestNumber(a));

	}

	
	public static  String largestNumber(int[] nums) { 
		  String[] arr = new String[nums.length];
		    for(int i=0; i<nums.length; i++){
		        arr[i]=String.valueOf(nums[i]);
		    }
		 
		    Arrays.sort(arr, new Comparator<String>(){
		        public int compare(String a, String b){
		            return (b+a).compareTo(a+b);
		        }
		    });
		 
		    StringBuilder sb = new StringBuilder();
		    for(String s: arr){
		        sb.append(s);
		    }
		 
		    while(sb.charAt(0)=='0'&&sb.length()>1)
		        sb.deleteCharAt(0);
		 
		    return sb.toString();   
	}
}
