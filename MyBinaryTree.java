package oneMorePractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

class MyBt{
	MyBt left;
	MyBt right;
	int data;
	MyBt root=null;
	
 	MyBt(int data,MyBt left,MyBt right){
		this.data=data;		
 		this.left=left;
		this.right=right;
	}
 	
 	MyBt(int data){
		this.data=data;		
 		this.left=null;
		this.right=null;
	}
 	

 	int getHeight(MyBt root){
 			
 		if(root==null)
 			return 0;
 		
 		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;

 	}
	
 	
 	int getHeightWithoutRecursion(MyBt root){
 		
 		if(root==null)
 			return 0;
 			
 		Queue<MyBt> q= new LinkedList<MyBt>();
 		
 		q.add(root);
 		
 		int height=0;
 		
 		while(true){
 			
 			if(q.isEmpty())
 				return height;
 			
 			MyBt x= q.poll();
 			
 			if(x!=null && (x.left!=null || x.right!=null) )
 				height++;
 		
 			if((x.left!=null ))
 				q.add(x.left);
 			
 			if((x.right!=null ))
 				q.add(x.right);

 		}
 		
 		
 	}
 
 	int getNElementInorderTraversal(MyBt root,int k){
 	
 		int element=0;
 		Stack<MyBt> stack=new Stack<MyBt>();
 		
 		if(root==null) return 0;
 			
 		while(true){
 			
 			if(root!=null)
 			{
 				stack.push(root);
 				root=root.left;
 			}else{
 				if(stack.isEmpty()) return 0;
 				k--;
 				root=stack.pop();
 				element=root.data;
 				
 				if(k==0)
 					return element;
 				//System.out.println(element);
 				root=root.right;
 			}
 			
 		}
 		
 		
 		
 		}
 	
 	

 	
 	MyBt getLCA(MyBt root,int a,int b){
 		
 		MyBt result=null;
 		 		
 		if(root==null) return root;
 		
 		while(root!=null){
 			
 			if( (containsNode(root.left,a) && containsNode(root.right,b) )  ||
 					(containsNode(root.left,b) && containsNode(root.right,a) )  ){
 				// then this node root is the LCA
 				result= root;
 				break;
 			}else if(containsNode(root.left,a)){
 				root=root.left;
 			}else{
 				root=root.right;
 			}
 			
 			
 		}
 	
 		return result;
	}
 	
 	
 	boolean containsNode(MyBt root,int val){
 		
 		if(root==null) return false;
 			
 		if(root.data==val) return true;
 			
 		boolean left=containsNode(root.left,val);
 		boolean right=containsNode(root.right,val);
 		
 		return left==true?left:right;
 	}
 		
 	void getPathWithSpecificSum(MyBt node,int a,int[] path,int level){
 	
		
		
		if(node==null) return;
		
		/* Insert current node into path. */
		path[level]=node.data;
		
		
		/* Look for paths with a sum that ends at this node*/
		int t=0;
		for( int i= level;i>=0;i--){
			t+=path[i];
			
			if(t==a){
				print(path,i,level);
			}
		}
		
		
		/* Search nodes beneath this one. */
		getPathWithSpecificSum(node.left,a,path,level+1);
		getPathWithSpecificSum(node.right,a,path,level+1);
		path[level]= Integer.MIN_VALUE;
	
 	}
 	
	public void print(int[] path,int start,int end){
		for(int j=start;j<=end;j++){
			System.out.print( path[j] + "->");
		}
		System.out.println();
	}
 
 	
 	public void inOrder(MyBt r){
 		
 		if(r!=null){
 			inOrder(r.left);
 			System.out.println(r.data);
 			inOrder(r.right);
 		}
 		
 	}
 	


	public  int depth(MyBt node) {
	
		if(node==null)
			return 0;
		else{
			return 1 + Math.max(depth(node.left), depth(node.right));
		}
	}
	
	
	MyBt deleteAllLeavesFromBinaryTree(MyBt root){
		
		if(root==null) return null;
		
		if(root.left==null && root.right==null) {
			root=null;
			return root;
		}
		
		root.left=deleteAllLeavesFromBinaryTree(root.left);
		root.right=deleteAllLeavesFromBinaryTree(root.right);
		
		return root;
	}
	
	int countLeafNodes(MyBt root){
		
		if(root==null) return 0;
		
		if(root.left==null && root.right==null) return 1;
		
		return countLeafNodes(root.left) + countLeafNodes(root.right);
	}

	boolean isTreeHeightBalanced(MyBt root){
	
		if(root==null) return true;
		
		if( Math.abs(  getHeight(root.left) - getHeight(root.right)      ) > 1)
			return false;
		
		return true;
	}
	
	
public void levelOrderBottom(MyBt root) {
        
        List<List<Integer>>  list= new ArrayList<List<Integer>>();
        Queue<MyBt> q=new LinkedList<>();
        Stack<MyBt> stack=new Stack<>();
        
        q.add(root);
        q.add(null);
        
        while( q.size()>0 ) {
        	MyBt temp=q.poll();
            
            if(temp!=null){
                q.add(temp.left);
                q.add(temp.right);
                q.add(null);                
                stack.push(temp);
            }else{
                stack.push(null);
            }
            
            
        }
        
        while(!stack.isEmpty()){
        	MyBt node=stack.pop();
            List<Integer> listSmall=new ArrayList<>();
                
            if(node==null){
                list.add(listSmall);
                listSmall=new ArrayList<>();
            }else{
                listSmall.add(node.data);
            }
        }
        
        System.out.println(list);
    }
	
}

public class MyBinaryTree {

	public static void main(String[] args) {

		MyBt t=new MyBt(1);
		t.left= new MyBt(2);
		t.right= new MyBt(3);
		
		t.left.left= new MyBt(4);
		t.left.right= new MyBt(5);
		t.right.left= new MyBt(6);
		t.right.right= new MyBt(7);
		
		
		t.right.left.right= new MyBt(8);
		t.right.left.left= new MyBt(9);
		t.right.left.left.left= new MyBt(10);
		t.right.left.left.right= new MyBt(11);
	//	System.out.println(t.getHeight(t));
	//	System.out.println(t.getHeightWithoutRecursion(t));
		
		//System.out.println(t.getNElementInorderTraversal(t, 4));
	//	t.inOrder(t);
		//System.out.println(t.containsNode(t.left,11));
		
	//	System.out.println("LCA " + t.getLCA(t, 5, 11).data);
		
		
		int depth = t.depth(t);
		int[] path = new int[depth];
		//t.getPathWithSpecificSum(t,181,path,0);
		
		//t.inOrder(t);
		//t.deleteAllLeavesFromBinaryTree(t);
		//System.out.println("Print after deleting");
		//t.inOrder(t);
		
		//System.out.println("Leaf Nodes =" +t.countLeafNodes(t) );
		//System.out.println("isTreeHeightBalanced  " + t.isTreeHeightBalanced(t));
		
		 t.levelOrderBottom(t);
	}

}