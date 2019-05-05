package oneMorePractice;

import java.util.Stack;

class Node{
	int data;
	Node next;
	
	Node(int data,Node next){
		this.data=data;
		this.next=next;
	}
		
}


class MyLinkedList{
	
	Node head=null;
	
	void add(int x){
		
		if(head==null){
			head=new Node(x,null);
		}	
		else{
			Node temp=head;
			
			while(temp.next!=null){
				temp=temp.next;
			}
			temp.next=new Node(x,null);
		}
		
	}

	
	void printList(){
	
		Node temp=head;
		
		while(temp!=null){
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
			
	}

	void printListWithHead(Node head){
		
		Node temp=head;
		
		while(temp!=null){
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
			
	}
	
	Node getMiddleLinkedListElement(){
		
		Node slow=head,fast=head;
		
		while(fast!=null && fast.next!=null && fast.next.next!=null){
			slow=slow.next;
			fast=fast.next.next;
		}
			
		return slow;
	}


	void removeDuplicatesFromSortedList(){
		
		Node temp=head;
		int lastValue=9999;
		Node lastPointer=null;
		
		while (temp!=null){
			
			if(temp.data!=lastValue){
				lastValue=temp.data;
				lastPointer=temp;
			}else{
				lastPointer.next=temp.next;
			}
			temp=temp.next;
			
		}
		
	}

	void reverseListInGroupsOfK(int k){
		
		Node[] arr=new Node[k];
		Node temp=head;
		
		Node old=temp;
		Node lastKnown=null;
		int count=0;
		
		boolean isHeadSet=false;
		
		while(temp != null ){
			
			if(count <k){
				arr[count++]=temp;
				temp=temp.next;
			}else{
				old=arr[arr.length-1];
				
				if(lastKnown!=null){
					lastKnown.next=old;
				}
				
				if(!isHeadSet){
					head=old;
					isHeadSet=true;
				}
				
				for(int i=k-2;i>=0;i--){
					
					old.next=arr[i];
					old=old.next;
				}
				
				old.next=temp;
				System.out.println("old " + old.data);
				System.out.println("tem " + temp.data);
				lastKnown=old;

				
				count=0;
					
			}
			
		}
		
	}

	
	void makeListCircular(){
	
		Node temp=head;
		
		while(temp.next!=null){
			temp=temp.next;
		}
		
		temp.next=head;
	}
	
	boolean doesListHaveLoop(){
		
		boolean listHasLoop=false;
		
		Node slow=head,fast=head;
		
		while(fast!=null && fast.next!=null && fast.next.next!=null){
			
			fast=fast.next.next;
			slow=slow.next;
			
			if(fast==slow){
				listHasLoop=true;
				break;
			}
			
		}
		
		return listHasLoop;		
	}
	
	
	Node getKthNodeFromListEnd(int k){
		
		if(k<0)
			return null;
			
		Node kth = head , fast=head;
		
		for(int i=0;i<k;i++)
			fast=fast.next;
		
		
		while(fast!=null){
			fast=fast.next;
			kth=kth.next;
		}
		
		return kth;
	}

	boolean isListPalindromeStack(){
	
		boolean isPalindrome=true;
	
		
		
		Stack<Node> stack = new Stack<Node>();
		
		Node slow=head,fast=head;
		int counter=0;
		
		
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			
			stack.push(slow);
			slow=slow.next;
			counter++;
		}
		
		if(counter%2!=0)
			stack.push(slow);
		
		if(counter==0)
			return true;
		
		while(slow!=null){
			
			if(slow.data != stack.pop().data){
				isPalindrome=false;
				break;
			}
			slow=slow.next;
							
		}
		
		
		return isPalindrome;
	}
	
	
	void RotateListByKNodes(int k){
	
		Node temp=head;
		Node last=null;
		
		for(int i=0;i<k && temp!=null;i++){
			last=temp;
			temp=temp.next;
		}
		
		last.next=null;
		Node temp2=head;
		
		head=temp;
		temp=head;
		while(temp!=null && temp.next!=null){
		
			temp=temp.next;
			
		}
		
		temp.next=temp2;
		
	}
	
	Node mergeTwoLists(Node list1,Node list2){
	
		Node finalList=null;
		Node last=null;
		Node temp=null;
		
		if(list1!=null && list2==null)
			return list1;
		else if(list1==null && list2!=null)
			return list2;

		
		if(list1.data<list2.data)
			finalList=list1;
		else
			{
			finalList=list1;
			list1=list2;
			list2=finalList;
			finalList=list1;
			}
		
		
		
		while(list1!=null && list2!=null){			
				
			if(list1.data < list2.data ){
				last=list1;
				list1=list1.next;
			}else if(list2.data < list1.data){
				last.next=list2;
				last=list2;
				
				temp=list1;
				list1=list2;
				list2=temp;								
			}
			
		}
		
		if(list1==null)
			last.next=list2;
		
		
		
		return finalList;
	}
	
	
	Node getHead(){
		return head;
	}
	
	
	void fitValueInPlace(int val){
		
		Node temp=head;
		
		while(temp!=null && temp.data!=60){
			temp=temp.next;
		}
		
		int value=temp.data;
		Node nextVal=temp.next;
		
		temp.data=val;
		
		temp.next=new Node(value,nextVal);
		
	}
	
	
	Node reverseLinkedList(){
		
		Node previous=null;
		Node next=null;
		Node temp=head;
		
	//	1->2->3->4
		
		while(temp!=null ){
			next=temp.next;
			temp.next=previous;
			previous=temp;
			temp=next;
			
		}
		temp=previous;
		
		return temp;
	}
	
	
	
	Node reverseLinkedListInPairsOf(Node root,int k){
		
		if(root==null) return root;
	
		Node cur=root;
		Node next=null;
		Node prev=null;
		int count=0;
		// 1->2->3->4->null
		
		while(count<k && cur!=null){
			
			next=cur.next;
			cur.next=prev;		
			prev=cur;
			cur=next;
			count++;			
		}
		/* next is now a pointer to (k+1)th node 
        Recursively call for the list starting from current.
        And make rest of the list as next of first node */
		
		if(next!=null){
			cur.next=reverseLinkedListInPairsOf(next,k);
		}
		
		return prev;
	}
	

	
	
	
	Node reverseALinkedList(Node root){
		
		if(root==null) return root;
		
		Node prev=null;
		Node cur=head;
		Node next=null;
		
		//1->2->3->4->null
		
		next=cur.next;
		
		while(cur!=null){
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			
		}
		cur=prev;
		
		return cur;
	}
}





public class LinkedListMiddle {

	public static void main(String fp[]){

		MyLinkedList list=new MyLinkedList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(60);
		list.add(70);
		list.add(80);
	
		
		list.printList();
		System.out.println("Middle Element " + list.getMiddleLinkedListElement().data);
		//list.removeDuplicatesFromSortedList();
		//list.printList();
		
		//list.reverseListInGroupsOfK(3);
	//	list.printList();
		
		//list.makeListCircular();
		System.out.println("Does List has circular " + list.doesListHaveLoop());
		
		//System.out.println(list.getKthNodeFromListEnd(2).data);
		System.out.println(list.isListPalindromeStack());
		
		//list.RotateListByKNodes(5);
		//list.printList();
		
		MyLinkedList list1=new MyLinkedList();
		list1.add(10);
		list1.add(20);
		list1.add(3);
		list1.add(5);
		list1.printList();
		
	//	System.out.println("Nowp rinting final ");
//		list1.printListWithHead(list1.mergeTwoLists(list.head, list1.head));
		
		System.out.println();
		list.fitValueInPlace( 50);
		list.printListWithHead(list.getHead());
		System.out.println();
		list.printListWithHead(list.reverseLinkedList());
		//list.printListWithHead(list.getHead());
		
	}
}
