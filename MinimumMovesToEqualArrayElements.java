import java.util.Arrays;

public class MinimumMovesToEqualArrayElements {

	public static void main(String[] args) {
		
		int[] arr= {1,2,5,8,0};
		
		System.out.println(noOfTries(arr));
	}
	
	
	static int noOfTries(int[] arr) {
		
		if(arr.length==1  || arr.length==0)
			return 0;

		if(arr.length==2)
			return Math.abs(arr[0]-arr[1]); 

		
		Arrays.sort(arr);
		
		int mid=(0+arr.length)/2;
		
		int valToReach=arr[mid];

		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			count+=Math.abs(valToReach-arr[i]);
			
		}
		
		return count;

	}

}
