import java.util.Arrays;

public class FindMaxProductUnsortedArray {

	public static void main(String[] args) {
		
		int arr[]={4,2,-1,3,7,5,0,-9,-12};
		
		int max=Integer.MIN_VALUE;
		//System.out.println(maxProduct(arr,max));
		System.out.println(findMaxProduct(arr,max));
		
	}
	
	static int maxProduct(int[] arr,int maxSoFar){
		
		if(arr.length==0) return maxSoFar;
		
		else if(arr.length==3){
		
			if(arr[0]*arr[1]*arr[2] > maxSoFar)
				maxSoFar=arr[0]*arr[1]*arr[2];
		}
		else{
			
			for(int i=1;i<arr.length-1;i++){
				if(arr[0]*arr[i]*arr[i+1] > maxSoFar)
					maxSoFar=arr[0]*arr[i]*arr[i+1];
			}
			
			return maxProduct(Arrays.copyOfRange(arr, 1, arr.length) , maxSoFar);
		}
		
				
		
		return maxSoFar;
	}

	
	static int findMaxProduct(int[] arr,int maxSoFar){
		
		int max=Integer.MIN_VALUE;
		int secondMax=Integer.MIN_VALUE;
		int thirdMax=Integer.MIN_VALUE;
		
		int firstMin=Integer.MAX_VALUE;
		int secondMin=Integer.MAX_VALUE;
		
		
		for(int i=0;i<arr.length-2;i++){
			
			if(arr[i]>max){
				max=arr[i];
			}
			
			if(arr[i]<firstMin){
				firstMin=arr[i];
			}
			
			if(arr[i+1] > secondMax && arr[i+1] < max)
				secondMax=arr[i+1];
			
			if(arr[i+2] > thirdMax && arr[i+2] < max)
				thirdMax=arr[i+2];
			
			if(arr[i+1] < secondMin && arr[i+1] >firstMin)
				secondMin=arr[i+1];
		
			if(arr[arr.length-1]<firstMin){
				firstMin=arr[arr.length-1];
			}
			
			if(arr[arr.length-1] < secondMin  && arr[arr.length-1] >firstMin)
				secondMin=arr[arr.length-1];
			
			
		}
		
		
		
		maxSoFar=Math.max( (max*secondMax*thirdMax), (max*firstMin*secondMin));
		
		
		return maxSoFar;
	}
}
