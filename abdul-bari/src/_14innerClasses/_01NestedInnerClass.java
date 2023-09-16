package src._14innerClasses;

class Outer {
  int x = 10;
  static int z = 30;
  Inner i = new Inner();

  class Inner {
    int y = 20;

    public void innerDisplay() {
      System.out.println("innerDisplay inside Outer is accessing Outer x, z and Inner y:");
      System.out.println(x + " " + z + " " + y);
    }
  }

  public void outerDisplay() {
    Inner i = new Inner();
    i.innerDisplay();
    System.out.println("\nouterDisplay accessing Inner y:");
    System.out.println(i.y);
  }
}

public class _01NestedInnerClass {
  public static void main(String[] args) {
    Outer o = new Outer();
    System.out.println("Outer o:");
    o.outerDisplay();

    Outer.Inner oi = new Outer().new Inner();
    System.out.println("\n####################");
    System.out.println("Outer.Inner oi:");
    oi.innerDisplay();
  }
}
