package src._04operatorAndExpressions;

public class _04BitwiseOperator {
  public static void main(String[] args) {

    int x = 10, y = 6, z;
    z = x & y;
    System.out.println("z:  " + z);

    int x1 = 0b1010, y1 = 0b0110, z1;
    z1 = x1 | y1; // x1 ^ y1
    System.out.println("z1: " + z1);

    int x2 = 0b1000;
    int y2;
    y2 = x2 << 1; // x2 << 2 // x2 >> 1 // x2 >> 2
    System.out.println("y2: " + y2);

    int x3 = -0b1010; // try with + and -
    int y3;
    y3 = x3 >> 1; // ~x
    System.out.println("x3: " + String.format("%s", Integer.toBinaryString(x3)));
    System.out.println("y3: " + String.format("%s", Integer.toBinaryString(y3)));
  }
}
