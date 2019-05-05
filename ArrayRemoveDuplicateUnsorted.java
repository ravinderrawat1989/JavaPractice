
public class ArrayRemoveDuplicateUnsorted {

	public static void main(String[] args) {
		
		boolean hasOccured=false;
		int arr[] = {1,2,3,1,2,4,7,7,5};
		
		for(int i=0;i<arr.length;i++){
			
			hasOccured=false;
			
			for(int j=i-1;j>=0;j--){
				
				if(arr[i] == arr[j])
					{ arr[i]=99999;  break;}				
			}
			
		}
		
		
		for(int i:arr){
			if(i==99999)
				continue;
			System.out.println(i + ", ");
		}
		
		
	}
	
}
