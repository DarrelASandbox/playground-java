package src._20javaLangPkg;

public class _02MoreOnWrapperClasses {

  public static void main(String[] args) {
    /* 
     * 
     * Integer Class
     * 
     */

    int i1 = 15;

    Integer i2 = i1;
    Integer i3 = 15;

    Integer i4 = Integer.valueOf("123");
    Integer i5 = Integer.valueOf("11111111", 2);
    Integer i6 = Integer.valueOf("A7", 16);
    Integer i7 = Integer.decode("0xA7");

    System.out.println(i2.equals(i1)); // true
    System.out.println(i2.equals(i3)); // true
    System.out.println(i3 + " " + i4 + " " + i5 + " " + i6 + " " + i7); // 15 123 255 167 167

    System.out.println(Integer.parseInt("123")); // 123
    System.out.println(Integer.reverseBytes(128) == Integer.MIN_VALUE); // true
    System.out.println(Integer.toBinaryString(40)); // 101000

    /* 
     * 
     * Float Class
     * 
     */

    float f1 = 12.5f;
    Float f2 = 12.5f;
    Float f3 = 12.5f / 0;
    Float f4 = (float) Math.sqrt(-1); // Type cast to float

    System.out.println("\n" + f2.equals(f1)); // true
    System.out.println(f3.isInfinite()); // true
    System.out.println(f3 == Float.POSITIVE_INFINITY); // true
    System.out.println(f4.isNaN()); // true

    /* 
    The unique thing about `NaN` is that it's not equal to any value, including itself. The IEEE 754 floating-point standard, which Java adheres to, specifies this behavior. As a result, the expression `Float.NaN != Float.NaN` evaluates to `true`.
    
    This behavior is implemented to prevent any unintended consequences when working with undefined values. If `NaN` were equal to itself, it might lead to misleading results or difficult-to-debug issues in mathematical computations.
    
    If you ever need to check if a float is `NaN` in Java, you should use the static method `Float.isNaN(float x)`.
    */
    System.out.println(f4 != Float.NaN); // true
    System.out.println(Float.NaN != Float.NaN); // true
  }
}
