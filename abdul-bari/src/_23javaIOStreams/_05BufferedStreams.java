package src._23javaIOStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class _05BufferedStreams {
  public static void main(String[] args) throws Exception {
    // Using input of `1234567890`
    FileInputStream fis = new FileInputStream("abdul-bari/src/_23javaIOStreams/file.txt");
    BufferedInputStream bis = new BufferedInputStream(fis);

    System.out.println("File: " + fis.markSupported());
    System.out.println("Buffered: " + bis.markSupported() + "\n");

    // Demonstrate that `BufferedInputStream` is holding the data
    // Each char is 2 bytes (or 16 bits) in size
    System.out.print((char) bis.read());
    System.out.print((char) bis.read());
    System.out.println((char) bis.read());
    bis.mark(4);
    System.out.print((char) bis.read());
    bis.reset();
    System.out.println((char) bis.read());
    System.out.print((char) bis.read());
    System.out.print((char) bis.read());

    bis.close();
  }
}
