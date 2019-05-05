package oneMorePractice;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {

		int[] a1={1,2,3,4};
		int[] a2={3,4,5,6};
		
		
		mergeSortedArray(a1,a2);
		
	}

	
	static void mergeSortedArray( int[] a,int[] b){
		
		if(a==null || a.length==0) return ;
		
		if(b==null || b.length==0) return ;
		
		int newArrayLen=a.length+b.length;
		int[] c = new int [newArrayLen];
		
		int countA=0;
		int countB=0;
		
		int i=0;
				
		for( i=0;i<newArrayLen;i++){
			
			if(countA< a.length && countB<b.length &&  a[countA] < b[countB]){
				c[i]=a[countA++];
				
			}else if(countA< a.length && countB<b.length){
				c[i]=b[countB++];
				
			}else{
				break;
			}

		}
		
		
		if(countA>=a.length){ //Array A ended 
			
			int temp=i;
			
			for(int k = countB; k < b.length;k++)
				c[temp++] = b[k];
		
		}
		
		if( countB>=b.length ){
			int temp=i;
			
			for(int k = countA; k < a.length;k++)
				c[temp++] = a[k];			
		}
		
		
		
		System.out.println(Arrays.toString(c));
	}
	
	
	
}
