package src._19multithreading;

class MyData2 {
  int value;

  public void set(int v) {
    value = v;
  }

  public int get() {
    int x = 0;
    x = value;
    return x;
  }
}

class Producer extends Thread {
  MyData2 data;

  public Producer(MyData2 d) {
    data = d;
  }

  public void run() {
    int count = 1;
    while (true) {
      data.set(count);
      System.out.println("Producer: " + count);
      count++;
    }
  }
}

class Consumer extends Thread {
  MyData2 data;

  public Consumer(MyData2 d) {
    data = d;
  }

  public void run() {
    int value;
    while (true) {
      value = data.get();
      System.out.println("Consumer: " + value);
    }
  }
}

public class _11InterProcess {
  public static void main(String[] args) {
    MyData2 data = new MyData2();
    Producer p = new Producer(data);
    Consumer c = new Consumer(data);
    p.start();
    c.start();
  }
}
