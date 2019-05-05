import java.util.Arrays;

public class ArrayArrangeMaxMinAlternatively {

	public static void main(String[] args) {

		int[] arr= {1, 6, 9, 4, 3, 7, 8, 2};
		//7,5,4,3,2,1
		//7,1,5,2,4,3
		
		System.out.println(Arrays.toString(sortInMaxMinOrder(arr)));
	}

	
	public static int[] sortInMaxMinOrder(int[] arr) {
		
		for(int i=0;i<arr.length;i=i+2) {
			
			int maxSoFar=Integer.MIN_VALUE;
			int minSoFar=Integer.MAX_VALUE;
			
			int minPosition=-1,maxPosition=-1;
			
			for(int j=i;j<arr.length;j++) {
				
				maxSoFar=Math.max(maxSoFar, arr[j]);
				if(arr[j]==maxSoFar)
					maxPosition=j;
				
				
				minSoFar=Math.min(minSoFar, arr[j]);
				if(arr[j] == minSoFar)
					minPosition=j;

			}
			
			int temp=arr[i];

			
			
			if(i==minPosition && i<arr.length-1) {
				
				arr[maxPosition]=arr[i+1];
				arr[i+1]=arr[minPosition];
				arr[minPosition]=maxSoFar;
			}else if(i< arr.length-1) {
				
				arr[i]=maxSoFar;
				arr[maxPosition]=temp;
				
				temp=arr[i+1];
				arr[i+1]=minSoFar;
				arr[minPosition]=temp;

			}
				

			
			

		}
		
		
		return arr;
	}
}
