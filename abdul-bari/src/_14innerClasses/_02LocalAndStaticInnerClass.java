package src._14innerClasses;

abstract class Vague {
  abstract public void show();
}

class Outer2 {
  public void display() {
    class Inner2 {
      public void show() {
        System.out.println("Showing!");
      }
    }

    // Inner2 i = new Inner2();
    // i.show();
    new Inner2().show();
  }
}

class AnotherOuter2 {

  int x = 10;
  static int y = 20;

  static class AnotherVague {
    public void show() {
      // Cannot access non-static member of a class
      // System.out.println("\nx: " + x);
      System.out.println("y: " + y);
    }
  }

  public void display() {
    Vague v = new Vague() {
      public void show() {
        System.out.println("Also showing!");
      }
    };
    v.show();
  }
}

public class _02LocalAndStaticInnerClass {
  public static void main(String[] args) {
    Outer2 o = new Outer2();
    o.display();

    AnotherOuter2 ao = new AnotherOuter2();
    ao.display();

    AnotherOuter2.AnotherVague aov = new AnotherOuter2.AnotherVague();
    aov.show();
  }
}
