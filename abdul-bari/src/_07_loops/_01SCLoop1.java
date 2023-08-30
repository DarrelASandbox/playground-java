package src._07_loops;

import java.util.Scanner;

public class _01SCLoop1 {
  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a number");
      int n = sc.nextInt();
      System.out.println("\nOutput:\n");

      printMultiplicationTable(n);
      printSumOfNaturalNumbers(n);
      printFactorial(n);
      printDigitsOfANumber(n);
      printCountDigitsOfANumber(n);
      printArmstrongNumber(n);
      printReverseNumber(n);
      printPalindrome(n);
      printDisplayNumberInWords(n);
      printAPSeries(sc);
      printGPSeries(sc);
      printFibonacci(sc);
    }
  }

  private static void printMultiplicationTable(int n) {
    for (int i = 0; i < 10; i++) {
      System.out.println(n + "x" + i + "=" + n * i);
    }
  }

  private static void printSumOfNaturalNumbers(int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum = sum + i;
    }
    System.out.println("\nSum of " + n + " is " + sum);
  }

  private static void printFactorial(int n) {
    long factorial = 1;
    for (int i = 1; i <= n; i++) {
      factorial = factorial * i;
    }
    System.out.println("\nFactorial is " + factorial + "\n");
  }

  private static void printDigitsOfANumber(int n) {
    int r;
    while (n > 0) {
      r = n % 10;
      n = n / 10;
      System.out.println(r);
    }
  }

  private static void printCountDigitsOfANumber(int n) {
    int count = 0;
    while (n > 0) {
      n = n / 10;
      count++;
    }
    System.out.println("\n" + count);
  }

  // Armstrong number is a number that is equal to the sum of cubes of its digits.
  private static void printArmstrongNumber(int n) {
    int m = n;
    int sum = 0;
    int r;

    while (n > 0) {
      r = n % 10;
      n = n / 10;
      sum = sum + r * r * r;
    }

    if (sum == m) {
      System.out.println("\nIt's an Armstrong Number.");
    } else {
      System.out.println("\nIt's not an Armstrong Number.");
    }
  }

  private static void printReverseNumber(int n) {
    int rev = 0, r;
    while (n > 0) {
      r = n % 10;
      rev = rev * 10 + r;
      n /= 10;
    }
    System.out.println("\nReverse Number: " + rev);
  }

  private static void printPalindrome(int n) {
    int m = n;
    int rev = 0, r;
    while (n > 0) {
      r = n % 10;
      rev = rev * 10 + r;
      n /= 10;
    }
    System.out.println("\nIs palindrome: " + (rev == m));
  }

  private static void printDisplayNumberInWords(int n) {
    int r;
    String str = "";
    while (n > 0) {
      r = n % 10;
      n = n / 10;
      str = str + r;
    }

    System.out.println("\n" + str);

    char c;
    for (int i = str.length() - 1; i >= 0; i--) {
      c = str.charAt(i);
      switch (c) {
        case '0':
          System.out.print("Zero");
          break;
        case '1':
          System.out.print("One ");
          break;
        case '2':
          System.out.print("Two ");
          break;
        case '3':
          System.out.print("Three ");
          break;
        case '4':
          System.out.print("Four ");
          break;
        case '5':
          System.out.print("Five ");
          break;
        case '6':
          System.out.print("Six ");
          break;
        case '7':
          System.out.print("Seven ");
          break;
        case '8':
          System.out.print("Eight ");
          break;
        case '9':
          System.out.print("Nine ");
          break;
      }
    }
  }

  private static void printAPSeries(Scanner sc) {
    System.out.println("\nProgram to print AP Series");
    System.out.println("Enter a, d and n");
    int a = sc.nextInt();
    int d = sc.nextInt();
    int n = sc.nextInt();

    int term = a;
    for (int i = 0; i < n; i++) {
      System.out.print(term + ",");
      term = term + d;
    }
  }

  private static void printGPSeries(Scanner sc) {
    System.out.println("\nProgram to print GP Series");
    System.out.println("Enter a, r and n");
    int a = sc.nextInt();
    int r = sc.nextInt();
    int n = sc.nextInt();

    int term = a;
    for (int i = 0; i < n; i++) {
      System.out.print(term + ",");
      term = term * r;
    }

  }

  private static void printFibonacci(Scanner sc) {
    System.out.println("\nProgram to Fibonacci Series");
    System.out.println("Enter number of Terms");

    int n = sc.nextInt();
    int a = 0, b = 1, c;
    System.out.print(a + "," + b + ",");
    for (int i = 0; i < n - 2; i++) {
      c = a + b;
      System.out.print(c + ",");
      a = b;
      b = c;
    }
  }

}
