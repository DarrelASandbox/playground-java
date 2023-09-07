package src._10oop;

class Circle {
  private double radius;

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    if (radius > 0)
      this.radius = radius;
  }

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

public class _01Circle {

  public static void main(String args[]) {
    // Using class to create an object
    Circle c1 = new Circle();
    c1.setRadius(7);
    System.out.println("Area: " + c1.area());
    System.out.println("Parameter: " + c1.perimeter());
    System.out.println("Circumference: " + c1.circumference());
  }

}
