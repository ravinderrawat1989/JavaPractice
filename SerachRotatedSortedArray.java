
public class SerachRotatedSortedArray {

	public static void main(String[] args) {
		int[] array={4 ,5 ,6 ,7 ,0 ,1, 2};
		
		System.out.println(search(array,0));
	}

	
	
	public static int search(int[] A, int target) {
        if (A == null || A.length == 0) {
            return -1;
        }

        int start = 0;
        int end = A.length - 1;
        int mid;
        
        while (start + 1 < end) {
        	
            mid = start + (end - start) / 2;
            
            if (A[mid] == target) {
                return mid;
            }
            
            if (A[start] < A[mid]) {
                // situation 1, red line
                if (A[start] <= target && target <= A[mid]) {
                    end = mid;
                } else {
                    start = mid;
                }
            } else {
                // situation 2, green line
                if (A[mid] <= target && target <= A[end]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        } // while
        
        if (A[start] == target) {
            return start;
        }
        if (A[end] == target) {
            return end;
        }
        return -1;
    }
}
