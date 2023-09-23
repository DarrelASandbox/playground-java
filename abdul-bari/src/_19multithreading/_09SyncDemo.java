package src._19multithreading;

class MyData {
  public void display(String str) {
    for (int i = 0; i < str.length(); i++)
      System.out.print(str.charAt(i));
  }

  synchronized public void display2(String str) {
    // Critical Section
    for (int i = 0; i < str.length(); i++)
      System.out.print(str.charAt(i));

    try {
      Thread.sleep(1000);
    } catch (Exception e) {
    }
  }
}

class MyThread6 extends Thread {
  MyData d;

  public MyThread6(MyData d) {
    this.d = d;
  }

  @Override
  public void run() {
    // d.display("Hello World!");
    d.display2("Hello World!");
  }
}

class MyThread7 extends Thread {
  MyData d;

  public MyThread7(MyData d) {
    this.d = d;
  }

  @Override
  public void run() {
    // d.display("Welcome All!!");
    d.display2("Welcome All!!");
  }
}

public class _09SyncDemo {
  public static void main(String[] args) {
    MyData data = new MyData();
    MyThread6 t6 = new MyThread6(data);
    MyThread7 t7 = new MyThread7(data);

    t6.start();
    t7.start();
  }
}
