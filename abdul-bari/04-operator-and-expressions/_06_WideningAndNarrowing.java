public class _06_WideningAndNarrowing {

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

    i = (int) f2;
    System.out.println(i); // 10 instead of 10.5f
  }
}
