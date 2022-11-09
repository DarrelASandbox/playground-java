public class DataTypeDetails {
  public static void main(String[] args) {
    int x = 5;
    int y = -5;
    System.out.println("Integer.toBinaryString(5): " + Integer.toBinaryString(x));
    System.out.println("Integer.toBinaryString(-5): " + Integer.toBinaryString(y));

    System.out.println("\nUnicode:");
    for (char c = 0x0900; c <= 0x0970; c++)
      System.out.println("c: " + c);
  }
}
