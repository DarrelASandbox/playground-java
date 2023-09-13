package src._12abstractClasses;

// Abstract class is meant for inheritance
abstract class Super4 {
  public Super4() {
    System.out.println("Super Constructor");
  }

  public void method1() {
    System.out.println("Method 1 of Super4");
  }

  // Abstract method
  abstract public void method2();
}

class Sub4 extends Super4 {
  @Override
  public void method2() {
    System.out.println("Method 2 of Sub4");
  }
}

public class _01AbstractClasses {
  public static void main(String[] args) {
    Super4 s = new Sub4();
    s.method1();
    s.method2();
  }
}