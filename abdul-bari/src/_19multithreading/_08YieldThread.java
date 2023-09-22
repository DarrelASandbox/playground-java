package src._19multithreading;

class MyThread5 extends Thread {
  public void run() {
    int count = 1;

    while (true) {
      System.out.println(count++ + " MyThread5");
    }
  }
}

public class _08YieldThread {
  public static void main(String[] args) throws InterruptedException {
    MyThread5 t2 = new MyThread5();
    t2.start();

    int count = 1;
    while (true) {
      System.out.println(count++ + " Main");
      Thread.yield(); // Give more time to MyThread5
    }
  }
}
