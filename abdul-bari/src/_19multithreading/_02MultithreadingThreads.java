package src._19multithreading;

public class _02MultithreadingThreads extends Thread {
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

  public static void main(String[] args) {
    _02MultithreadingThreads t = new _02MultithreadingThreads();
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
