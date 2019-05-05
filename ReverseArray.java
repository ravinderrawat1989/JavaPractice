
public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,6,7,8};
		
		System.out.println("Before reverse");
		for(int i:arr)
			System.out.print(i + " ");
		
		int j=arr.length-1;
		int temp;
		for(int i=0;i<=arr.length/2;i++){
			
			temp=arr[i];
			arr[i]=arr[j-i];
			arr[j-i]=temp;			
		}
		
		System.out.println("After reverse");
		for(int i:arr)
			System.out.print(i + " ");
		
		
		
	}

}
