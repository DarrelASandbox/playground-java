package src._23javaIOStreams;

import java.io.IOException;
import java.io.RandomAccessFile;

public class _08RandomAccessFile {
  public static void main(String[] args) {
    try {
      RandomAccessFile raf = new RandomAccessFile("abdul-bari/src/_23javaIOStreams/file.txt", "rw");
      System.out.println((char) raf.read());
      System.out.println((char) raf.read());
      System.out.println((char) raf.read());
      raf.write('d'); // Replace '4' with 'd'
      System.out.println((char) raf.read());
      raf.skipBytes(3);
      System.out.println((char) raf.read());
      raf.seek(3);
      System.out.println((char) raf.read());
      System.out.println((char) raf.getFilePointer());
      raf.seek(raf.getFilePointer() + 2);
      System.out.println((char) raf.read());
      raf.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
