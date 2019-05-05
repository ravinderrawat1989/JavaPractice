package oneMorePractice;

public class RemoveArrayDuplicates {

	public static void main(String[] args) {

	
		int[] arr={0,1,2,3,3,5,5,6};
		System.out.println("Before duplciate remocal" );
		printArray(arr);
		
		
		for(int i=0;i<arr.length-1;i++){
			
			if(arr[i] == arr[i+1]){
				arr[i]=-999;
			}									
		}
		
		
		int counter=0;
//		for(int i=0;i<arr.length;i++){
//			
//			for(int j=i+1;j<arr.length;j++){
//				
//				if(arr[j]==-999)
//					{;continue;}
//				else if(arr[i]==-999){
//					counter--;
//					arr[i]=arr[j];
//					arr[j]=-999;
//				}
//			}
//			
//		}
		
		printArray(arr);
		
		int k=0;
		int xx=0;
		for(int i=0;i<arr.length;i++){
			
			
			if(arr[i] == -999 ) //we need to swap with next number
			{	xx--;
				k=i;
				
				while( k < arr.length-1 && arr[k] == -999)
					{k++; xx++;}
				
			
				arr[i]=arr[k];
				arr[k]=-999;
				counter++;

			}else{
				counter++;
			}
			
		}
		
		
		
		
		System.out.println("xx "+xx);
		
		
		
		
		System.out.println("size= " + (arr.length-xx));
		
		printArray(arr);
	}

	
	static void printArray(int[] arr){
		for(int i:arr)
			System.out.print(i);
		
		System.out.println();
	}
}
