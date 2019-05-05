package oneMorePractice;

import java.util.Arrays;

public class MatrixArrays {

	public static void main(String[] args) {

		int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
		
		int[] arr1={3,6,-1,7,8,22};
		int[] arr2={13,1,5,7,0,9};
		//printMatrix(matrix);
		//rotateMatrix(matrix);
		
		//System.out.println();
		//printMatrix(matrix);
		pairWithMinimumDiff(arr1,arr2);
	}

	static void printMatrix(int[][] arr){
	
		System.out.println();
		
		for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++){
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
				
	}
	
	
	static void rotateMatrix(int[][] arr){
	
		for(int i=0;i<3/2 ; i++){
		
			for(int j=i;j<2;j++){
				
				int temp=arr[i][j];
				
				arr[i][j]=arr[j][3-1-i];
				arr[j][3-1-i]=arr[3-1-i][3-1-j];
				arr[3-1-i][3-1-j]=arr[3-1-j][i];

				arr[3-1-j][i]=temp;
			}
			
		}
		
	}
	
	
	static void pairWithMinimumDiff(int[] arr1,int[] arr2){
	
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		System.out.println(arr1[0] + " , " + arr2[0]);
		
	}
	
}
