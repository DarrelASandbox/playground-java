package src._19multithreading;

// Thread Class
// Need to override `run` method
class MyThread extends Thread {
  @Override
  public void run() {
    int i = 1;
    while (true) {
      System.out.println(i + " Hello");
      i++;

      try {
        Thread.sleep(100); // Sleep for 100 milliseconds (1 second)
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class _01MultithreadingThreads {
  public static void main(String[] args) {
    MyThread t = new MyThread();
    t.start();
    int i = 1;
    while (true) {
      System.out.println(i + " World");
      i++;

      try {
        Thread.sleep(100); // Sleep for 100 milliseconds (1 second)
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
