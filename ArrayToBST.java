import java.util.Arrays;

class BTree1{
	int val;
	BTree1 left,right;
	
	public BTree1(int val,BTree1 left,BTree1 right){
		this.val=val;
		this.left=left;
		this.right=right;
	}	
	
	
	public BTree1 generateBST(int[] arr,int start,int end){
		
		if(end<start)
			return null;
		
		int mid=(start+end)/2;
		
		BTree1 n=new BTree1(arr[mid],null,null);
		n.left=generateBST(arr, start, mid-1);
		n.right=generateBST(arr, mid+1, end);
		return n;
	}
	
	public BTree1 generateBST(int[] arr){
		return generateBST(arr,0,arr.length-1);
	}
	
	void printBST(BTree1 node,String str){
		
		if(node==null)
			return;
		
			
			System.out.println("Node " +str + " =" + node.val);
			printBST(node.left,"left of " + node.val);
			printBST(node.right,"right of " + node.val);
			
		
	}
	
}
	
public class ArrayToBST {

	public static void main(String[] args) {
		
		int arr[] = {2,4,1,3,6,7,5,8,9};
		Arrays.sort(arr);
		
		BTree1 root= new BTree1(0,null,null).generateBST(arr);
		root.printBST(root,"root");
		
		
		
	}
	
}
