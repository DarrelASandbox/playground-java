package src._22lambdaExpressions;

@FunctionalInterface
interface MyLittleLambda {
  public void display();
}

@FunctionalInterface
interface MyLittleLambdaWithParam {
  public void display(String s);
}

@FunctionalInterface
interface MyLittleLambdaPlus {
  public int add(int x, int y);
}

@FunctionalInterface
interface MyLittleLambdaDoubleParams {
  public int display(String str1, String str2);
}

class AnotherLambda implements MyLittleLambda {
  @Override
  public void display() {
    System.out.println("The other lambda");
  }

  int temp = 10;

  public void method1() {
    int count = 0;

    MyLittleLambda ll = () -> {
      System.out.println("My count is " + count);
      System.out.println("My temp is " + (++temp));
    };

    ll.display();

    UseLambda ul = new UseLambda();
    ul.callLambda(() -> System.out.println("Using UseLambda without additional param."));
    ul.callLambda(s -> System.out.println("Using UseLambda " + s), ("with string param."));
  }

}

class UseLambda {

  // Constructors
  public UseLambda() {
  }

  public UseLambda(String s) {
  }

  // Methods
  public void callLambda(MyLittleLambda lp) {
    lp.display();
  }

  public void callLambda(MyLittleLambdaWithParam lp, String s) {
    lp.display(s);
  }

  public void upper(String s) {
    System.out.println(s.toUpperCase());
  }

  public static void reverse(String s) {
    StringBuffer sb = new StringBuffer(s);
    sb.reverse();
    System.out.println(sb);
  }

}

public class _01LambdaDemo {
  public static void main(String[] args) {
    AnotherLambda al = new AnotherLambda();
    al.display();

    MyLittleLambda ll1 = new MyLittleLambda() {
      @Override
      public void display() {
        System.out.println("Anonymous inner class");
      }
    };
    ll1.display();

    MyLittleLambda ll2 = () -> System.out.println("Lambda expression");
    ll2.display();

    MyLittleLambdaWithParam lp = (s) -> System.out.println("Lambda expression " + s);
    lp.display("plus some string.");

    MyLittleLambdaPlus lpp1 = (a, b) -> a + b;
    System.out.println("x + y = " + lpp1.add(10, 20));

    // Capture in Lambda Expression
    al.method1();

    // Method Reference
    MyLittleLambdaWithParam ll3 = UseLambda::reverse;
    ll3.display("Friday");

    MyLittleLambdaWithParam ll4 = UseLambda::new;
    ll4.display("Sunday");

    MyLittleLambdaDoubleParams dp1 = String::compareTo;
    System.out.println(dp1.display("hello", "Hello"));
  }
}
