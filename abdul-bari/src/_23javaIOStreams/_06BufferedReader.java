package src._23javaIOStreams;

import java.io.BufferedReader;
import java.io.FileReader;

public class _06BufferedReader {
  public static void main(String[] args) throws Exception {
    // Using input of `1234567890`
    FileReader fr = new FileReader("abdul-bari/src/_23javaIOStreams/file.txt");
    BufferedReader br = new BufferedReader(fr);

    System.out.println("File: " + fr.markSupported());
    System.out.println("Buffered: " + br.markSupported() + "\n");

    // Demonstrate that `BufferedReader` is holding the data
    // Each char is 2 bytes (or 16 bits) in size
    System.out.print((char) br.read());
    System.out.print((char) br.read());
    System.out.println((char) br.read());
    br.mark(4);
    System.out.print((char) br.read());
    br.reset();
    System.out.println((char) br.read());
    System.out.print((char) br.read());
    System.out.print((char) br.read());

    System.out.println("\nString: " + br.readLine());

    br.close();
  }
}
