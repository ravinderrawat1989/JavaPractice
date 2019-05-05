import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode {
     public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
  }




public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {

		
	}
	
	
	
	public List<Integer> inorderTraversal(TreeNode root) {
	    Stack<TreeNode> stack = new Stack<TreeNode>();
	    List<Integer> result = new ArrayList<Integer>();
	 
	    TreeNode p = root;
	    while(p!=null){
	        stack.push(p);
	        p = p.left;
	    }
	 
	    while(!stack.isEmpty()){
	        TreeNode t = stack.pop();
	        result.add(t.val);
	 
	        if(t.right!=null){
	 
	            t= t.right;
	            while(t!=null){
	                stack.push(t);
	                t=t.left;
	            }
	        }
	    }
	 
	    return result;
	}

}
