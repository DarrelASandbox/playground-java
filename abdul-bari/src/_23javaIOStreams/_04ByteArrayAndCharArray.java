package src._23javaIOStreams;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class _04ByteArrayAndCharArray {
  public static void main(String[] args) throws Exception {
    System.out.println("\n\nByteArray:");
    byte b1[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
    ByteArrayInputStream bis = new ByteArrayInputStream(b1);

    int x1;
    while ((x1 = bis.read()) != -1)
      System.out.print((char) x1);
    bis.close();

    ByteArrayInputStream bis2 = new ByteArrayInputStream(b1);
    String s = new String(bis2.readAllBytes());
    System.out.println("\n" + s);
    System.out.println(bis.markSupported());
    bis2.close();

    ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
    bos.write('a');
    bos.write('b');
    bos.write('c');
    bos.write('d');

    byte b2[] = bos.toByteArray();
    for (byte x2 : b2)
      System.out.print((char) x2);
    bos.writeTo(new FileOutputStream("abdul-bari/src/_23javaIOStreams/source.txt"));
    bos.close();

    System.out.println("\n\nCharArrayReader:");
    char c1[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
    CharArrayReader cr = new CharArrayReader(c1);

    int x3;
    while ((x3 = cr.read()) != -1)
      System.out.print((char) x3);
    cr.close();

    System.out.println("\n\nCharArrayWriter:");
    CharArrayWriter cw = new CharArrayWriter(20);
    cw.write('d');
    cw.write('c');
    cw.write('b');
    cw.write('a');

    char c2[] = cw.toCharArray();
    for (char x4 : c2)
      System.out.print(x4);
    // `CharArrayWriter` is a character stream class, while `FileOutputStream` is a byte stream class. 
    // Use a character-based stream
    FileWriter fw = new FileWriter("abdul-bari/src/_23javaIOStreams/source2.txt");
    cw.writeTo(fw);

    // Buffering: Some Java I/O classes use buffering.
    // This means they might store data in memory and only write it to the file when the buffer fills up,
    // or when the stream is flushed or closed.
    fw.flush();

    cw.close();
  }

}