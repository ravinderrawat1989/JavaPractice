package oneMorePractice;

import java.lang.reflect.Constructor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    	
    	
    	// Check if we already have an instance
//        if (INSTANCE != null) {
//           throw new IllegalStateException("Singleton" +
//             " instance already created.");
//        }
//    	
        System.out.println("Singleton Constructor Running...");
    }

    public static final Singleton getInstance() {
        return INSTANCE;
    }
}

public class Test {
	 public static void main(String[] args) throws Exception {

		 	//SecurityManager mgr = new SecurityManager();
	        //System.setSecurityManager(mgr);
	        
	        
	        Singleton s = Singleton.getInstance();

	        Class clazz = Singleton.class;

	        Constructor cons = clazz.getDeclaredConstructor();
	        cons.setAccessible(true);

	        Singleton s2 = (Singleton) cons.newInstance();
	        
	        System.out.println("s = "+s);
	        System.out.println("s2 = "+s2);
	        
	     //   System.out.println("Dsds" + Class.forName("oneMorePractice.Singleton").newInstance());
	      //  System.out.println("Dsds" + Class.forName("oneMorePractice.Singleton").newInstance());
	        
	        
	        Counter x= new Counter();
	        System.out.println(x.inc());
	        System.out.println(x.inc());
	        System.out.println(x.inc());
	        
	        System.out.println(3*0.1f == 0.3f);
	        
	    }
}

class Counter{

	  private ReentrantLock lock = new ReentrantLock();
	  private int count = 0;

	  public int inc(){
	    lock.lock();
	    int newCount = ++count;
	    lock.unlock();
	    return newCount;
	  }
	}
