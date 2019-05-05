
public class SearchInsertPosition {

	public static void main(String[] args) {
		int a[]={1,3,3,3,5,5,6};
		System.out.println(searchInsertPosition(a,7));
		
	}

	static int searchInsertPosition(int[] array,int target){
	
		
		int i=0;
		int j= array.length-1;
		
		while(i<=j){
		
			int mid=(i+j)/2;
			
			if(target > array[mid]){
				i=mid+1;
			}else if(target < array[mid]){
				j=mid-1;
			}else 
				return mid;
			
		}
		return i;		
	}
	
}
