import java.util.Scanner;

public class ReadKeyboard {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);

    // int x = sc.nextInt();
    // float x=sc.nextFloat();
    // String x = sc.nextLine();

    int y, z;
    System.out.println("Enter 2 numbers:");
    y = sc.nextInt();
    z = sc.nextInt();

    int x = y + z;
    sc.close();

    System.out.println(x);
  }
}