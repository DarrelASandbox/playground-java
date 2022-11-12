public class _03_Literals {
  public static void main(String[] args) {
    byte b1 = 10;
    byte b2 = 0b1010;
    byte b3 = 012;
    byte b4 = 0XA;

    System.out.println("Different number system of integer literals:");
    System.out.println("Octal\t\tb1:\t" + b1);
    System.out.println("Binary\t\tb2:\t" + b2);
    System.out.println("Decimal\t\tb3:\t" + b3);
    System.out.println("Hexadecimal\tb4:\t" + b4);

    long l = 9_999_999_999L;
    float f = 12.56f;
    double d = 12.56d;

    System.out.println("\nLong literals:");
    System.out.println("long\tl: " + l);
    System.out.println("float\tf: " + f);
    System.out.println("double\td: " + d);
  }
}
