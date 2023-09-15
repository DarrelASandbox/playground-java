package src._13interfaces;

// Interfaces are implemented and not extended
interface FirstInterface {
  void method1();

  void method2();

  default void method3() {
    System.out.println("Method 3 of FirstInterface");
  };
}

interface SecondInterface extends FirstInterface {
  void method4();
}

class Implement implements SecondInterface {
  @Override
  public void method1() {
    System.out.println("class Implement method1");
  }

  @Override
  public void method2() {
    System.out.println("class Implement method2");
  }

  @Override
  public void method4() {
    System.out.println("class Implement method4");
  }

  public void method5() {
    System.out.println("class Implement method5");
  }
}

public class _01Interface {

  public static void main(String[] args) {
    // Runtime or Dynamic polymorphism
    // Determine at runtime which method to use
    SecondInterface fi = new Implement();
    fi.method1();
    fi.method2();
    fi.method3();
    fi.method4();
    // Not in SecondInterface
    // fi.method5();
    // Cast `fi` to `Implement` before calling method5:
    ((Implement) fi).method5();
  }
}
