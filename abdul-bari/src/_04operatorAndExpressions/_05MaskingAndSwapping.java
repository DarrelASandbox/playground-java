package src._04operatorAndExpressions;

public class _05MaskingAndSwapping {

  public static void main(String[] args) {
    // Swapping 2 numbers
    int a = 10, b = 15;
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    System.out.println(a + " " + b); // 15 10

    // Store 2 numbers in a single byte
    byte a1 = 9, b1 = 12;
    byte c1;
    // Type cast as byte from int
    // error: incompatible types: possible lossy conversion from int to byte
    // if there is no bracket
    c1 = (byte) (a1 << 4);
    c1 = (byte) (c1 | b1);
    // Use bitwise masking to read the numbers
    // Perform right shifting
    System.out.println((c1 & 0b11110000) >> 4); // 9
    // There is no need to shift because the ZEROs are the least significant bits 
    System.out.println((c1 & 0b00001111)); // 12
  }
}
