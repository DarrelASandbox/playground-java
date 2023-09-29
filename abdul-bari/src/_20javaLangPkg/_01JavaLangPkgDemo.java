package src._20javaLangPkg;

class MyObject {
  public String toString() {
    return "MyObject";
  }

  public int hashCode() {
    return 100;
  }

  public boolean equals(Object o) {
    return this.hashCode() == o.hashCode();
  }
}

class MyObject2 extends MyObject {
}

public class _01JavaLangPkgDemo {
  public static void main(String[] args) {
    // Object Class
    Object o1 = new Object();
    Object o2 = new Object();
    System.out.println(o1.equals(o2));
    System.out.println(o1.hashCode() + " != " + o2.hashCode());

    Object mo1 = new MyObject();
    System.out.println("\n" + mo1.toString());
    System.out.println(mo1.hashCode());
    System.out.println(mo1.equals(new MyObject()));

    // Wrapper Class

    // The constructor Integer(int) has been deprecated since version 9 and marked for removal
    // Integer i1 = new Integer(10); 
    Integer i2 = Integer.valueOf(10);
    Integer i3 = 10;

    Byte b1 = 15;
    // Type mismatch: cannot convert from String to Byte
    // Byte b2 = "15";
    byte b3 = 15;
    Byte b4 = Byte.valueOf(b3); // Reference to an object

    short s1 = Short.valueOf("123");

    Float f1 = 12.3f;
    Float f2 = Float.valueOf("123.5");

    Double d1 = Double.valueOf(123.456);

    // The method valueOf(char) in the type Character is not applicable for the arguments (String)
    // Character c1 = Character.valueOf("A");
    Character c1 = Character.valueOf('A');

    Boolean bl1 = Boolean.valueOf("true");

    // Autoboxing: Converts a primitive float to its corresponding Float object using the String "123.5".
    Float f3 = Float.valueOf("123.5");
    // Autounboxing: Converts the Float object back to its primitive float value.
    float f4 = f3.floatValue();
    // Regular assignment of primitive float to another primitive float.
    float f5 = f4;

    // Primitive integer value
    int i4 = 10;
    // Autoboxing: Automatically converting primitive int to Integer object
    Integer i5 = i4;
    // Autounboxing: Automatically converting Integer object back to primitive int
    int i6 = i5;

    System.out.println(i2 + " " + i3 + " " + b1
        + " " + b3 + " " + b4 + " " + s1
        + " " + f1 + " " + f2 + " " + d1
        + " " + c1 + " " + bl1 + " " + f5 + " " + i6);
  }
}
