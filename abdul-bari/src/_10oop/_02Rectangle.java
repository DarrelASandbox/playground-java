package src._10oop;

class Rectangle {
  private double length;
  private double breath;

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    if (length > 0)
      this.length = length;
  }

  public double getBreath() {
    return breath;
  }

  public void setBreath(double breath) {
    if (breath > 0)
      this.breath = breath;
  }

  public double area() {
    return length * breath;
  }

  public double perimeter() {
    return 2 * (length + breath);
  }

  public boolean isSquare() {
    if (length == breath)
      return true;
    else
      return false;
  }
}

public class _02Rectangle {
  public static void main(String args[]) {
    Rectangle r1 = new Rectangle();
    r1.setLength(10);
    r1.setBreath(5);

    System.out.println("Area: " + r1.area());
    System.out.println("Perimeter: " + r1.perimeter());
    System.out.println("isSquare: " + r1.isSquare());

    Rectangle r2 = new Rectangle();
    r2.setLength(7);
    r2.setBreath(7);

    System.out.println("\nArea: " + r2.area());
    System.out.println("Perimeter: " + r2.perimeter());
    System.out.println("isSquare: " + r2.isSquare());
  }
}
