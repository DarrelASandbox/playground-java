package src._19multithreading;

class MyThread2 extends Thread {
  public MyThread2(String name) {
    super(name);
    setPriority(MIN_PRIORITY + 2); // 3
  }

  public void run() {
    int count = 1;
    while (count <= 30) {
      System.out.println(count++);
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        System.out.println(e);
      }
    }
  }
}

class MyRun2 implements Runnable {
  public void run() {
  };
}

public class _05ThreadMethods {

  public static void main(String[] args) throws Exception {
    Thread t1 = new Thread(new MyRun2());
    System.out.println("threadId: " + t1.threadId());

    MyThread2 t2 = new MyThread2("MyThread2");
    System.out.println("\nthreadId: " + t2.threadId());
    System.out.println("getName: " + t2.getName());
    System.out.println("getPriority: " + t2.getPriority()); // 5
    t2.start();
    t2.interrupt();
    System.out.println("getState: " + t2.getState());
    System.out.println("isAlive: " + t2.isAlive());
  }
}
