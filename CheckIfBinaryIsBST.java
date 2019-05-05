class Btree3{
	
	int val;
	Btree3 left,right;
	
	public Btree3(int val,Btree3 left,Btree3 right){
		this.val=val;
		this.left=left;
		this.right=right;
	}

	public boolean isBST(Btree3 node){
		
		if(node==null) return true;
		
		if(node.left==null && node.right!=null){
			
			if(node.val > node.right.val){
				return false;
			}else{
				return isBST(node.right);
			}
		
		}else if(node.right==null && node.left!=null){
			
			if(node.val < node.left.val){
				return false;
			}else{
				return isBST(node.left);
			}
		
		}else if(node.right!=null && node.left!=null){
			
			if(node.val<node.left.val || node.val > node.right.val){
				return false;
			}else {
				return isBST(node.left) && isBST(node.right);
			}
		}
		
		return true;
		
	}
	
}





public class CheckIfBinaryIsBST {
	
	public static void main(String[] args) {

		Btree3 a=new Btree3(20,null,null);
		
		a.left=new Btree3(22,null,null);
//		a.right=new Btree3(2,null,null);
		
		
//		a.left.left=new Btree3(4,null,null);
//		a.left.right=new Btree3(5,null,null);
		
		
//		a.right.left=new Btree3(6,null,null);
//		a.right.right=new Btree3(7,null,null);
		
		
		System.out.println(a.isBST(a));
	}

}
