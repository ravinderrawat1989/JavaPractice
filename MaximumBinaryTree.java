import java.util.Arrays;

public class MaximumBinaryTree {

	public static void main(String[] args) {

		
		int[] arr= {3,2,1,6,0,5};
		
		TreeNode12 t=constructMaximumBinaryTree(arr);
		
		System.out.println(t.val);
		System.out.println(t.left.val);
		System.out.println(t.left.right.val);
		System.out.println(t.right.val);
		System.out.println(t.right.left.val);
		System.out.println(t.right.right.val);
		
		
	}

	
	
	
	static TreeNode12 constructMaximumBinaryTree(int[] nums) {
		
		return buildTree(nums,0,nums.length);
		
	}
		
	
	static TreeNode12 buildTree(int[] nums,int left,int right) {
		
		if(left==right)
			return null;
		
		//Find Max in array:
		
		int maxSoFar=Integer.MIN_VALUE;
		int maxIndex=0;
		for(int i=left;i<right;i++) {
			
			if(nums[i] > maxSoFar) {
				maxSoFar=nums[i];
				maxIndex=i;
			}
			
		}
		
		TreeNode12 root=new TreeNode12(nums[maxIndex]);	

		root.left=buildTree( nums,left,maxIndex );		
		root.right=buildTree(nums,maxIndex+1,right);
		
	    return root;
	}
	
	
	
	static int[] ripOff(int[] arr,int start,int end) {
		
		if(start>=end)
			return null;
		
		int[] n = new int[end-start];
		
		int count=0;
		for(int i=start ; i < end ;i++) {
			
			n[count++]=arr[i];
			
		}
		
		return n;
	}
	
	
}







  class TreeNode12 {
     int val;
     TreeNode12 left;
     TreeNode12 right;
     TreeNode12(int x) { val = x; }
     
  } 