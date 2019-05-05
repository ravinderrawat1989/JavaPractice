import java.util.Arrays;

public class ArrayRemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1,1,1, 2, 3, 3, 4,4,5,5 };
		arr = removeDuplicates(arr);
		
		for(int i:arr)
			System.out.print( i + " ");
	}
	
	public static int[] removeDuplicates(int[] A) {
		if (A.length < 2)
			return A;
	 
		int j = 0;
		int i = 1;
	 
		while (i < A.length) {
			if (A[i] == A[j]) {
				i++;
			} else {
				j++;
				A[j] = A[i];
				i++;
			}
		}
		System.out.println(j);
		int[] B = Arrays.copyOf(A, j+1);
	 
		return B;
	}

}
