import java.util.LinkedList;

/*
 * use separate queues for dogs and cats, and to place them within a wrapper class called Animal- Queue.
 *  We then store some sort of timestamp to mark when each animal was enqueued. 
 * When we call dequeueAny, we peek at the heads of both the dog and cat queue and return the oldest.
 * 
 */

public class AnimalQueue {

	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0; // acts as timestamp
	
	
	
	public void enqueue(Animal a) {
		/* Order is used as a sort of timestamp, so that we ca
		 *  compare the insertion order of a dog to a cat
		 */
		a.setOrder(order);
		order++;
		
		if (a instanceof Dog) dogs.addLast((Dog) a);
		
		if (a instanceof Cat) cats.addLast((Cat) a);
	}
	
	
	public Dog dequeueDogs(){
		return dogs.poll();
	}

	public Cat dequeueCats(){
		return cats.poll();
	}
	
	public Animal dequeueAny(){
	
		if (dogs.size()==0){
			return dequeueCats();
		}else if(cats.size()==0){
			return dequeueDogs();
		}
		
		Dog dog=dogs.peek();
		Cat cat=cats.peek();
		
		if(dog.isOlderThan(cat)){
			return dequeueDogs();
		}else{
			return dequeueCats();
		}
	}
	
	public static void main(String[] args) {

		
	}

}




 abstract class Animal{
	private int order;
	String name;
	
	public Animal(String name){
		this.name=name;
	}
	
	public void setOrder(int n){
		order=n;
	}
	
	public int getOrder(){
		return order;
	}
	
	public boolean isOlderThan(Animal a){
		return this.order < a.getOrder();
	}
	
}
  
 
  class Dog extends Animal{ 
	 public Dog(String n){
		 super(n);
	 }
 }
  
  class Cat extends Animal{ 
	 public Cat(String n){
		 super(n);
	 }
 }  