import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class MinimumAbsoluteDifferenceInBST {

    static int min = Integer.MAX_VALUE;
    static TreeNode prev = null;
    
	public static void main(String[] args) {
		
		TreeNode root=new TreeNode(1);
		
		TreeNode temp=new TreeNode(2);
		root.left=temp;
		
		temp=new TreeNode(3);
		root.right=temp;
		
		
		root.left.right=new TreeNode(5);
		root.left.left=new TreeNode(4);
		
		root.right.right=new TreeNode(7);
		root.right.left=new TreeNode(6);
		
		
		root.left.right.right=new TreeNode(9);
		root.left.left.right=new TreeNode(8);
		root.left.left.right.left=new TreeNode(11);
		root.right.right.right=new TreeNode(10);
		//System.out.println(getMinimumDifference(root));
		
		//preOrderTraversal(root);
		//preOrderTraversaIterative(root);
		//inOrderTraversal(root);
		//inOrderTraversalIterative(root);
		 //System.out.println(getMinDepth(root));
		//System.out.println(getMinDepthIterative(root));
		
		System.out.println(getLCA(root,root.left , root.left.right.right).val);
		System.out.println(getLCABest(root,root.left , root.left.right.right).val);
		
//		System.out.println(getLCAIterative(root,root.left.right.right , root.right.left).val);
	}

//	public static int getMinimumDifference(TreeNode root) {
//        if (root == null) return min;
//
//        getMinimumDifference(root.left);
//        if (prev != null) {
//            min = Math.min(min, root.val - prev.val);
//        }
//        prev = root;
//        getMinimumDifference(root.right);
//        return min;
//    }

    public static int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        TreeNode prev = null;
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while (root != null || (!stack.isEmpty())) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (prev != null) {
                    min = Math.min(min, root.val - prev.val);
                }
                prev = root;
                root = root.right;
            }
        }

        return min;
    }	




	public static void preOrderTraversal(TreeNode root) {

		if(root==null)
			return;
		
		System.out.println(root.val);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}


	public static void preOrderTraversaIterative(TreeNode root) {
		
		Stack<TreeNode> stack = new Stack<>();
		
		stack.push(root);
		
		while(!stack.isEmpty()) {
			
			TreeNode temp=stack.pop();
			
			System.out.println(temp.val);
			
			if(temp.right!=null)
				stack.push(temp.right);
			
			if(temp.left!=null)
				stack.push(temp.left);
			
		}
		
	}

	
	public static void inOrderTraversal(TreeNode root) {
		
		if(root==null)
			return;
		
		inOrderTraversal(root.left);
		System.out.println(root.val);
		inOrderTraversal(root.right);
		
	}


	public static void inOrderTraversalIterative(TreeNode root) {
		
		Stack<TreeNode> stack=new Stack<>();
		
		while(root!=null || !stack.isEmpty()) {
			
			if(root!=null) {
				stack.push(root);
			
				root=root.left;
				
			}else {
				
				TreeNode temp=stack.pop();
				System.out.println(temp.val);
				
				if(temp.right !=null )
					root=temp.right;
								
			}
			
		}
		
	}


	public static int getMinDepth(TreeNode root) {
		
		if(root==null)
			return 0;
		
		if(root.left==null && root.right==null)
			return 1;
		
		if(root.left==null)
			return getMinDepth(root.right)+1;
		
		if(root.right==null)
			return getMinDepth(root.left)+1;
		
		
		return Math.min(getMinDepth(root.left), getMinDepth(root.right))+1;
		
	}

	
	public static int getMinDepthIterative(TreeNode root) {
		
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		int depthCounter=0;
		
		q.add(root);
		q.add(null);
		
		TreeNode temp=null;
		
		while( !q.isEmpty()) {
			
			temp=q.poll();
			
			if(temp==null)
				{ depthCounter++   ; q.add(null); continue;}
			
			if(temp.left!=null)
				q.add(temp.left);
			
			if(temp.right!=null)
				q.add(temp.right);
			
			if(temp.right==null && temp.left==null)
				break;
			
			
		}
		
		return depthCounter+1;
	}
	

	public static TreeNode getLCA(TreeNode root,TreeNode node1,TreeNode node2) {
		
		if( node1.val==node2.val)
			return node1;
		
		
		
		if (isPathFromRoot(root.left,node1)==true && isPathFromRoot(root.left,node2) == true ) {
			return getLCA(root.left,node1,node2);
		}else if(isPathFromRoot(root.right,node1)==true && isPathFromRoot(root.right,node2) == true ) {
			return getLCA(root.right,node1,node2);
		}else {
			return root;
		}
}


	public static TreeNode getLCABest(TreeNode root,TreeNode node1,TreeNode node2) {
		
		if(root==null)
			return null;
		
		if(root.equals(node2) || root.equals(node1))
			return root;
		
		TreeNode l=getLCABest(root.left,node1,node2);
		TreeNode r=getLCABest(root.right,node1,node2);
		
		if(l!=null && r!=null)
			return root;
		else if(l==null)
			return r;
		else 
			return l;
		
		
	}

	
	public static boolean isPathFromRoot(TreeNode root,TreeNode target) {
		
		if(root == null)
			return false;
		
		if(root.val == target.val)
			return true;
		
		return isPathFromRoot(root.left,target) || isPathFromRoot(root.right,target);
		
	}

	public static TreeNode getLCAIterative(TreeNode root,TreeNode node1,TreeNode node2) {
		
		List<TreeNode> list1=new ArrayList<>();
		List<TreeNode> list2=new ArrayList<>();
		
		boolean firstFound=false , secondFound=false;
		
		Stack<TreeNode> stack = new Stack<>();
		
		while(root!=null || !stack.isEmpty()) {
			
			if(root!=null) {
				stack.push(root);
				
				if(firstFound==false && root.val!=node1.val)
					list1.add(root);
				else
					firstFound=true;
				
				if(secondFound==false && root.val!=node2.val)
					list2.add(root);
				else 
					secondFound=true;
				
				if( firstFound && secondFound)
					break;
				
				root=root.left;
				
			}else {

				TreeNode temp=stack.pop();
				
				if(firstFound==false  &&  list1.get(list1.size()-2)!=null && list1.get(list1.size()-2).left!=null &&
						list1.get(list1.size()-2).left.val == list1.get(list1.size()-1).val )
					list1.remove(list1.size()-1);

				if(secondFound==false &&  list2.get(list2.size()-2)!=null && list2.get(list2.size()-2).left!=null && 
						list2.get(list2.size()-2).left.val == list2.get(list2.size()-1).val )
					list2.remove(list2.size()-1);
				
				
				root=temp.right;
			}
			
			
		}
		
		
		int minLen=Math.min(list1.size(), list2.size());
		int foundAt=0;
		for(int i=0;i<minLen;i++) {
			if(list1.get(i).val == list2.get(i).val) {
				
			}else {
				foundAt=i;
				break;
			}
		}
		
		if(foundAt==0)
			foundAt=minLen;
		
		return list1.get(foundAt-1);
		
	}
	
}


  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}