public class _01_Arithematic {

  public static void main(String[] args) {

    int a = 14, b = 5;
    int c = a / b;
    int r = a % b;

    System.out.println("integer values:");
    System.out.println("c: " + c);
    System.out.println("r: " + r);

    float a1 = 14.3f, b1 = 3.2f;
    float c1 = a1 / b1;
    float r1 = a1 % b1;

    System.out.println("\nfloat values:");
    System.out.println("c1: " + c1);
    System.out.println("r1: " + r1);

    byte a2 = 10;
    short b2 = 15;
    int c2 = a2 + b2;
    System.out.println("\ndifferent data types:");
    System.out.println("c2: " + c2);

    float a3 = 12.5f;
    long b3 = 1231;
    float c3 = a3 * b3;
    System.out.println("c3: " + c3);

    float a4 = 12.5f;
    double b4 = 123;
    double c4 = a4 * b4;
    System.out.println("c4: " + c4);

    char a5 = 40;
    int b5 = 30;
    int c5 = a5 - b5;
    System.out.println("c5: " + c5);

    System.out.println("\n(10 + 20) / 2 = " + (10 + 20) / 2);
    System.out.println("10 / (2 * 5) = " + 10 / (2 * 5));
  }

}