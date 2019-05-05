class MyNode{
	
	MyNode head;
	MyNode next;
	MyNode current;
	int data;

	MyNode(int data){
		this.data=data;
	}


	void add(int data){		
		MyNode temp=new MyNode(data);
	
		if(head==null){
			head=temp;
			current=temp;
		}else{
			
			while(current.next!=null)
				current=current.next;
						
			current.next=temp;
			temp.next=null;
		}
	}
	
	
	void print(MyNode head){
		StringBuffer str=new StringBuffer();
		MyNode temp=head;
		
		while(temp!=null){
			str.append(temp.data + "->");
			temp=temp.next;
		}
		
		System.out.println(str.toString());
	}
	
	
	MyNode swapListInPairs(MyNode head){
		
		   if(head == null || head.next == null)   
		        return head;
		 
		   MyNode h = new MyNode(0);
		    h.next = head;
		    MyNode p = h;
		 
		    while(p.next != null && p.next.next != null){
		        //use t1 to track first node
		    	MyNode t1 = p;
		        p = p.next;
		        t1.next = p.next;
		 
		        //use t2 to track next node of the pair
		        MyNode t2 = p.next.next;
		        p.next.next = p;
		        p.next = t2;
		    }
		 
		    return h.next;

	}
}

public class MyLinkedList1 {

	public static void main(String[] args) {

		MyNode node1=new MyNode(0);
		node1.add(1);
		node1.add(2);
		node1.add(3);
		node1.add(4);
		node1.add(5);
		
		node1.print(node1.head);
		
		
		
		node1.print(node1.swapListInPairs(node1.head));
	}

}
