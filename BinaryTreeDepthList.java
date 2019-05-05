import java.util.LinkedList;
import java.util.List;

class Btree{
	
	int val;
	Btree left,right;
	
	Btree(int val,Btree left,Btree right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	
	
	public List<LinkedList<Btree>> createListOfDepth(Btree node){
		
		LinkedList<Btree> list=null;
		LinkedList<LinkedList<Btree>> listMain=new LinkedList<LinkedList<Btree>>();
		
		if(node==null) return null;
		
		
		
		if(listMain.size()==0)  //we are at root
		{
			list=new LinkedList<Btree>();
			list.add(node);
			listMain.add(list);
		}
			
		while(! listMain.get(listMain.size()-1).isEmpty()){
			
			list=new LinkedList<Btree>();
			
			for(Btree nodeTemp:listMain.get(listMain.size()-1)){
				
				if(nodeTemp.left !=null)
					list.add(nodeTemp.left);
				
				if(nodeTemp.right !=null)
					list.add(nodeTemp.right);
			}
			
			listMain.add(list);
			
		}
			
			
		return listMain;
	}
		
}

public class BinaryTreeDepthList {

	public static void main(String[] args) {
		
		Btree tree=new Btree(0,null,null);
		tree.left=new Btree(1,null,null);
		tree.right=new Btree(2,null,null);
		
		
		tree.left.left=new Btree(3,null,null);
		tree.left.right=new Btree(4,null,null);
		
		tree.right.left=new Btree(5,null,null);
		tree.right.right=new Btree(6,null,null);
		
		List<LinkedList<Btree>> list= tree.createListOfDepth(tree);
		
		
		for(LinkedList<Btree> a:list){
			
			for(Btree t:a){
				System.out.print( t.val + " ");
			}
			System.out.println("changing depth..");
		}
		
	}

}
