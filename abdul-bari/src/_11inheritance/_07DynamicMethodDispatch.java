package src._11inheritance;

class Super2 {
  public void method1() {
    System.out.println("Super2 Method 1");
  }

  public void method2() {
    System.out.println("Super2 Method 2");
  }
}

class Sub2 extends Super2 {
  @Override
  public void method2() {
    System.out.println("Sub2 Method 2");
  }

  public void method3() {
    System.out.println("Sub2 Method 3");
  }
}

public class _07DynamicMethodDispatch {

  public static void main(String[] args) {
    Super2 super1 = new Super2();
    super1.method1();
    super1.method2();

    // Reference of Super2 class and 
    // object of Sub2 class is attached
    Super2 super2 = new Sub2();
    super2.method1();
    super2.method2();
  }
}
