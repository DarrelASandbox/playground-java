package src._10oop;

class Cylinder {
  private int radius;
  private int height;

  public Cylinder() {
    radius = height = 1;
  }

  public Cylinder(int r, int h) {
    radius = r;
    height = h;
  }

  public int getHeight() {
    return height;
  }

  public int getRadius() {
    return radius;
  }

  public void setHeight(int h) {
    if (h >= 0)
      height = h;
    else
      height = 0;
  }

  public void setRadius(int r) {
    if (r >= 0)
      radius = r;
    else
      radius = 0;
  }

  public void setDimensions(int h, int r) {
    height = h;
    radius = r;
  }

  public double lidArea() {
    return Math.PI * radius * radius;
  }

  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  public double drumArea() {
    return 2 * lidArea() + perimeter() * height;
  }

  public double volume() {
    return lidArea() * height;
  }
}

public class _03Cylinder {
  public static void main(String args[]) {
    Cylinder c1 = new Cylinder();
    c1.setHeight(10);
    c1.setRadius(7);
    c1.setDimensions(10, 7);

    System.out.println("LidArea " + c1.lidArea());
    System.out.println("Circumference " + c1.perimeter());
    System.out.println("totalSurfaceArea " + c1.drumArea());
    System.out.println("Volume " + c1.volume());
    System.out.println("Height" + c1.getHeight());
    System.out.println("Radius" + c1.getRadius());
  }
}
