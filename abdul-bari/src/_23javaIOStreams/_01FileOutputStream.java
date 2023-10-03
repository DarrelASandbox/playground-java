package src._23javaIOStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class _01FileOutputStream {
  public static void main(String[] args) {
    try {
      FileOutputStream fos = new FileOutputStream("abdul-bari/src/_23javaIOStreams/file.txt");
      String str1 = "Learning Java!";
      String str2 = "\nLearning IO Streams!";

      try {
        fos.write(str1.getBytes());

        // Writing 1 byte at a time
        byte b[] = str2.getBytes();
        for (byte x : b)
          fos.write(x);

        // Writing a part of a string
        fos.write(b, 0, 9);

        fos.close();
      } catch (UnsupportedEncodingException e) {
        e.printStackTrace();
      } catch (IOException e) {
        e.printStackTrace();
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}