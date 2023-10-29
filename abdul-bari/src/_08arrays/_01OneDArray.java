package src._08arrays;

import java.util.Arrays;

public class _01OneDArray {
  public static void main(String[] args) {
    int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10, 11, 13, 14 };
    int B[] = new int[10];
    B[0] = 3;
    B[1] = 9;
    B[2] = 7;
    B[3] = 8;
    B[4] = 12;
    B[5] = 6;

    int key = 2;
    int num = 13;

    arrayPractice();
    printSumAllElements(A);
    printSearchAnElement(A, num);
    printMaxElement(A);
    printSecondMaxElement(A);
    printRotatingAnArrayToTheLeft(A);
    printRotatingAnArrayToTheRight(A);
    printInsertedNewElement(B, key, num);
    printDeletedNewElement(B, key);
    printCopyArray(A);
    printReverseCopyArray(A);
    printIncreasedSizeArray(A);
  }

  private static void arrayPractice() {
    int A[] = new int[10];
    int B[] = { 1, 2, 3, 4, 5 };
    float[] C;
    C = new float[10];
    int[] D = new int[5];

    B[2] = 15;

    System.out.print("\nA: ");
    for (int i = 0; i < A.length; i++)
      System.out.print(A[i] + " ");

    System.out.print("\nB: ");
    for (int i = 0; i < B.length; i++)
      System.out.print(B[i] + " ");

    System.out.print("\nB: ");
    for (int x : B)
      System.out.print(++x + " ");

    System.out.print("\nB: ");
    for (int i = 0; i < B.length; i++)
      System.out.print(B[i]++ + " ");

    System.out.print("\nB: ");
    for (int x : B)
      System.out.print(x + " ");

    System.out.println("\nC of length " + C.length + ": " + C);
    System.out.println("D of length " + D.length + ": " + D);
  }

  private static void printSumAllElements(int[] A) {
    int sum = 0;
    for (int x : A)
      sum += x;
    System.out.println("\nSum is " + sum);
  }

  private static void printSearchAnElement(int[] A, int num) {

    for (int i = 0; i < A.length; i++) {
      if (A[i] == num) {
        System.out.println("Found element " + A[i] + " at index " + i);
        return;
      }
    }
    System.out.println("Element not found");
  }

  private static void printMaxElement(int[] A) {
    int max = 0;
    for (int x : A)
      if (x > max)
        max = x;

    System.out.println("Max number is " + max);
  }

  private static void printSecondMaxElement(int[] A) {
    int max, secondMax;
    max = secondMax = A[0];

    for (int x : A) {
      if (x > max) {
        secondMax = max;
        max = x;
      }
    }
    System.out.println("Second max number is " + secondMax);
  }

  private static void printRotatingAnArrayToTheLeft(int[] A) {
    int temp = A[0];

    for (int i = 1; i < A.length; i++)
      A[i - 1] = A[i];

    A[A.length - 1] = temp;
    System.out.println("\nRotate to the left:");
    for (int x : A)
      System.out.print(x + " ");
  }

  private static void printRotatingAnArrayToTheRight(int[] A) {
    System.out.println("");
    int temp = A[A.length - 1];

    for (int i = A.length - 1; i > 0; i--)
      A[i] = A[i - 1];

    System.out.println("Rotate to the right:");
    A[0] = temp;
    for (int x : A)
      System.out.print(x + " ");
  }

  private static void printInsertedNewElement(int[] B, int key, int num) {
    // Find the count of non-zero elements
    int n = (int) Arrays.stream(B).filter(x -> x != 0).count();

    System.out.print("\n\nOriginal: ");
    for (int i = 0; i < n; i++)
      System.out.print(B[i] + " ");
    System.out.println("");

    for (int i = n; i > key; i--)
      B[i] = B[i - 1];
    B[key] = num;

    System.out.print("Inserted num " + num + ": ");
    for (int i = 0; i < n + 1; i++)
      System.out.print(B[i] + " ");
    System.out.print("");
  }

  private static void printDeletedNewElement(int[] B, int key) {
    System.out.println("");
    // Find the count of non-zero elements
    int n = (int) Arrays.stream(B).filter(x -> x != 0).count();

    for (int i = key; i < n - 1; i++)
      B[i] = B[i + 1];
    B[n - 1] = 0;

    System.out.print("Inserted element at index " + key + ": ");
    for (int i = 0; i < n; i++)
      System.out.print(B[i] + " ");
    System.out.print("");
  }

  private static void printCopyArray(int[] A) {
    System.out.println("");
    int B[] = new int[A.length];
    for (int i = 0; i < A.length; i++)
      B[i] = A[i];

    System.out.print("A: ");
    for (int i : A)
      System.out.print(i + " ");

    System.out.print("\nB: ");
    for (int i : B)
      System.out.print(i + " ");

    System.out.println("\nA == B " + (A == B));
  }

  private static void printReverseCopyArray(int[] A) {
    System.out.println("");
    int B[] = new int[A.length];
    for (int i = A.length - 1, j = 0; i >= 0; i--, j++)
      B[j] = A[i];

    System.out.print("A: ");
    for (int i : A)
      System.out.print(i + " ");

    System.out.print("\nB: ");
    for (int i : B)
      System.out.print(i + " ");
  }

  private static void printIncreasedSizeArray(int[] A) {
    System.out.println("\nLength of A is " + A.length);
    int B[] = new int[A.length + 2];

    // A point to B
    // A will then be garbage collected
    // B will be set to null
    for (int i = 0; i < A.length; i++)
      B[i] = A[i];
    A = B;
    B = null;

    System.out.println("Length of A has changed to " + A.length);
    System.out.println("B is set to " + B);

    System.out.print("A: ");
    for (int i : A)
      System.out.print(i + " ");
  }
}
