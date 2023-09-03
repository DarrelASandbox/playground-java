package src._08arrays;

public class _02twoDArray {
  public static void main(String[] args) {

    /*
    * | 3 5 9 |  | 1 5 2 |
    * | 7 6 2 |  | 6 8 4 |
    * | 4 3 5 |  | 3 9 7 |
    */

    int A[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
    int B[][] = { { 1, 5, 2 }, { 6, 8, 4 }, { 3, 9, 7 } };
    int B1[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
    String S[] = { "java", "python", "pascal", "smalltalk", "ada", "basic" };

    int numRows = A.length;
    int numCols = A[0].length;
    int C[][] = new int[numRows][numCols];

    arrayPractice();
    printAddTwoMatrices(A, B, C);
    printMultiplyTwoMatrices(A, B1, C);
    printSortArrayOfStrings(S);
  }

  private static void arrayPractice() {
    int A[][] = new int[1][1];
    int B[][] = { { 1, 2, 3 }, { 2, 4, 6 }, { 1, 3, 5 } }; // 3 x 3
    int C[][];
    C = new int[2][];
    C[0] = new int[3];
    C[1] = new int[4];
    int[][] D = new int[3][3];
    int[] E[] = new int[4][4];
    int[] F, G[];
    F = new int[5]; // Single dimensional
    G = new int[6][6]; // Two dimensional

    System.out.println("A: " + A.length + " " + A);
    System.out.println("B: " + B.length + " " + B);
    System.out.println("C: " + C.length + " " + C);
    System.out.println("D: " + D.length + " " + D);
    System.out.println("E: " + E.length + " " + E);
    System.out.println("F: " + F.length + " " + F);
    System.out.println("G: " + G.length + " " + G);

    System.out.println("");
    for (int i = 0; i < B.length; i++) {
      for (int j = 0; j < B.length; j++)
        System.out.print(B[i][j] + " ");
      System.out.println("");
    }

    System.out.println("");
    for (int x[] : B)
      for (int y : x)
        System.out.print(y + " ");

    System.out.println("\n");
    for (int i = 0; i < C.length; i++) {
      for (int j = 0; j < C[i].length; j++)
        System.out.print(C[i][j] + " ");
      System.out.println("");
    }

    System.out.println("");
    for (int x[] : C) {
      for (int y : x)
        System.out.print(y + " ");
      System.out.println("");
    }
  }

  private static void printAddTwoMatrices(int[][] A, int[][] B, int[][] C) {
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A.length; j++)
        C[i][j] = A[i][j] + B[i][j];
    }

    System.out.println("");
    for (int x[] : C) {
      for (int y : x)
        System.out.format("%02d ", y);
      System.out.println("");
    }
  }

  private static void printMultiplyTwoMatrices(int[][] A, int[][] B, int[][] C) {
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A.length; j++) {
        C[i][j] = 0;
        for (int k = 0; k < A.length; k++)
          C[i][j] += A[i][k] * B[k][j];
      }
    }

    System.out.println("");
    for (int x[] : C) {
      for (int y : x)
        System.out.format("%02d ", y);
      System.out.println("");
    }
  }

  private static void printSortArrayOfStrings(String[] S) {
    System.out.println("");
    java.util.Arrays.sort(S);
    for (String x : S)
      System.out.print(x + " ");
  }
}
