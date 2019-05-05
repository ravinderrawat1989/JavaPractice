
public class FlippinganImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  public int[][] flipAndInvertImage(int[][] A) {
	        
	        int rows=A.length;
	        int columns=A[0].length;
	        
	        for(int i=0;i<rows;i++){
	            
	            int count=0;
	            for(int j=columns-1;j>=0;j--){
	                
	                if(count==j)
	                    continue;
	                
	                int temp=A[i][j];
	                A[i][j]=A[i][count];
	                A[i][count]=temp;
	                
	                if(A[i][j]==0)
	                    A[i][j]=1;
	                else
	                    A[i][j]=0;
	                
	                if(A[i][count]==0)
	                    A[i][count]=1;
	                else
	                    A[i][count]=0;
	                
	                count++;
	                
	            }
	            
	        }
	        
	        return A;
	    }	
}
