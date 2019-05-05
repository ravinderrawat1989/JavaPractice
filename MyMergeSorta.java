import java.util.Arrays;

public class MyMergeSorta {

	public static void main(String[] args) {

		int arr[]={4,0,2,1,-9,8,5,7,6};
		
		System.out.println(Arrays.toString(arr));
		
		int helper[] = new int[arr.length];
		mergeSort(arr,helper,0,arr.length-1);
		//System.out.println(Arrays.toString(arr));
		
	}

	
	public static int[] mergeSort(int[] arr,int[] helper,int low,int high){
		
		if(arr ==null || arr.length==0) return null;
		
		if(low<high){
			
			int mid=low + (high-low)/2;			
			
			mergeSort(arr,helper,low,mid);
			mergeSort(arr,helper,mid+1,high);
			
			System.out.println(Arrays.toString(arr));
		}
		
		return arr;
	}
	
	
	public static int[] merge(int[] arr,int[] helper,int low,int mid,int high){
		
		for(int i=low;i<=high;i++)
			helper[i]=arr[i];
		
		int i=low;
		int j=mid+1;
		int k=low;
		
		
		while(i<=mid && j<=high){
			
			if(helper[i]<=helper[j]){
				arr[k]=helper[i];
				i++;
			}else{
				arr[k]=helper[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid){
			arr[k]=helper[i];
			k++;
			i++;
		}
		
	
		return arr;
	}
	
	
}
