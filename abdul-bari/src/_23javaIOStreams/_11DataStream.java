package src._23javaIOStreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class Student6 {
  int enrollmentNo;
  String name;
  float avg;
  String dept;
}

class _11DataStream {
  public static void main(String[] args) {
    try {
      FileOutputStream fos = new FileOutputStream("abdul-bari/src/_23javaIOStreams/Student2.txt");
      DataOutputStream dos = new DataOutputStream(fos);

      Student6 s1 = new Student6();
      s1.enrollmentNo = 10;
      s1.name = "John";
      s1.dept = "CSE";
      s1.avg = 80.f;

      // Writing a binary file
      dos.writeInt(s1.enrollmentNo);
      dos.writeUTF(s1.name);
      dos.writeFloat(s1.avg);
      dos.writeUTF(s1.dept);

      fos.close();
      dos.close();

      FileInputStream fis = new FileInputStream("abdul-bari/src/_23javaIOStreams/Student2.txt");
      DataInputStream dis = new DataInputStream(fis);

      // Must read in the same order as it was written
      dis.readInt();
      dis.readUTF();
      dis.readFloat();
      dis.readUTF();

      System.out.println("Enrollment No: " + s1.enrollmentNo);
      System.out.println("Name: " + s1.name);
      System.out.println("Average: " + s1.avg);
      System.out.println("Dept: " + s1.dept);

      fis.close();
      dis.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}