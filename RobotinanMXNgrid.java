
public class RobotinanMXNgrid {

	/*
	 * Problem: A robot is located at the top-left corner of a m x n grid.
The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid .
How many possible unique paths are there?
	 * 
	 * */
	public static void main(String[] args) {
		
			int[][] arr= new int[5][5];
			System.out.println(getAllPossiblePathCount(arr));
	}
	
	
	public static int getAllPossiblePathCount(int[][] arr) {
		
		int rowLen=arr.length;
		int colLen=arr[0].length;
		
		for(int i=0;i<colLen -1 ;i++)
			arr[rowLen-1][i] = 1;
		
		for(int i=0;i<rowLen -1 ;i++)
			arr[i][colLen-1] = 1;

		for(int i=rowLen-2 ;i>=0;i--) {
			
			for(int j=colLen-2;j>=0;j--) {
				
				arr[i][j]=arr[i][j+1] + arr[i+1][j];
				
			}
			
		}
		
		return arr[0][0];
	}

}
