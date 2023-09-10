package src._11inheritance;

import src.utils.AnsiColors;

class Parent {
  public Parent() {
    System.out.println(AnsiColors.ANSI_PURPLE + "\nObject: " + this + AnsiColors.ANSI_RESET);
    System.out.println("Non-parameterized Parent Constructor");
  }

  public Parent(int x) {
    x = 50;
    System.out.println(AnsiColors.ANSI_PURPLE + "\nObject: " + this + AnsiColors.ANSI_RESET);
    System.out.println("Parameterized Parent Constructor: x = " + x);
  }

  public Parent(String str1) {
    str1 = "Initial String Value";
    System.out.println(AnsiColors.ANSI_PURPLE + "\nObject: " + this + AnsiColors.ANSI_RESET);
    System.out.println("Parameterized Parent Constructor: str1 = " + str1);
  }
}

class Child extends Parent {
  public Child() {
    System.out.println(AnsiColors.ANSI_PURPLE + "\nObject: " + this + AnsiColors.ANSI_RESET);
    System.out.println("Non-parameterized Child Constructor");
  }

  public Child(int x) {
    System.out.println(AnsiColors.ANSI_PURPLE + "\nObject: " + this + AnsiColors.ANSI_RESET);
    System.out.println("Parameterized Child Constructor: " + x);
  }

  public Child(int x, int y) {
    super(x);
    System.out.println(AnsiColors.ANSI_PURPLE + "\nObject: " + this + AnsiColors.ANSI_RESET);
    System.out.println("Parameterized Child Constructor: x = " + x + " & y = " + y);
  }

  public Child(String str1) {
    super(str1);
    str1 = "String value from Child class";
    System.out.println(AnsiColors.ANSI_PURPLE + "\nObject: " + this + AnsiColors.ANSI_RESET);
    System.out.println("Parameterized Child Constructor: str1 = " + str1);
  }
}

class Grandchild extends Child {
  public Grandchild() {
    System.out.println(AnsiColors.ANSI_PURPLE + "\nObject: " + this + AnsiColors.ANSI_RESET);
    System.out.println("Non-parameterized Grandchild Constructor");
  }

  public Grandchild(int x) {
    System.out.println(AnsiColors.ANSI_PURPLE + "\nObject: " + this + AnsiColors.ANSI_RESET);
    System.out.println("Parameterized Grandchild Constructor: x = " + x);
  }
}

public class _02InheritConstruct {
  public static void main(String[] args) {
    // Parent class will execute first before Child class
    // Child class will execute first before Grandchild class
    Grandchild gc1 = new Grandchild();
    System.out.println(AnsiColors.ANSI_CYAN + "\nNon-parameterized Constructor: gc1" + AnsiColors.ANSI_RESET);
    System.out.println(gc1 + "\n\n");

    Grandchild gc2 = new Grandchild(10);
    System.out.println(AnsiColors.ANSI_CYAN + "\nParameterized Constructor: gc2" + AnsiColors.ANSI_RESET);
    System.out.println(gc2 + "\n\n");

    // In your `Parent` class's parameterized constructor,
    // you're setting `x = 50;` immediately after the constructor is called.
    // This doesn't affect the `Child` class because Java passes primitive types like `int` by value,
    // but it does make the assignment somewhat pointless within the `Parent` constructor itself.
    Child c1 = new Child(20, 30);
    System.out.println(AnsiColors.ANSI_CYAN + "\nParameterized Constructor: c1" + AnsiColors.ANSI_RESET);
    System.out.println(c1 + "\n\n");

    Child c2 = new Child("Pass some str to method.");
    System.out.println(AnsiColors.ANSI_CYAN + "\nParameterized Constructor: c2" + AnsiColors.ANSI_RESET);
    System.out.println(c2 + "\n\n");
  }
}
