package oneMorePractice;

import java.util.Arrays;

public class MyQuickSort {

	public static void main(String[] args) {

		int[] arr={3,1,-3,0,7,5};
		
		quickSorter(arr,0,arr.length-1);
		
		for(int i:arr)
			System.out.print(i + " ");
		
	}

	
	
	static void quickSorter(int[] arr,int low,int high){

		if(arr==null || arr.length<1) return ;
	
		if(low>=high) return ;
		
		int pivotIndex= low + (high-low)/2;
		int pivot=arr[pivotIndex];
		
		
		int i = low;
		int j = high;
		
		
	
		
		while(i<=j){
			
			while(arr[i] < pivot)
				i++;
			
			while(arr[j] > pivot)
				j--;
			
			if(i<=j){
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				i++;
				j--;
			}
			
		}

		if(low<j)
			quickSorter(arr,low,j);
		
		if(high>i)
			quickSorter(arr,i,high);
	}

		
}
