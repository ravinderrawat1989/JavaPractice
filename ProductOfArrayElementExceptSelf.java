public class ProductOfArrayElementExceptSelf {

	public static void main(String[] args) {
		
		int[] arr={1,2,4,6};

		for(int i:productExceptSelf(arr))
			System.out.print(i + " ");
		
		System.out.println();
		
		for(int i:productExceptSelfBetter(arr))
			System.out.print(i + " ");
	}

	
	public static int[] productExceptSelfBetter(int[] arr) {
		
		int[] mult=new int[arr.length];
				
		int product=1;
		
		for(int i=0;i<arr.length;i++){
			product*=arr[i];
		}
		
		for(int i=0;i<arr.length;i++){
			mult[i]=product/arr[i];
		}
		
		return mult;
		
	}
	
	
	public static int[] productExceptSelf(int[] arr) {
		
		int product=1;
		
		int[] mult=new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			
			for(int j=0;j<arr.length;j++){
				
				if(i==j)
					continue;
				
				product*=arr[j];
								
			}
			
			mult[i]=product;
			product=1;
		}		
		
		return mult;
	}
	
}