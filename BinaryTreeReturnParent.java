class Btree6{
	
	int data;
	Btree6 left,right;
	Btree6(int data,Btree6 left,Btree6 right){
		this.data=data;
		this.left=left;
		this.right=right;
	}

	
	Btree6 findMyParent(Btree6 root,int node){		
		
		if(root==null) return null;
		

		if(root !=null && root.left!=null && root.left.data==node )
			return root;
		else if(root !=null &&  root.right!=null && root.right.data==node)
			return root;		

		if(root!=null && root.right!=null)
			return findMyParent(root.right,node) ;		
		else if(root!=null && root.left!=null)
			return findMyParent(root.left,node);
		
		return null;
		
	}
	
	
	void findSum(Btree6 node,int sum,int[] path,int level){
		
		if(node==null) return;
		
		/* Insert current node into path. */
		path[level]=node.data;
		
		
		/*Look for paths with a sum that ends at this node. **/
		int temp=0;
		for(int i=level;i>=0;i--){
			temp=temp+path[i];
			if(temp==sum)
				print(path,i,level);
		}
		
		/* Search nodes beneath this one. */
		findSum(node.left,sum,path,level+1);
		findSum(node.right,sum,path,level+1);
		
		path[level]=Integer.MIN_VALUE;
				
	}
	
	
	
	void print(int[] path,int start,int end){
		
		for(int i=start;i<=end;i++)
			System.out.print(path[i] +",");
		
		System.out.println();
	}
	
	
	
	public int depth(Btree6 node) {

		if(node==null) return 0;
		
		else
			return 1 + Math.max(depth(node.left), depth(node.right));

	}
	
	
	
}


/**
 * 	   10 
 *  4      3 
 *5  7   9  8 

 *If X = 7, return 4
 
 */


 


public class BinaryTreeReturnParent {

	public static void main(String[] args) {

	
		Btree6 root= new Btree6(1,null,null);
		
		root.left=new  Btree6(3,null,null);
		root.right=new  Btree6(4,null,null);
		
		root.left.left=new  Btree6(2,null,null);
		root.left.right=new  Btree6(5,null,null);
		
		root.right.left=new  Btree6(0,null,null);
		root.right.right=new  Btree6(-1,null,null);
		
		
		//System.out.println(root.findMyParent(root, 8).data);
		root.findSum(root,8,new int[root.depth(root)],0);
	}

}
