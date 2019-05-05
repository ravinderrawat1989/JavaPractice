
public class PlusOne {

	
	public static void main(String[] args) {

		int[] a={1,2,3,6,9,7,9,7};
		
		int carry=0;
		
		if ( a[a.length - 1] + 1 < 10){		
			a[a.length - 1] = a[a.length - 1] + 1;			
		}else{
			
			carry=1;
			a[a.length - 1] = a[a.length - 1] + 1 - 10;						
		}
		
		
		for(int i=a.length-2; i >=0 && carry==1 ;i--){
			
			if(a[i] + carry <10){
				a[i] =a[i] + carry;
				carry=0;
				
			}else{
				a[i] =a[i] + carry -10;
				carry=1;
			}
			
			
		}
		
		
		for(int k:a){
			System.out.print(k + " ");
		}
		
		
	}

}
