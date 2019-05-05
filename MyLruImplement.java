package oneMorePractice;

import java.util.HashMap;

class Node3{
	Node3 next;
	Node3 prev;
	int key;
	int value;
	
	Node3(int key,int value){
		this.key=key;
		this.value=value;
	}
}

class Lru1{
	
	HashMap<Integer,Node3> map= new HashMap<>();	
	int capacity;
	Node3 head=null;
	Node3 end=null;
	
	int size=0;
	
	Lru1(int capacity){
		this.capacity=capacity;
	}
	
	int getSize(){return size;}
	
	void put(int key,int val){
		
		Node3 temp=new Node3(key,val);
		
		if(getSize() < capacity){
			
			if(head==null){
				head=temp;
				end=temp;
			}else{
				setHead(temp);
			}
		
			size++;
		}else{
			
			Node3 endNode=end;
			remove(endNode);
			setHead(temp);
		}
		map.put(key, temp);
	}
	
	
	int get(int key){
		int output=0;
		if(!map.containsKey(key)){
			return -1111;
		}else{
			Node3 get=map.get(key);
			
			if(key == get.key)
				output=get.value;
			remove(get);
			setHead(get);
		}
		
		return output;
	}
	
	void remove(Node3 node){
		
		if(node==end){
			end=node.prev;
		}else if(node==head){
			head=node.next;
		}
		else{
			Node3 previousNode=node.prev;
			Node3 nextNode=node.next;		
			previousNode.next=nextNode;
			nextNode.prev=previousNode;
		}
		
	}
	
	void setHead(Node3 node){
		Node3 temp1=head;
		node.next=temp1;
		temp1.prev=node;
		head=node;		
	}
	
	
	void printCurrent(){
		Node3 temp=head;
		
		while(temp!=end){
			System.out.print( temp.key + ":" + temp.value +",");
			temp=temp.next;
		}
		
		if(temp==end){
			System.out.print( temp.key + ":" + temp.value +",");
		}
	}
}







public class MyLruImplement {

	public static void main(String[] args) {

		Lru1 test=new Lru1(5);
		test.put(1, 1);
		test.put(2, 2);
		test.put(3, 3);
		test.put(4, 4);
		test.put(5, 5);
		test.printCurrent();
		
		test.get(3);
		System.out.println();
		test.printCurrent();
		System.out.println();
		test.put(7,7);
		test.put(8,8);
		test.printCurrent();
	}

}
