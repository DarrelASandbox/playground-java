package src._19multithreading;

// Runnable Interface
public class _04MultithreadingRunnable implements Runnable {
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

  public static void main(String[] args) {
    _04MultithreadingRunnable t = new _04MultithreadingRunnable();
    Thread th = new Thread(t);

    th.start();
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
