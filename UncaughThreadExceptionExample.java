package oneMorePractice;

public class UncaughThreadExceptionExample {

	 static int count = 0;
     
	 
	 
	    public class MyWorker extends Thread {
	        public void run() {
	            while ( true ) {
	                try {
	                    // Do this work every second forever unless interuppted
	                    doWork();
	                    Thread.sleep(1000);
	                }
	                catch ( InterruptedException e ) { 
	                    return;
	                }
	            }
	        }
	         
	        private void doWork() {
	            // Simulate work that sometimes results in NullPointerException
	            StringBuffer sb = new StringBuffer("My Work counter: ");
	            if ( count++ >= 5 ) {
	                sb = null; //oops!
	                count = 0;
	            }
	            sb.append(count);
	            System.out.println(sb.toString());
	        }
	    }
	     
	    public UncaughThreadExceptionExample() {
	        MyWorker worker = new MyWorker();
	        
	        Thread.setDefaultUncaughtExceptionHandler(
	        		new Thread.UncaughtExceptionHandler() {
	        			public void uncaughtException(Thread t, Throwable e) {
	                        System.out.println(t.getName()+": "+e);
	                        MyWorker worker = new MyWorker();
	                        worker.start();
	                    }
	        		}
	        );
	        
	        try{
	        	worker.start();
	        }catch(Exception e){
	        	//System.out.println(e);
	        }
	       
	        
	    }
	     
	    public static void main(String[] args) {
	    	UncaughThreadExceptionExample te = new UncaughThreadExceptionExample();
	    }
}
