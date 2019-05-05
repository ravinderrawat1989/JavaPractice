import java.util.LinkedList;

public class FriendCircles2 {

	public static void main(String[] args) {


//		                         
//	
		
//		int[][] M= {{1,1,0},
//				   {1,1,1},
//				   {0,1,1}   };


//
//		int[][] M =  { {1,1,0},
//		               {1,1,0},
//		               {0,0,1} };
		
		int[][] M= {
					{1,0,0},
					{0,1,0},
					{0,0,1}
				   };		

		
		System.out.println(findCircleNum(M));
		
	}

	static int findCircleNum(int[][] M) {

		int n = M.length;
		boolean[] visited = new boolean[n];
		int count = 0;
		for (int i = 0; i < n; i++)
			if (dfs(M, i, visited) > 0)
				count++;
		return count;
	}

	static  int dfs(int[][] mat, int i, boolean[] visited) {
		if (visited[i])
			return 0;
		visited[i] = true;
		int count = 1;
		for (int j = 0; j < visited.length; j++)
			if (i != j && mat[i][j] == 1)
				count += dfs(mat, j, visited);
		return count;
	}


	
}
