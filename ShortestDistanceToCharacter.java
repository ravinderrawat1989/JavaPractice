import java.util.Arrays;
import java.util.BitSet;

public class ShortestDistanceToCharacter {

	public static void main(String[] args) {

		String S = "loveleetcode";
		char C='e';
		
		int len = S.length();
		
		int[] arr = new int[len];

		char[] charArr = S.toCharArray();
		
		int lastIndexOfChar=0;
		

		BitSet bset = new BitSet();
				
		for ( int i=0;i<charArr.length;i++) {	
			if( charArr[i] == C )
				bset.set(i);
		}
		
		
		
		int lastFoundIndex=-999;
		
		
		for( int i = 0; i <= charArr.length -1 ; i++ ) {
			
			if( charArr[i] == C ) {
				arr[i]=0;	
				lastFoundIndex=i;

			}else {
				
				int k=bset.nextSetBit(i);
				
				if( Math.abs( i - lastFoundIndex ) < Math.abs( i - k ) ) {
					
					arr[i] = Math.abs( i - lastFoundIndex );
					
				}else {
					
					arr[i] = Math.abs( i -k );
				}
				
			}
			
			
		}
		
		
		
		
		System.out.println(Arrays.toString(arr));
		
	}

}
