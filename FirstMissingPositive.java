import java.util.BitSet;

public class FirstMissingPositive {

	public static void main(String[] args) {

		int[] a={1,2,0};
		
		
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]<min  ){
				min=a[i];
			}
			if(a[i]>max){
				max=a[i];
			}
			
		}
		//create new array max-min+1 size
		
		int[] b1= new int[max-min+1];
		
		
		BitSet b=new BitSet(max-min+1);
		b.set(Math.abs(min));
		b.set(max);
		
		
		for(int i=0;i<(max-min+1);i++){
			int next=b.nextClearBit(i);
			
			if( next +min <0 ){
				continue;
			}else if(next + min >0){
				boolean found=true;
				for(int x:a){
					if( x== next )
					{found=false;}	
						
				}
				
				if(found==true){
					System.out.println(next);
					break;
				}else{
					found=true;
				}
			}
			
		}
	}

}
