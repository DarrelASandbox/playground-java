package src._19multithreading;

class MyRunnable implements Runnable {
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

public class _03MultithreadingRunnable {
  public static void main(String[] args) {
    MyRunnable t = new MyRunnable();
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
