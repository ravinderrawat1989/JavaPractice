class Btree5{
	
	int val;
	Btree5 right,left;
		
	Btree5(int val,Btree5 left,Btree5 right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	
	
	Btree5 findLCA(Btree5 root,Btree5 node1,Btree5 node2){
		
		if(root==null) return null;
		

		
		if( root==node1 || root==node2 ){
			return root;
		}
		
		if(node1==null || node2==null){
			return null;
		}
		
		if(node1.val < root.val && node2.val < root.val){
			return findLCA(root.left,node1,node2);
		}else if(node1.val > root.val && node2.val > root.val){
			return findLCA(root.right,node1,node2);
		}else{
			return root;
		}
		
	}
	
	
}


public class LCAOFBST {

	public static void main(String[] args) {

		Btree5 tree=new Btree5(8,null,null);
		tree.left=new Btree5(3,null,null);
		tree.right=new Btree5(10,null,null);
		tree.right.right=new Btree5(14,null,null);
		tree.right.right.left=new Btree5(13,null,null);
		
		
		tree.left.left=new Btree5(1,null,null);
		tree.left.right=new Btree5(6,null,null);
		tree.left.right.left=new Btree5(4,null,null);
		tree.left.right.right=new Btree5(7,null,null);
		
		
		System.out.println(tree.findLCA(tree,tree.left.right.left,tree.left.right.right.left));

	
	}
}

