package oneMorePractice;

import java.util.HashMap;
import java.util.Map;

class NodeLru{
	
	int key;
	int value;
	NodeLru next;
	NodeLru prev;
	
	NodeLru(int key,int value)
	{
		this.key=key;
		this.value=value;
	}
}


class Lru{
	
	int capacity;
	NodeLru head=null,end=null; 
	
	Lru(int capacity){
		this.capacity=capacity;
	}
	
	Map<Integer,NodeLru> map =new HashMap<>();
	
	
	void set(int key,int val){
		
		if(map.containsKey(key)){
			NodeLru old=map.get(key);
			old.value=val;
			remove(old);
			setHead(old);
		}else{
			
			NodeLru newNode= new NodeLru(key,val);
			
			if(map.size()>=capacity){
				map.remove(end.key);
				
				remove(end);
				setHead(newNode);
			}else{
				setHead(newNode);
			}
		
			map.put(key, newNode);
		}
		
		
	}
	
	
	void remove(NodeLru node){
		
		if(node.prev != null){
			node.prev.next=node.next;
		}else{
			head=node.next;
		}
		
		if(node.next!=null){
			node.next.prev=node.prev;		
		}else{
			end=node.prev;
		}
		
		
		
	}

	void setHead(NodeLru node){
		
		node.next=head;
		node.prev=null;
		
		if(head!=null){
			head.prev=node;			
		}
		
		head=node;
		
		if(end==null)
			end=head;
		
	}

	int get(int key){
	
		if(!map.containsKey(key)){
			return -1;
		}else{
			NodeLru node=map.get(key);
			remove(node);
			setHead(node);
			return node.value;
		}
		
	}
	
	void printInternalOrdering(){
		
		NodeLru temp=head;
		
		while(temp!=end){
			System.out.print(temp.value + "->");
			temp=temp.next;
		}
		System.out.println(temp.value );
	}
	
}






public class MyLRU {

	public static void main(String[] args) {

		Lru  lru = new Lru(5); 
		
		lru.set(1, 1);

		lru.set(2,2);

		lru.set(3, 3);

		lru.set(4, 4);

		lru.set(5, 5);
	
		
		lru.printInternalOrdering();
		
		lru.set(9, 9);
		lru.printInternalOrdering();
		lru.get(3);
		lru.printInternalOrdering();
	}

}
