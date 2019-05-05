class Node2{
		
	int data;
	Node2 left,right;
		
	Node2(int a){
		this.data = a;
		left = right = null;
	}		
}

public class BinaryTreeLCA {
	
	Node2 root;
	
	Node2 findLCA(Node2 node,Node2 a,Node2 b){
		
		if(node==null)
			return node;
		
		if(node.equals(a) || node.equals(b))
			return node;
		
		
		
		System.out.println(" node =" +node.data);
		
		
		Node2 l = findLCA(node.left,a,b);
		
		if(l !=null ){
			System.out.println( "l =" + l.data  );	
		}else{
			System.out.println("l = null");
		}
		System.out.println("now node r ="+ node.data);
		
		
		Node2 r = findLCA(node.right,a,b);
		if(r !=null ){
			System.out.println( "r =" + r.data  );	
		}else{
			System.out.println("r =null");
		}

		
		//System.out.println("node r " + r.data);
		
		 // nodes are each on a seaparate branch
		if(l !=null && r !=null )
		{
			System.out.println("returning node diff branch " + node.data);
			return node;
		}
			 
		
		
		System.out.println("l == " +l !=null ? l:r);
		return l !=null ? l:r;
		
	}

	
	public static void main(String[] args) {

		BinaryTreeLCA tree = new BinaryTreeLCA();
        tree.root = new Node2(20);
        tree.root.left = new Node2(8);
        tree.root.right = new Node2(22);
        tree.root.left.left = new Node2(4);
        tree.root.left.right = new Node2(12);
        tree.root.left.right.left = new Node2(10);
        tree.root.left.right.right = new Node2(14);
  
        int n1 = 10, n2 = 14;
        Node2 t = tree.findLCA(tree.root, tree.root.left.left, tree.root.left.right );
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.data);
	}

}
