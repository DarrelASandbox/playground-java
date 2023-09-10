package src._11inheritance;

class Rectangle {
  private int length;
  private int breadth;

  Rectangle() {
    length = breadth = 1;
  }

  Rectangle(int l, int b) {
    length = l;
    breadth = b;
  }

  int area() {
    return length * breadth;
  }
}

class Cuboid extends Rectangle {
  private int height;

  Cuboid() {
    height = 1;
  }

  Cuboid(int h) {
    height = h;
  }

  Cuboid(int l, int b, int h) {
    super(l, b);
    height = h;
  }

  int volume() {
    return area() * height;
  }
}

public class _03Cuboid {
  public static void main(String[] args) {
    Cuboid c1 = new Cuboid();
    System.out.println(c1.volume());

    Cuboid c2 = new Cuboid(4);
    System.out.println(c2.volume());

    Cuboid c3 = new Cuboid(5, 3, 10);
    System.out.println(c3.volume());
  }
}