package src._19multithreading;

class MyThread4 extends Thread {
  public void run() {
    int count = 1;

    while (true) {
      System.out.println(count++);
    }
  }
}

public class _07JoinThread {
  public static void main(String[] args) throws InterruptedException {
    MyThread4 t2 = new MyThread4();
    System.out.println("\nthreadId: " + t2.threadId());
    System.out.println("getName: " + t2.getName());
    t2.setDaemon(true);
    t2.start();
    Thread mainThread = Thread.currentThread();
    mainThread.join();
  }
}
