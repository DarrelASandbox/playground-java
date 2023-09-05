package src._09methods;

public class _02Methods {
  public static void main(String[] args) {
    // Method overloading
    System.out.println(calculateArea(5, 4));
    System.out.println(calculateArea(20));
    System.out.println(calculateArea(66, 67, 68));
    System.out.println(reverse(7321));
    reverse(new int[] { 1, 2, 3, 4 }); // Anonymous array
    System.out.println("\n" + validate("tom49"));
    System.out.println(validate("tom hanks"));
    System.out.println(validate(3));

    // Variable arguments
    show();
    show(99, 98, 97);
    show(new int[] { 3, 5, 7, 9, 11, 13, 15 });
    showList(5, "John", "Smith", "Jay", "Ahmed");
    System.out.println(max(1, 2, 3, 4));
    System.out.println(sumAll(1, 2, 3, 4, 5));
    System.out.println(discount(1000.45, 40.95, 450.10));

    // Recursion
    fun(40);
  }

  // Square or rectangle
  static int calculateArea(int l, int b) {
    return l * b;
  };

  // Circle
  static double calculateArea(int r) {
    return Math.PI * r * r;
  }

  // Trapezium
  static double calculateArea(int a, int b, int h) {
    return 0.5 * (a + b) * h;
  }

  static int reverse(int n) {
    int rev = 0;
    while (n > 0) {
      rev = rev * 10 + (n % 10);
      n /= 10;
    }
    return rev;
  }

  static void reverse(int[] arr) {
    int[] arr2 = new int[arr.length];
    for (int i = arr.length - 1, j = 0; i >= 0; i--, j++)
      arr2[j] = arr[i];
    arr = arr2;
    for (int i : arr)
      System.out.print(i + " ");
  }

  static boolean validate(String name) {
    return name.matches("[a-zA-Z\\s]+");
  }

  static boolean validate(int age) {
    return age >= 3 && age <= 15;
  }

  static void show(int... A) {
    for (int i : A)
      System.out.print(i + " ");
  }

  static void showList(int start, String... S) {
    System.out.println("");
    for (int i = 0; i < S.length; i++) {
      System.out.println(start + ". " + S[i]);
      start++;
    }
  }

  static int max(int... A) {
    int max = 0;
    if (A.length == 0)
      return Integer.MIN_VALUE;
    for (int i : A) {
      if (i > max)
        max = i;
    }
    return max;
  }

  static int sumAll(int... A) {
    int sum = 0;
    for (int i : A)
      sum += i;
    return sum;
  }

  static int discount(double... P) {
    double sum = 0;
    int discount = 0;

    for (double i : P)
      sum += i;

    if (sum >= 5000)
      discount = 20;
    else if (sum >= 2500)
      discount = 15;
    else if (sum >= 999)
      discount = 10;
    else
      discount = 5;

    return discount;
  }

  static void fun(int n) {
    if (n > 0) {
      fun(n - 1);
      System.out.print(n + " ");
    }
  }
}
