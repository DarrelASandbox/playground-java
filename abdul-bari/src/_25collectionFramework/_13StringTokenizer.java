package src._25collectionFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import src.utils.AnsiColors;

public class _13StringTokenizer {
  public static void main(String[] args) {
    // Initialize data strings with key-value pairs
    String data1 = "name=Jay;address=delhi;country=india;dept=cse";
    StringTokenizer stk1 = new StringTokenizer(data1, "=;");

    String data2 = "name=Jay\naddress=delhi\ncountry=india\ndept=cse";
    StringTokenizer stk2 = new StringTokenizer(data2, "=;");

    String data3 = "name=Jay address=delhi country=india dept=cse";
    StringTokenizer stk3 = new StringTokenizer(data3, "= ");

    // Declare variables to hold tokens
    String s1, s2, s3, s4, s5;

    // Process and print tokens from data1
    AnsiColors.println("data1");
    while (stk1.hasMoreTokens()) {
      s1 = stk1.nextToken();
      System.out.println(s1);
    }

    // Process and print tokens from data2
    AnsiColors.println("\ndata2");
    while (stk2.hasMoreTokens()) {
      s2 = stk2.nextToken();
      System.out.println(s2);
    }

    // Process and print tokens from data3
    AnsiColors.println("\ndata3");
    while (stk3.hasMoreTokens()) {
      s3 = stk3.nextToken();
      System.out.println(s3);
    }

    String baseURL = "abdul-bari/src/_25collectionFramework";

    // Use try-with-resources to manage file streams
    try (
        FileInputStream fis1 = new FileInputStream(baseURL + "/text2.txt");
        FileInputStream fis2 = new FileInputStream(baseURL + "/text3.txt")) {

      // Read and tokenize data from the first file
      byte b1[] = new byte[fis1.available()];
      fis1.read(b1);
      String data4 = new String(b1);
      StringTokenizer stk4 = new StringTokenizer(data4, "=");

      AnsiColors.println("\ndata4");
      while (stk4.hasMoreTokens()) {
        s4 = stk4.nextToken();
        System.out.println(s4);
      }

      // Read and tokenize data from the second file, storing integers in an ArrayList
      byte b2[] = new byte[fis2.available()];
      fis2.read(b2);
      String data5 = new String(b2);
      StringTokenizer stk5 = new StringTokenizer(data5, ",");
      ArrayList<Integer> al = new ArrayList<>();

      AnsiColors.println("\ndata5");
      while (stk5.hasMoreTokens()) {
        s5 = stk5.nextToken();
        al.add(Integer.valueOf(s5));
      }
      System.out.println(al);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
