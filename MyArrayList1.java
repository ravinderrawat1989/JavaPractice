package oneMorePractice;


class MyArrayList{

	int size=10;
	int[] arr=new int[size];
	
	int current=0;
	
	int get(int index){
		
		if(index>=0 && index< current)
			return arr[index];
		else
			return -11;
	}
	
	void remove(int index){
	
		//To remove value at index 
		
		if(index<0) return ;
		
		if(index>current) return;
		
		
		for(int i=index+1;i<arr.length;i++){
		
			arr[i-1]=arr[i];
		}
		
		arr[arr.length-1]=0;
	}
	
	void add(int x){
		
		if(current < size()){
			arr[current++]=x;
			//size++;
		}
		else{
			// Resize array
			
			int[] arrTemp=new int[size*2];
			
			for(int i=0;i<size;i++)
				arrTemp[i]=arr[i];
			
			arrTemp[size]=x;
					
			current++;
			size=size*2;
			arr=arrTemp;
		}
	}
	
	int size(){
		return size;
	}
	
	boolean isEmpty(){
		return size==0?true:false;
	}
	
	void printArray(){
	
		for(int i:arr)
			System.out.print(i + " ");
	}
	
}

public class MyArrayList1 {

	public static void main(String[] args) {

		MyArrayList list=new MyArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);	
		list.add(12);	
		//System.out.println(list.get(4));
		list.printArray();
		list.remove(2);
		list.remove(22);
		System.out.println();
		list.printArray();
		
	}

}
