package oneMorePractice;

import java.util.LinkedList;
import java.util.Queue;

class TrieNode{
	char data;
	boolean isEnd;
	int count;
	LinkedList<TrieNode> childList;

	
	public TrieNode(char c){
		childList=new LinkedList<TrieNode>();
		isEnd=false;
		data=c;
		count=0;
	}


	public TrieNode getChild(char c){
		
		if(childList!=null){
			for(TrieNode n:childList){
				if(n.data==c)
					return n;
			}			
		}
		return null;
	}

}


class MyTrieNode{
	
	private TrieNode root;
	
	public MyTrieNode(){
		root=new TrieNode(' ');
	}
	
	public void insert(String word){

		TrieNode node=root;
		
		char[] chArr=word.toCharArray();
		
		int count=0;
		
		
			
		
		while(chArr.length >count ){
			
			boolean isFound=false;
			LinkedList<TrieNode> list=node.childList;
			
			char ch=chArr[count++];
			
			for(int i=0;i<list.size();i++){
				
				if(list.get(i).data == ch){
					node=list.get(i);
					isFound=true;
					break;
				}
				
			}
			
			if(isFound!=true){
				TrieNode newNode = new TrieNode(ch);
				node.childList.add(newNode);
				node=newNode;
			}
			
			
		}

		node.isEnd=true;
		
	}
	
	public boolean search(String word){

		boolean isFound=false;
		TrieNode node=root;		
		char[] chArr=word.toCharArray();		
		int count=0;
		
		while( chArr.length > count ){
			isFound=false;
			char ch=chArr[count++];
			
			if(node.data==ch)
				continue;
		
			LinkedList<TrieNode> list=node.childList;
			
			for(int i=0;i<list.size();i++){
				
				if(list.get(i).data == ch){
					node=list.get(i);
					isFound=true;
					break;
				}
				
			}

			
		}
	
		return isFound;
		
	}
	
	
	public void remove(String word){
		
		boolean isFound=false;
		TrieNode node=root;		
		char[] chArr=word.toCharArray();		
		int count=0;
		
		while( chArr.length > count &&  !node.isEnd ){
						
			LinkedList<TrieNode> list=node.childList;
			
			char ch=chArr[count++];
			
			for(int i=0;i<list.size();i++){
				
				if(list.get(i).data == ch){
					node=list.get(i);
					isFound=true;
					break;
				}
				
			}

			
		}
	
		if(isFound==true)
			{
			node.isEnd=true;			
			node=null;
			}
	
	}
	
	public void printWholeTrieLevelWise(){
		
		TrieNode node=root;
		
		Queue<TrieNode> queue = new LinkedList<TrieNode>();
		
		queue.add(node);
		
		while(!queue.isEmpty()){
			
			TrieNode last=queue.poll();
			
			System.out.print( last.data);
			
			for(int i=0;i<last.childList.size();i++)
				queue.add(last.childList.get(i));
			
			System.out.println();
			
		}
		
	}
	
	public void printWholeTrieLevelWise(){
		
		TrieNode node=root;
		
		Queue<TrieNode> queue = new LinkedList<TrieNode>();
		
		queue.add(node);
		
		while(!queue.isEmpty()){
			
			TrieNode last=queue.poll();
			
			System.out.print( last.data);
			
			for(int i=0;i<last.childList.size();i++)
				queue.add(last.childList.get(i));
			
			System.out.println();
			
		}
		
	}
	
}



public class TrieDataStructureDemo {

	public static void main(String[] args) {

		MyTrieNode t= new MyTrieNode();
		t.insert("dear");
        t.insert("deal");
        t.insert("do");
        t.insert("he");
        t.insert("hen");
        t.insert("heat");
		
        System.out.println("hen present in trie : "+t.search("hen"));
        System.out.println("hear present in trie : "+t.search("hear"));
        System.out.println("deal present in trie : "+t.search("deal"));
        System.out.println("Ravi present in trie : "+t.search("Ravi"));
        System.out.println("========================");
        System.out.println("Printing all word present in trie : "); t.printWholeTrieLevelWise();
	}

}
