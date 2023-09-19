package src._18exceptionHandling;

class NegativeDimensionException extends Exception {
  public String toString() {
    return "Dimension of a rectangle cannot be negative.";
  }
}

public class _02ThrowException {

  static int someMethod1() {
    return 10 / 2;
  }

  static void someMethod2() {
    someMethod1();
  }

  static void someMethod3() {
    someMethod2();
  }

  static int area(int l, int b) throws NegativeDimensionException {
    if (l < 0 || b < 0)
      throw new NegativeDimensionException();
    return l * b;
  }

  static void printArea() throws NegativeDimensionException {
    System.out.println("Area is " + area(10, 5));
  }

  static void finallyMethod() throws Exception {
    try {
      throw new Exception();
    } finally {
      System.out.println("\nFinal Message from finallyMethod");
    }
  }

  public static void main(String[] args) throws Exception {

    // Propagation of exception
    try {
      someMethod3();
    } catch (Exception e) {
      System.out.println(e);
    }

    try {
      printArea();
    } catch (NegativeDimensionException e) {
      System.out.println(e);
    }

    finallyMethod();
  }
}
