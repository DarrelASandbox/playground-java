package src._05stringClassAndPrinting;

public class _01Printing {
  public static void main(String[] args) {
    int a = 10;
    float b = 12.55f;
    char c = 'A';
    String str = "Hello";

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(str);

    int x = 10, y = 20;
    System.out.println("\n" + x + y);
    System.out.println("Number is " + y);
    System.out.println("sum " + x + y);
    System.out.println(x + y + " sum");
    System.out.println("sum " + (x + y));
    System.out.println("sum of " + x + " and " + y + " is " + (x + y));

    int x1 = 10;
    float y1 = 12.56f;
    char z1 = 'A';
    String str1 = "Java Program";

    System.out.printf("\n%3$s %2$f %1$d", x1, y1, str1);
    System.out.printf("\nHello %d %f %c %s\n", x1, y1, z1, str1);
    // %o,%x,%e for float value

    int a2 = 10;
    System.out.printf("\n%05d", a2);

    int b2 = -10;
    System.out.printf("\n%(5d", b2);

    float c2 = 123.45f; // 3.45f
    System.out.printf("\n%6.2f", c2);

    String str2 = "Java";
    System.out.printf("\n%20s", str2);
  }
}
