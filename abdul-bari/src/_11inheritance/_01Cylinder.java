package src._11inheritance;

class Circle {
  public double radius;

  public double area() {
    return Math.PI * radius * radius;
  }

  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  public double circumference() {
    return perimeter();
  }
}

class Cylinder extends Circle {
  public double height;

  public double volume() {
    return area() * height;
  }
}

public class _01Cylinder {

  public static void main(String[] args) {
    Cylinder cy1 = new Cylinder();
    cy1.radius = 7;
    cy1.height = 10;

    System.out.println(cy1.volume());
    System.out.println(cy1.area());
  }

}