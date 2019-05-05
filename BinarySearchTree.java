package oneMorePractice;

import java.util.Stack;

class Bst{
	
	Bst left;
	Bst right;
	int data;

	Bst(int data,int left,int right){
		this.data=data;
	}

	Bst(int data){
		this.data=data;
	}


	boolean isBST(Bst root){
		
		if(root==null) return true;
		
		if(root.left!=null && root.right!=null && (root.left.data > root.data  ||  root.right.data < root.data) )
			return false;
		
		return isBST(root.left) && isBST(root.right);
	}

	
	int findClosestElement(Bst root,int num){
	
		Bst lastKnownGood=null;
		
		if(root==null) return 0;
		
		while(root!=null){
			
			if(root.data==num)
				return root.data;
			
			if(root.data < num && root.right!=null ) { lastKnownGood=root; root=root.right;continue;}
			
			else if(root.data > num && root.left!=null ) { lastKnownGood=root; root=root.left;continue;}
			
			else if(root.left==null && root.right==null )
				{

				// We have our element between lastknown and current
				
				if( Math.abs(num-lastKnownGood.data) > Math.abs(num-root.data))
					return root.data;
				else
					return lastKnownGood.data;
							
				}

						

			
		}
		
		return -11;
	}
	
	
	int sumOfKSmallestElements(Bst root,int k,int count){
		
		int sum=0;
		
		if(root==null) return 0;
		
		Stack<Bst> stack=new Stack<Bst>();
		
		stack.push(root);
		
		while(true){
			
			if(root!=null)
			{
				stack.push(root);
				root=root.left;
			}else{
				if(stack.isEmpty()) return sum;
				
				root=stack.pop();
				count++;	
				
					
					sum+=root.data;
					root=root.right;
					
					if( count == k)
						return sum;

				
				
			}
									
		}				
		
	}
	
	
	
	int sumOfKSmallestElements(Bst root,int k){
		return sumOfKSmallestElements(root,k,0);
	}
	
	
	Bst insertNodeIntoBstRecursive(Bst root,int x){
			
		if(root==null){
			root=new Bst(x);
			return root;
		}
		
		if(x < root.data){
			root.left=insertNodeIntoBstRecursive(root.left,x);
		}else if(x > root.data){
			root.right=insertNodeIntoBstRecursive(root.right,x);
		}
		
		return root;
	}
	
	Bst insertNodeIntoBst(Bst root,int x){
		
		if(root==null){
			root=new Bst(x);
			return root;
		}
		
		Bst lastknown=null;
		
		while(root!=null){
			
			lastknown=root;
			
			if(root.data > x)
				root=root.left;
			else if(root.data < x)
				root=root.right;
								
		}
		
		if(lastknown.data > x)
			lastknown.left=new Bst(x);
		else
			lastknown.right=new Bst(x);
		
		return root;
	}
	
 	int printAllElements(Bst root){
 	 	
 		int element=0;
 		Stack<Bst> stack=new Stack<Bst>();
 		
 		if(root==null) return 0;
 			
 		while(true){
 			
 			if(root!=null)
 			{
 				stack.push(root);
 				root=root.left;
 			}else{
 				if(stack.isEmpty()) return 0;
 				root=stack.pop();
 				element=root.data;
 				
 				System.out.println(element);
 				root=root.right;
 			}
 			
 		}
 		
 		
 		
 		}

	
 	Bst deleteFromBinarySearchTree(Bst root,int a){
 		
 		if (root == null)  return root;
 		 
 		
 		 if(a<root.data)
 			 root.left=deleteFromBinarySearchTree(root.left,a);
 		 else if(a>root.data)
 			root.right=deleteFromBinarySearchTree(root.right,a);
 		
 		 // Node to be deleted reached
 		 else
 		 {
 			 if(root.left == null)
 				 return root.right;
 			 else if(root.right == null)
 				 return root.left;
 			 
 			 
 			// node with two children: Get the inorder successor (smallest
             // in the right subtree)
 			 root.data=minValue(root.right);
 			
 			// Delete the inorder successor
 			 root.right=deleteFromBinarySearchTree(root.right,root.data);
 		 }
 		
 		 return root;
 	}
 	
 	int minValue(Bst root){
 		
 		while(root.left!=null){
 			root=root.left;
 		}
 		return root.data;
 		
 	}
 
 	
 	
 	int findSecondLargest(Bst root){
 		 		
 		if(root==null) return -11;
 		Bst parent=null;
 		
 		while(root.right!=null){
 			parent=root;
 			root=root.right;
 		}
 		
 		if(root.left!=null && root.left.data > parent.data)
 			return root.left.data;
 		else 
 			return parent.data;
 	}
 	
 	int findSecondSmalled(Bst root){
	 		
 		if(root==null) return -11;
 		Bst parent=null;
 		
 		while(root.left!=null){
 			parent=root;
 			root=root.left;
 		}
 		

 		return parent.data;
 	}
 	 	
 	
}


public class BinarySearchTree {

	public static void main(String[] args) {
		Bst t=new Bst(8);
		t.left=new Bst(3);
		t.right=new Bst(10);
		
		
		t.left.left=new Bst(1);
		t.left.right=new Bst(6);
		
		t.left.right.left=new Bst(4);
		t.left.right.right=new Bst(7);
		
		t.right.right=new Bst(16);
		
		
		t.right.right.left=new Bst(13);
		t.right.right.right=new Bst(20);
		
		
		t.right.right.right.left=new Bst(17);
		t.right.right.right.right=new Bst(35);
		
		
		
		//System.out.println("isBST "  + t.isBST(t));
		//System.out.println("findClosestElement " + t.findClosestElement(t, -1));
	//	System.out.println("sumOfKSmallestElements  " + t.sumOfKSmallestElements(t, 5));
	//	t.printAllElements(t);
		t.insertNodeIntoBstRecursive(t, 5);
		//t.insertNodeIntoBst(t, 5);
		//t.printAllElements(t);
		t.deleteFromBinarySearchTree(t, 6);
		t.printAllElements(t);
		
		System.out.println("findSecondLargest " + t.findSecondLargest(t));
		System.out.println("findSecondSmalled " + t.findSecondSmalled(t));
	}

}
