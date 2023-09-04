package src._09methods;

public class _01MethodPractice {

  public static void main(String[] args) {
    int a = 10, b = 15;

    // 1. Create a static method
    // 2. Create an object before calling the method
    _01MethodPractice mp = new _01MethodPractice();
    System.out.println("max: " + mp.max(a, b));

    inc(a);
    System.out.println("After calling inc(a): " + a);

    // The array object is created in the main method
    // And update method is accessing that same object
    System.out.print("\nchange: ");
    int A[] = { 2, 4, 6, 8, 10 };
    change(A, 2, 20);
    for (int x : A)
      System.out.print(x + " ");

    int x = 10;
    change2(x, 20);
    System.out.println("\nValue of Primitive " + x);
  }

  int max(int x, int y) {
    if (x > y)
      return x;
    else
      return y;
  }

  static void inc(int x) {
    x++;
    System.err.println("inc x: " + x);
  }

  static void change(int A[], int index, int value) {
    A[index] = value;
  }

  static void change2(int x, int value) {
    x = value;
  }
}
