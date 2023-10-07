package src._23javaIOStreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import src.utils.AnsiColors;

public class _09FileClass {
  public static void main(String[] args) {
    File f1 = new File("abdul-bari/src/_23javaIOStreams");
    System.out.println("f1.isDirectory(): " + f1.isDirectory());

    System.out.println("\nfile_list[]:");
    String file_list[] = f1.list();
    for (String x : file_list)
      System.out.println(AnsiColors.ANSI_PURPLE + x + AnsiColors.ANSI_RESET);

    System.out.println("\nfile_list2[]:");
    File file_list2[] = f1.listFiles();
    for (File x : file_list2) {
      System.out.print(AnsiColors.ANSI_PURPLE + x.getName() + ": " + AnsiColors.ANSI_RESET);
      System.out.println(AnsiColors.ANSI_CYAN + x.getPath() + AnsiColors.ANSI_RESET);
    }

    System.out.println("\nREADONLY:");
    String pathname = "abdul-bari/src/_23javaIOStreams/file.txt";
    File f2 = new File(pathname);
    // f2.setReadOnly();
    f2.setWritable(true);
    System.out.println("f2.lastModified(): " + f2.lastModified());

    try {
      FileOutputStream fos = new FileOutputStream(pathname);
      fos.write("1234567890".getBytes());
      fos.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
