import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5,6,7};
		
		int k=2;
		
		int len=arr.length;
		int i=0;
		int temp=0;
		for(i=0;i<k;i++) {
			boolean firstTime=true;
			
			for(int j=0;j<len;j=j+1) {
				
				if(firstTime == true) {
					firstTime=false;
					temp=arr[(1+j)%len];
					arr[(1+j)%len] = arr[j];
				}
				else {
					int v= arr[(1+j)%len];
					arr[(1+j)%len] = temp;
					temp=v;
				}
					
					
				
				
			}
			
			
		}
		
	//	if(temp != Integer.MIN_VALUE)
	//		arr[k-1]=temp;
		
		System.out.println(Arrays.toString(arr));
	}

	
	
	
}
