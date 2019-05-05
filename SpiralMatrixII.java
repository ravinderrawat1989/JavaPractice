
public class SpiralMatrixII {

	public static void main(String[] args) {

		int n=4;
		
		int[][] arr=new int[n][n];
		
		if(arr.length==0)
			return;

		
		int top=0;
		int down=arr[0].length-1;
		int left=0;
		int right=arr[0].length-1;
		n=1;
		while(true){
		
			for(int j=left;j<=right;++j)
				arr[top][j]=n++;			
			top++;
		
			if(top>down || left>right) break;
			
			for(int k=top;k<=down;++k)
				arr[k][right]=n++;
			right--;
			
			for(int k=right;k>=left;--k)
				arr[down][k]=n++;
			down--;

			if(top>down || left>right) break;
			
			for(int k=down;k>=top;--k)
				arr[k][left]=n++;
			left++;
			
			
			if(top>down || left>right) break;
		}
		
		
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
	}

	
}
