
public class NonDecreasingArray {

	public static void main(String[] args) {

		int[] arr = {2,3,3,2,4};
		
		boolean firstAlreadyFound=false;
		boolean secondFound=false;
//		if(arr.length==0 || arr.length==1 || arr.length==2)
//			return true;
		
		for(int i=0;i<=arr.length-2;i++) {
			
			if( arr[i+1] < arr[i]  &&  !firstAlreadyFound && (i+1) != arr.length-1)
				{
					firstAlreadyFound=true;
					
					if( (arr[i]+1) <= arr[i+2])
						arr[i+1]=arr[i]+1;
					else if(i>0  &&  arr[i-1]+1 <= arr[i+1] )
						arr[i]=arr[i-1]+1;
					
		             if((i-1)>=0)
		              i=i-1;
				}
			else if(arr[i+1] > arr[i] || arr[i+1] == arr[i]) {
				secondFound=false;
			}
			else if(firstAlreadyFound) {
				secondFound=true;
				break;
			}
			
			
			
		}
		
		System.out.println( !secondFound);
	}

}
