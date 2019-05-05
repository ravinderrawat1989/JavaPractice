
public class SingleElementInASortedArray {

	public static void main(String[] args) {

		int arr[]= {3,3,7,7,10,11,11};
		
		int temp=-111;
		
		temp=arr[0];
		
		for(int i=1;i<arr.length-1;i++) {
			
			if(arr[i] == temp) {
				i++;
				temp=arr[i];
			}else {
				break;
			}
			
		}
		
		System.out.println(temp);
		
 	}

}
