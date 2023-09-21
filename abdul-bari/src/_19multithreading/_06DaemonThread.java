package src._19multithreading;

class MyThread3 extends Thread {
  public void run() {
    int count = 1;

    // Infinite loop
    while (true) {
      System.out.println(count++);
    }
  }
}

public class _06DaemonThread {
  public static void main(String[] args) throws Exception {
    MyThread3 t2 = new MyThread3();
    System.out.println("\nthreadId: " + t2.threadId());
    System.out.println("getName: " + t2.getName());

    // Set the thread `t2` to be a daemon thread using `t2.setDaemon(true);`.
    // This means that when all user threads (in this case, the main thread) finish their execution,
    // the JVM will terminate this daemon thread automatically, even if its `run()` method is stuck in an infinite loop.
    t2.setDaemon(true);
    t2.start();

    try {
      Thread.sleep(100);
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
