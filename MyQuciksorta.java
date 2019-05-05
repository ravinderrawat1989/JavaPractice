import java.util.Arrays;

public class MyQuciksorta {

	public static void main(String[] args) {

		int[] arr={4,2,8,6,1,0,-3,9,15,5};
		
		int low=0;
		int high=arr.length-1;
		
		System.out.println(Arrays.toString(arr));
		
		
		quickSorter(arr,low,high);
		System.out.println(Arrays.toString(arr));		
	}

	
	static void quickSorter(int[] arr,int low,int high){

		if(arr == null || arr.length==0) return ;
		
		if(high<=low) return;
		
		int pivotIndex=low + (high-low)/2;
		int pivot=arr[pivotIndex];
		

		int i=low , j=high;
		
		while(i<=j){
			
			while(arr[i]<pivot)
				i++;
			
			while(arr[j]>pivot)
				j--;
			
			
			if(i<=j){
				
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
			
		}
		
		
		if(low<j)
			quickSorter(arr, low, j);
		
		if(high>i)
			quickSorter(arr, i, high);
		
		
	}
	
}
