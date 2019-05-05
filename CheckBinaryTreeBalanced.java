class BTree2{
	
	int val;
	BTree2 left,right;
	
	public BTree2(int val,BTree2 left,BTree2 right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	
	
	public int getHeight(BTree2 node){

		if(node==null)
			return 0;
		
			return 1 + Math.max(getHeight(node.left),getHeight(node.right));							
	}	
	
	
	public boolean isBalanced(BTree2 node){
			
		if(node == null) return true;
		
		if( Math.abs(node.getHeight(node.left) - node.getHeight(node.right)) > 1){
			return false;
		}else{
			return isBalanced(node.left) && isBalanced(node.right);
		}
		
	}
	
	
	public int checkHeightBestAlgo(BTree2 node){
		
		if(node == null) return 0;
		
		int leftHeight = checkHeightBestAlgo(node.left);
		if(leftHeight==-1) return -1;
		
		int rightHeight=checkHeightBestAlgo(node.right);
		if(rightHeight==-1) return -1;
		
		
		if( Math.abs(leftHeight-rightHeight)>1){
			return -1;
		}else{
			return Math.max(leftHeight, rightHeight) +1;
		}
		
	}
	
}

public class CheckBinaryTreeBalanced {

	public static void main(String[] args) {

		BTree2 tree= new BTree2(0,null,null);
		tree.left=new  BTree2(1,null,null);
		tree.right=new  BTree2(2,null,null);
		tree.left.left=new  BTree2(3,null,null);
		tree.left.right=new  BTree2(4,null,null);
		tree.right.left=new  BTree2(5,null,null);
		tree.right.right=new  BTree2(6,null,null);
//		tree.right.right.left=new  BTree(7,null,null);
//		tree.right.right.right=new  BTree(8,null,null);
//		tree.right.right.left.left=new  BTree(9,null,null);
//		tree.right.right.left.right=new  BTree(10,null,null);
//		
		System.out.println(" get height " + tree.getHeight(tree));
		System.out.println(" is Balanced " + tree.isBalanced(tree));
		System.out.println(" is Balanced " + tree.checkHeightBestAlgo(tree));
	}

}
