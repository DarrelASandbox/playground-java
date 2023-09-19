package src._18exceptionHandling;

class SomeCustomException extends Exception {
  public String toString() {
    return "This is SomeCustomException";
  }
}

public class _01HandleException {

  public static void main(String[] args) {
    int A[] = { 10, 0, 8, 3, 5 };

    singleTryCatch(A);
    nestedTryCatch(A);
    multipleTryCatch(A);
    appendTryCatch(A);
    checkUnchecked();

    System.out.println("\nEnd of program");
    System.out.println("Goodbye");
  }

  static void singleTryCatch(int[] A) {
    try {
      int a, b, c;

      a = A[0];
      b = A[1];
      c = a / b;

      System.out.println("Result of c is " + c);
      System.out.println(A[10]);

    } catch (ArithmeticException e) {
      System.out.println("\nDenominator should not be ZERO\n" + e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("\nIndex is invalid\n" + e);
    }
  }

  static void nestedTryCatch(int[] A) {
    try {
      int a, b, c;

      a = A[0];
      b = A[1];
      c = a / b;

      System.out.println("Result of c is " + c);

      try {
        System.out.println(A[10]);

      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("\nIndex is invalid\n" + e);
      }

    } catch (ArithmeticException e) {
      System.out.println("\nDenominator should not be ZERO\n" + e);
    }
  }

  static void multipleTryCatch(int[] A) {

    int a, b, c;
    a = A[0];
    b = A[1];

    try {
      c = a / b;
      System.out.println("Result of c is " + c);
    } catch (ArithmeticException e) {
      System.out.println("\nDenominator should not be ZERO\n" + e);
    }

    try {
      System.out.println(A[10]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("\nIndex is invalid\n" + e);
    }
  }

  static void appendTryCatch(int[] A) {
    StringBuilder errors = new StringBuilder();

    int a, b, c;
    a = A[0];
    b = A[1];

    try {
      c = a / b;
      System.out.println("Result of c is " + c);
    } catch (ArithmeticException e) {
      errors.append("\nDenominator should not be ZERO").append("\n" + e + "\n");
    }

    try {
      System.out.println(A[10]);
    } catch (ArrayIndexOutOfBoundsException e) {
      errors.append("\nIndex is invalid").append("\n" + e);
    }

    if (errors.length() > 0) {
      System.out.println("Errors:" + errors.toString());
    }
  }

  static void someMethod1() {
    try {
      throw new SomeCustomException();
    } catch (SomeCustomException e) {
      System.out.println(e);
    }

    System.out.println("someMethod1");
  }

  static void someMethod2() {
    someMethod1();
  }

  static void someMethod3() {
    someMethod2();
  }

  static void checkUnchecked() {
    someMethod3();
  }
}
