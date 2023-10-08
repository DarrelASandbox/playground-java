package src._23javaIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student7 implements Serializable {
  private int enrollmentNo;
  private String name;
  private float avg;
  private String dept;

  public static int Data = 0;
  public transient int t;

  public Student7() {
  };

  public Student7(int r, String n, float a, String d) {
    enrollmentNo = r;
    name = n;
    avg = a;
    dept = d;
    Data = 500; // To prove that the value will not be stored.
    t = 500; // To prove that the value will not be stored.
  }

  public String toString() {
    return "\nStudent Details:\n" +
        "\nEnrollment No: " + enrollmentNo +
        "\nName: " + name +
        "\nAverage: " + avg +
        "\nDepartment: " + dept +
        "\nData: " + Data +
        "\nTransient: " + t + "\n";
  }
}

public class _12ObjectStreamsAndSerialization {
  public static void main(String[] args) {
    String filePath = "abdul-bari/src/_23javaIOStreams/Student3.txt";

    try {
      FileOutputStream fos = new FileOutputStream(filePath);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      Student7 s1 = new Student7(10, "John", 80.f, "CSE");
      oos.writeObject(s1);

      fos.close();
      oos.close();

      FileInputStream fis = new FileInputStream(filePath);
      ObjectInputStream ois = new ObjectInputStream(fis);

      /* Type cast as Student class
      When you're working with Java's `ObjectInputStream`, the method `readObject()` returns an object of type `Object`. This is because Java's IO system is designed to be generic, and it doesn't know ahead of time what type of object you've serialized into the stream. It only knows that it's reading a serialized object, and all objects in Java ultimately inherit from the `Object` class.
      */
      Student7 s2 = (Student7) ois.readObject();
      System.out.println(s2);

      fis.close();
      ois.close();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
