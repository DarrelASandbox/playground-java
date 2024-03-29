package src._04operatorAndExpressions;

public class _06WideningAndNarrowing {

  public static void main(String[] args) {
    byte b = 5;
    short s = 200;
    int i = 10;
    long l = 10;
    float f = 10.5f;
    double d = 10;
    char c = 10;
    boolean bl = true;

    // Force by type casting with data loss
    b = (byte) s; // Max value of byte is 127
    System.out.println(b);
    i = s;
    l = s;
    f = s;
    d = s;

    i = (int) f;
    System.out.println(i); // 10 instead of 10.5f

    System.out.println(l);
    System.out.println(d);
    System.out.println(c);
    System.out.println(bl);
  }
}
