// Auto imported
// import java.lang.*;

class HelloWorld {
  public static void main(String arg[]) {
    System.out.println("Hello World");
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0
    // out of bounds for length 0
    // Error: `java HelloWorld`
    // Correct: `java HelloWorld one two`
    System.out.println(arg[0]);
    System.out.println(arg[1]);
  }
}
