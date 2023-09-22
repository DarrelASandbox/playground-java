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
    MyThread4 t4 = new MyThread4();
    t4.setDaemon(true);
    t4.start();

    Thread mainThread = Thread.currentThread();
    mainThread.join();
  }
}
