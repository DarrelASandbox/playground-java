package src._23javaIOStreams;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class _02FileInputStreamAndFileReader {
  public static void main(String[] args) {
    try {
      FileInputStream fis = new FileInputStream("abdul-bari/src/_23javaIOStreams/file.txt");
      byte b[] = new byte[fis.available()];
      fis.read(b);
      String str = new String(b);
      System.out.println(str);
      fis.close();
      System.out.println("");

      // Reading 1 byte at a time

      // By the time the `do-while` loop starts, the file has already been read completely into the `b` byte array.
      // So, the loop would always start with `x` being `-1` (end of the file).
      // As a result, the loop would only print the last byte of the file, and then exit.
      // A new FileInputStream instance would need to be created to read the second time
      FileInputStream fis2 = new FileInputStream("abdul-bari/src/_23javaIOStreams/file.txt");
      int x;

      // The `read()` method of `FileInputStream` reads one byte from the file and returns its value.
      // If the end of the file is reached, the `read()` method returns `-1`.

      // do {
      //   x = fis2.read();
      //   if (x != -1)
      //     System.out.print((char) x);
      // } while (x != -1);
      while ((x = fis2.read()) != -1)
        System.out.print((char) x);

      fis2.close();
      System.out.println("\n");

    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      FileReader fr = new FileReader("abdul-bari/src/_23javaIOStreams/file.txt");
      int x;
      while ((x = fr.read()) != -1)
        System.out.print((char) x);
      fr.close();

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}