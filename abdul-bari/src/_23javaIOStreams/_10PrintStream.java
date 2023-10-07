package src._23javaIOStreams;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student5 {
  int enrollmentNo;
  String name;
  String dept;
}

public class _10PrintStream {
  public static void main(String[] args) {
    try {
      FileOutputStream fos = new FileOutputStream("abdul-bari/src/_23javaIOStreams/Student1.txt");
      PrintStream ps = new PrintStream(fos);

      Student5 s1 = new Student5();
      s1.enrollmentNo = 10;
      s1.name = "John";
      s1.dept = "CSE";

      ps.println(s1.enrollmentNo);
      ps.println(s1.name);
      ps.println(s1.dept);

      ps.close();
      fos.close();

      FileInputStream fis = new FileInputStream("abdul-bari/src/_23javaIOStreams/Student1.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(fis));

      Student5 s2 = new Student5();
      s2.enrollmentNo = Integer.parseInt(br.readLine());
      s2.name = br.readLine();
      s2.dept = br.readLine();

      System.out.println("Enrollment No: " + s2.enrollmentNo);
      System.out.println("Name: " + s2.name);
      System.out.println("Dept: " + s2.dept);

      br.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
