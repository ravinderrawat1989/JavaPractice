import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {

		int[] num1= {1,9,3,0,0,0} , num2= {2,5,6,0,0};
		int m=3,n=3;
		
		if(num2.length == 0)
			return;
		
		int count=m;
		for(int i=0;i<n;i++) 
			num1[count++]=num2[i];

		for(int i=0;i<m+n;i++) {
			
			for(int j=i+1;j<m+n;j++) {
				
				if(num1[i] < num1[j] ) {
					
				}else {
					int temp=num1[j];
					num1[j]=num1[i];
					num1[i]=temp;
				}
				
			}
			
		}
		
		System.out.println(Arrays.toString(num1));
		
	}

}
