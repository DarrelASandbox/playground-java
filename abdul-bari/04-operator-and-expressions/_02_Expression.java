import java.util.Scanner;

public class _02_Expression {
  // public static void main(String[] args) {
  // float base, height, area;
  // System.out.println("Enter base and height");

  // Scanner sc = new Scanner(System.in);
  // base = sc.nextFloat();
  // height = sc.nextFloat();
  // sc.close();

  // area = base * height / 2;

  // System.out.println("Area of a Triangle is " + area);
  // }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a, b, c;
    double s, area;

    System.out.println("Enter 3 Sides of a Triangle");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    sc.close();

    s = (a + b + c) / 2f;

    area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    System.out.println("Area of Triangle is " + area);

  }
}
