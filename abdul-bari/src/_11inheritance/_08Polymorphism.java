package src._11inheritance;

class Overloading {
  public int max(int a, int b) {
    return a > b ? a : b;
  }

  public int max(int a, int b, int c) {
    if (a > b && a > c)
      return a;
    else if (b > c)
      return b;
    return c;
  }
}

class Super3 {
  protected void display() {
    System.out.println("Super3 Display");
  }
}

class Sub3 extends Super3 {
  public void display() {
    System.out.println("Sub3  Display");
  }
}

public class _08Polymorphism {
  public static void main(String[] args) {
    // Compile time polymorphism
    // Determine at compile time which method to use
    Overloading o = new Overloading();
    o.max(10, 5);
    o.max(10, 5, 1);

    // Runtime or Dynamic polymorphism
    // Determine at runtime which method to use
    Super3 s = new Sub3();
    s.display();
  }
}