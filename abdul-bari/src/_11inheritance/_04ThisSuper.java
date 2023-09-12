package src._11inheritance;

class Rectangle2 {
  int length;
  int breadth;
  int x = 10;

  Rectangle2(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
  }

}

class Cuboid2 extends Rectangle2 {
  int height;
  int x = 20;

  Cuboid2(int l, int b, int h) {
    super(l, b);
    height = h;
  }

  void display() {
    System.out.println(super.x);
    System.out.println(x);
  }
}

public class _04ThisSuper {
  public static void main(String[] args) {
    Cuboid2 c = new Cuboid2(10, 5, 15);
    c.display();
  }
}
