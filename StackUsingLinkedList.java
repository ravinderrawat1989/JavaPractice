public class StackUsingLinkedList {

	Node head=null;
	int size=0;
	
	class Node{		
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
		}
		
	}
	
	
	void push(int data){
		
		Node x=new Node(data);
	
		if(getSize()==0) // nothing in stack
		{
			head=x;
		}else{
			Node temp=head;
			x.next=temp;
			head=x;
		}
		size++;
	}
	
	int pop(){
		
		if(getSize()==0){
			return -1;
		}else {
			
			Node temp=head;
			head=head.next;
			size--;
			return temp.data;
			
		}
	}
	
	void printStack(){
		
		Node cur=head;
		
		while(cur!=null){
			System.out.print( cur.data + " ");
			cur=cur.next;
		}
	
		System.out.println();
	}
		
	int getSize(){
		return size;
	}
	
	public static void main(String[] args) {
		
		StackUsingLinkedList stch=new StackUsingLinkedList();
		stch.push(1);
		stch.push(2);
		stch.push(3);
		stch.printStack();
		stch.pop();
		stch.printStack();
	}

}
