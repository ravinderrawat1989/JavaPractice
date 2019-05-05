import java.util.ArrayList;

class Btree4{
	
	int val;
	Btree4 right,left;
		
	Btree4(int val,Btree4 left,Btree4 right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	
	
	boolean covers(Btree4 root,Btree4 node){
		
		if(root==null) return false;
		
		if(root==node){
			return true;
		}else {
			return covers(root.left, node) || covers(root.right,node);
		}
		
	}
	
	
	Btree4 findLCA(Btree4 root,Btree4 node1,Btree4 node2){
		
		if(root==null) return null;
		

		
		if( root==node1 || root==node2 ){
			return root;
		}
		
		boolean is_node1_on_left=covers(root.left,node1);
		boolean is_node2_on_left=covers(root.left,node2);
		
		if(is_node1_on_left!=is_node2_on_left){
			return root;
		}
		
		Btree4 childside=is_node1_on_left?root.left:root.right;
		return findLCA(childside,node1,node2);
		
	}
	
	
	Btree4 commonAncestor(Btree4 root,Btree4 node1,Btree4 node2){
	
		if(!covers(root,node1) || !covers(root,node2) ){
			return null;
		}
		
		return findLCA(root,node1,node2);
	}

	
	// Thepath does not need to start or end at the root or a leaf.
	//Design an algo- rithm to print all paths which sum to a given value
	
	void findSum(Btree4 node,int sum,int[] path,int level){
		
		
		if(node==null) return;
		
		/* Insert current node into path. */
		path[level]=node.val;
		
		
		/* Look for paths with a sum that ends at this node*/
		int t=0;
		for( int i= level;i>=0;i--){
			t+=path[i];
			
			if(t==sum){
				print(path,i,level);
			}
		}
		
		
		/* Search nodes beneath this one. */
		findSum(node.left,sum,path,level+1);
		findSum(node.right,sum,path,level+1);
		path[level]= Integer.MIN_VALUE;
	}
	
	
	public void print(int[] path,int start,int end){
		for(int j=start;j<=end;j++){
			System.out.print( path[j] + "->");
		}
		System.out.println();
	}
	
	
	public void findSum(Btree4 node, int sum) {
		 	int depth = depth(node);
		 	int[] path = new int[depth];
			findSum(node,sum, path, 0);
	}
	
	public int depth(Btree4 node) {
		
		if(node==null)
			return 0;
		else{
			return 1 + Math.max(depth(node.left), depth(node.right));
		}
	}
	
}


public class LCAOfBinaryTree {

	public static void main(String[] args) {

		Btree4 tree=new Btree4(0,null,null);
		tree.left=new Btree4(5,null,null);
		tree.right=new Btree4(1,null,null);
		
		tree.left.left=new Btree4(10,null,null);
		tree.left.right=new Btree4(2,null,null);

		tree.right.left=new Btree4(8,null,null);
		tree.right.right=new Btree4(3,null,null);

		
		tree.left.left.left=new Btree4(11,null,null);
		tree.left.left.right=new Btree4(14,null,null);
		
		
		
	System.out.println(tree.findLCA(tree,tree.left.left.left,tree.left.right).val);
		//ArrayList<ArrayList<Btree4>> list=tree.print(tree,9,new ArrayList<Btree4>(),new ArrayList<ArrayList<Btree4>>());
	
		tree.findSum(tree, 7);
	
	}

}
