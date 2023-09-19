package src._18exceptionHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class _03TryWithResources {
  static void divide() throws Exception {
    try (FileInputStream fi = new FileInputStream("abdul-bari/src/_18exceptionHandling/num.txt");
        Scanner sc = new Scanner(fi)) {
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      System.out.println(b);
      System.out.println(a / c);
    }
  }

  public static void main(String[] args) throws Exception {
    try {
      divide();
    } catch (Exception e) {
      System.out.println(e);
    }
    // int x = sc.nextInt();
    // System.out.println(x);
  }
}

/*

In Java, the try-with-resources statement is used for automatic resource management. Any object that implements the `AutoCloseable` or `java.io.Closeable` interface can be used as a resource in a try-with-resources statement. `FileInputStream` and `Scanner` are both examples of classes that implement the `AutoCloseable` interface.

When a try-with-resources statement is executed, the Java runtime ensures that the `close()` method of each resource is called automatically when the try block exits, either due to successful execution or in the event of an exception. This guarantees that all resources are properly closed, thereby reducing the risk of resource leaks.

The `FileInputStream` `fi` and `Scanner` `sc` will both be closed automatically once the try block is exited. You don't have to explicitly call `fi.close()` or `sc.close()`—Java takes care of that for you.

The typical indication that all resources are closed is the absence of any resource leak warnings or errors and the successful completion of resource-intensive operations without issue. If you were to encounter problems, they would most likely manifest as exceptions or errors, which you could then catch and handle.

For extra assurance, you could theoretically extend or wrap these classes and override their `close` methods to include logging. That way, you could log a message every time `close()` is called, confirming that the resources have indeed been closed. However, this is usually unnecessary in practice.

*/