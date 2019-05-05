class MyLinkedList{
	
	int data;
	MyLinkedList next;
	MyLinkedList head;
	
	MyLinkedList(int data,MyLinkedList next){
		this.data=data;
		this.next=next;
	}
	
	MyLinkedList(){}
	
	void add(int data){
		
		if(head==null){			
			head=new MyLinkedList(data,null);
		}else{
			
			MyLinkedList temp=head;
			
			while(temp!=null && temp.next!=null){
				temp=temp.next;
			}
			temp.next=new MyLinkedList(data,null);
			
		}
		
	}
	
	
	void print(){
		
		MyLinkedList temp=head;
		
		while(temp!=null){
			System.out.print( temp.data + "->");
			temp=temp.next;
		}
		
		
	}
	
	
	void reverseInPair(){
	
		MyLinkedList temp=head;
		
		MyLinkedList pointer=null;
		
		MyLinkedList tempFirst , tempSecond,tempThird ,lastKnown=null;
		
		while(temp!=null && temp.next!=null){
			
			tempFirst=temp;
			tempSecond=temp.next;
			tempThird=temp.next.next;
			
			
			if(lastKnown!=null)
				lastKnown.next=tempSecond;
			
			tempSecond.next=tempFirst;
			tempFirst.next=tempThird;
			temp=tempSecond;
			if(pointer==null) // One time only
				pointer=tempSecond;
		
			lastKnown=tempFirst;
			temp=tempThird;
		}
		
		head=pointer;
	}
	
	
	
	
	void reverseInPair2(){
		
		MyLinkedList current=head , temp=null , newHead=null;
		
		
		while(current!=null && current.next!=null){
			
			
			
		}
	}
	
	
	
	
	
	
}

public class LinkedListPairWise {

	public static void main(String[] args) {

		MyLinkedList list=new MyLinkedList();
		list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
		list.print();
		
		System.out.println();
		list.reverseInPair();
		
		list.print();
	}

}
