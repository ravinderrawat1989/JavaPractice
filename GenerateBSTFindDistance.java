import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BST{
	
	int data;
	BST left,right;
	
	public BST(int data,BST left,BST right){
		this.data=data;
		this.left=left;
		this.right=right;
	}
	
	
}

public class GenerateBSTFindDistance {

	static Queue<BST> list=new LinkedList<BST>();
	
	public static void main(String[] args) {

		int arr[]={8,3,10,1,6,13,7,4,14};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		BST root=sortedArrayToBST(arr,0,arr.length-1);
		//BST root=generateBST(arr);
		//printTree(root);
		
		System.out.println(findDistance(root, 6,1));
		
	}

	
	static void printTree(BST root){
		
		BST temp=null;
		if(root==null) 
			System.out.println("null");
		
		list.clear();
		
		list.add(root);
		
		while(!list.isEmpty()){
			temp=list.remove();
			
			if(temp!=null)
				System.out.println(temp.data);
			
			if(temp.left!=null)
				list.add(temp.left);
			
			if(temp.right!=null)
				list.add(temp.right);			
		}
		
		
	}

	
	
	
	public static BST sortedArrayToBST(int[] num, int start, int end) {
		if (start > end)
			return null;
 
		int mid = (start + end) / 2;
		BST root = new BST(num[mid],null,null);
		root.left = sortedArrayToBST(num, start, mid - 1);
		root.right = sortedArrayToBST(num, mid + 1, end);
 
		return root;
	}
	
	
	
	public static int findDistance(BST root,int a,int b){
		int distance=0;
		BST lca=LCA(root,a,b);
		
		if(lca==null)	return -1;
//		System.out.println("lca " + lca.data);
		BST lca1=lca;
		
		if(a>b){
			int temp=b;
			b=a;
			a=temp;
		}
		
		while(lca!=null){
		
			if(lca.data > a )
				lca=lca.left;
			else if(lca.data<a)
				lca1=lca.right;
			else if(lca.data== a)
				break;
			
			distance++;
		}
		
		while(lca1!=null){
			
			if(lca1.data > b )
				lca1=lca1.left;
			else if(lca1.data<b)
				lca1=lca1.right;
			else if(lca1.data== b)
				break;
			
			distance++;
		}
		
		return distance;
	}
	
	
	public static BST LCA(BST root,int a,int b){
		
		if(root==null) return null;
		
		if( !hasNode(root,a) || !hasNode(root,b)) return null;
		
		if(root.data==a || root.data==b) return root;

		
		if( hasNode(root.left,a) && hasNode(root.right,b) ) 
			return root;
		else if( hasNode(root.right,a) && hasNode(root.left,b) )
			return root;
		else if( hasNode(root.left,a) && hasNode(root.left,b)  )
			return LCA(root.left,a,b);					
		else if( hasNode(root.right,a) && hasNode(root.right,b)  )
			return  LCA(root.right,a,b);
		
		return null;
		
	}
	
	public static boolean hasNode(BST node,int val){		
		
		if(node == null) return false;
		
		if(node.data==val) return true;
		
		if(node.data>val)
			return hasNode(node.left,val);
		else if(node.data<val)
			return hasNode(node.right,val);
					
		return false;
	}
	
}
