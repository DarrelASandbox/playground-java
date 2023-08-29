package src._04operatorAndExpressions;

public class _03IncDec {
  public static void main(String[] args) {

    // float x=3.5f
    // char x='A'
    // byte x=5

    int x = 5;
    x++; // ++x
    System.out.println("5++:  " + x);

    int x1 = 5, y1;
    y1 = x1++; // ++x1
    System.out.println("5: " + x1 + "   5++: " + y1);

    int x2 = 5, y2 = 4, z2;
    z2 = 2 * x2++ + 3 * ++y2;
    System.out.println("2 * 5++ + 3 * ++4: " + z2);
  }
}
