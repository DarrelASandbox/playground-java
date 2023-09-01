package src._07loops;

/*  j ->
 *  i   1  2  3  4  5
 *  | 1
 *  V 2
 *    3
 *    4
 *    5
 */

public class _02Patterns {
  public static void main(String[] main) {
    patterns1();
    patterns2();
    patterns3();
    patterns4();
    patterns5();
    patterns6();
    patterns7();
    patterns8();
    patterns9();
    patterns10();
    patterns11();
    patterns12();
    patterns13();
  }

  public static void patterns1() {
    System.out.println("\npatterns1");
    for (int i = 0; i <= 5; i++) {
      for (int j = 0; j <= 5; j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }

  public static void patterns2() {
    System.out.println("\npatterns2");

    for (int i = 1; i <= 5; i++) {
      for (int j = 0; j <= 5; j++) {
        System.out.print(i + " ");
      }
      System.out.println("");
    }
  }

  public static void patterns3() {
    System.out.println("\npatterns3");

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.print((i + j) + " ");
      }
      System.out.println("");
    }
  }

  public static void patterns4() {
    System.out.println("\npatterns4");

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        System.out.format("%2d ", (i * j));
      }
      System.out.println("");
    }
  }

  public static void patterns5() {
    System.out.println("\npatterns5");

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }

  public static void patterns6() {
    System.out.println("\npatterns6");

    int count = 0;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
        count++;
        System.out.print((count) + " ");
      }
      System.out.println("");
    }
  }

  public static void patterns7() {
    System.out.println("\npatterns7");

    for (int i = 5; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }

  public static void patterns8() {
    System.out.println("\npatterns8");

    int count = 0;
    for (int i = 5; i > 0; i--) {
      for (int j = 1; j <= i; j++) {
        count++;
        System.out.format("%02d ", count);
      }
      System.out.println("");
    }
  }

  public static void patterns9() {
    System.out.println("\npatterns9");

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if (j >= i) {
          System.out.print("*" + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println("");
    }
  }

  public static void patterns10() {
    System.out.println("\npatterns10");

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5; j++) {
        if ((i + j) > 5) {
          System.out.print("*" + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println("");
    }
  }

  public static void patterns11() {
    System.out.println("\npatterns11");

    int n = 10;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if ((i + j) > n) {
          System.out.print("*" + " ");
        } else {
          System.out.print("  ");
        }
      }
      for (int k = 0; k < i - 1; k++) {
        System.out.print("*" + " ");
      }

      System.out.println("");
    }
  }

  public static void patterns12() {
    System.out.println("\npatterns12");

    int n = 10;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j >= i) {
          System.out.print("*" + " ");
        } else {
          System.out.print("  ");
        }
      }
      for (int k = 0; k <= n; k++) {
        if ((i + k) < n) {
          System.out.print("*" + " ");
        } else {
          System.out.print("  ");
        }
      }

      System.out.println("");
    }
  }

  public static void patterns13() {
    System.out.println("\npatterns13");

    int n = 10;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if ((i + j) > n) {
          System.out.print("*" + " ");
        } else {
          System.out.print("  ");
        }
      }
      for (int k = 0; k < i - 1; k++) {
        System.out.print("*" + " ");
      }
      System.out.println("");
    }

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j >= i) {
          System.out.print("*" + " ");
        } else {
          System.out.print("  ");
        }
      }
      for (int k = 0; k <= n; k++) {
        if ((i + k) < n) {
          System.out.print("*" + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println("");
    }
  }

}
