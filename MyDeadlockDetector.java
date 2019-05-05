package oneMorePractice;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

 interface DeadlockHandler {
  void handleDeadlock(final ThreadInfo[] deadlockedThreads);
}

 public class MyDeadlockDetector {

  private final DeadlockHandler deadlockHandler;
  private final long period;
  private final TimeUnit unit;
  private final ThreadMXBean mbean = ManagementFactory.getThreadMXBean();
  private final ScheduledExecutorService scheduler = 
  Executors.newScheduledThreadPool(1);
  
  final Runnable deadlockCheck = new Runnable() {
    @Override
    public void run() {
      long[] deadlockedThreadIds = MyDeadlockDetector.this.mbean.findDeadlockedThreads();
    
      if (deadlockedThreadIds != null) {
        ThreadInfo[] threadInfos = 
        MyDeadlockDetector.this.mbean.getThreadInfo(deadlockedThreadIds);
      
        MyDeadlockDetector.this.deadlockHandler.handleDeadlock(threadInfos);
      }
    }
  };
  
  public MyDeadlockDetector(final DeadlockHandler deadlockHandler, 
    final long period, final TimeUnit unit) {
    this.deadlockHandler = deadlockHandler;
    this.period = period;
    this.unit = unit;
  }
  
  public void start() {
    this.scheduler.scheduleAtFixedRate(
    this.deadlockCheck, this.period, this.period, this.unit);
  }
}













class DeadlockConsoleHandler implements DeadlockHandler {

	  @Override
	  public void handleDeadlock(final ThreadInfo[] deadlockedThreads) {
	    if (deadlockedThreads != null) {
	      System.err.println("Deadlock detected!");
	      
	      Map<Thread, StackTraceElement[]> stackTraceMap = Thread.getAllStackTraces();
	      for (ThreadInfo threadInfo : deadlockedThreads) {
	      
	        if (threadInfo != null) {
	      
	          for (Thread thread : Thread.getAllStackTraces().keySet()) {
	        
	            if (thread.getId() == threadInfo.getThreadId()) {
	              System.err.println(threadInfo.toString().trim());
	                
	              for (StackTraceElement ste : thread.getStackTrace()) {
	                  System.err.println("\t" + ste.toString().trim());
	              }
	            }
	          }
	        }
	      }
	    }
	  }
	}


