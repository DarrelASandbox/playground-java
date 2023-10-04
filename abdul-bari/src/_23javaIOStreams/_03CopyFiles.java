package src._23javaIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class _03CopyFiles {
  public static void main(String[] args) {
    try {
      FileOutputStream fosSource = new FileOutputStream("abdul-bari/src/_23javaIOStreams/source.txt");
      String s = "this\nis\nJava\n!!!";
      fosSource.write(s.getBytes());

      FileInputStream fis = new FileInputStream("abdul-bari/src/_23javaIOStreams/source.txt");
      FileOutputStream fosDest = new FileOutputStream("abdul-bari/src/_23javaIOStreams/source2.txt");

      int b;

      // Capitalize letters
      while ((b = fis.read()) != -1) {
        if (b >= 97 && b <= 122)
          b -= 32;
        fosDest.write(b);
      }

      fosSource.close();
      fis.close();
      fosDest.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

    try {
      FileInputStream fis1 = new FileInputStream("abdul-bari/src/_23javaIOStreams/source.txt");
      FileInputStream fis2 = new FileInputStream("abdul-bari/src/_23javaIOStreams/source2.txt");
      FileOutputStream fosDest = new FileOutputStream("abdul-bari/src/_23javaIOStreams/dest.txt");

      SequenceInputStream sis = new SequenceInputStream(fis1, fis2);

      int b;
      while ((b = sis.read()) != -1)
        fosDest.write(b);

      fis1.close();
      fis2.close();
      fosDest.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}