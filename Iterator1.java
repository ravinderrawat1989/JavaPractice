package oneMorePractice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;

public class Iterator1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Apple", "Banana", "Orange");
		 Iterator<String> i = list.iterator();
		 i.next();
		 //i.forEachRemaining(System.out::print);
		 
		 
		 
		 
		 
		 //Iterable now has one new method forEach
		 //This method was added to take advantage of lambda expression
		 System.out.println();
		 System.out.println(+-1);
		 List<String> list1 = Arrays.asList("Apple", "Banana", "Orange");
		 //list1.forEach(System.out::println);
		 
		 
		 
		 
		 
		 
		 
		 //Spliterators:::
		 List<String> list2 = Arrays.asList("Apple", "Banana", "Orange");
		 Spliterator<String> s = list.spliterator();
		 s.tryAdvance(System.out::println);
		 System.out.println(" --- bulk traversal");
		 s.forEachRemaining(System.out::println);
		 
		 
		 System.out.println(" --- attempting tryAdvance again");
		 boolean b =s.tryAdvance(System.out::println);
		 System.out.println("Element exists: "+b);
		 
		 
		 
		 System.out.println("xxxxxxxxxxxxxxxxxxxxxx");
		 
		 //
		 //
		 List<String> list3 = Arrays.asList("Apple", "Banana", "Orange","melon","musk");
		 Spliterator<String> s3 = list3.spliterator();
		 Spliterator<String> s4 = s3.trySplit();
		 Spliterator<String> s5= s4.trySplit();
		 
		 s3.forEachRemaining(System.out::println);
		 System.out.println(".....");
		 s4.forEachRemaining(System.out::println);
		 System.out.println(".....");
		 s5.forEachRemaining(System.out::println);
		 
		 
		 
		 String initialReference = "initial value referenced";

		 AtomicReference<String> atomicStringReference =
		     new AtomicReference<String>(initialReference);

		 String newReference = "new value referenced";
		 boolean exchanged = atomicStringReference.compareAndSet(new String("initial value referenced"), newReference);
		 System.out.println("exchanged: " + exchanged);

		 exchanged = atomicStringReference.compareAndSet(initialReference, newReference);
		 System.out.println("exchanged: " + exchanged);
		 System.out.println(atomicStringReference.get());
		 
		 LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
	}

}
