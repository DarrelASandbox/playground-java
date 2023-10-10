package src.utils;

public class AnsiColors {
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

  public static <T> void print(String str) {
    System.out.print(ANSI_PURPLE + str + ANSI_RESET);
  }

  public static <T> void println(String str) {
    System.out.println(ANSI_PURPLE + str + ANSI_RESET);
  }

  public static <T> void println(String str, T v) {
    System.out.println(ANSI_PURPLE + str + ANSI_RESET + v.toString());
  }

}