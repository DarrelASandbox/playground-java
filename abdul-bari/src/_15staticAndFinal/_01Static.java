package src._15staticAndFinal;

class StaticMembers {
  static int x = 10;
  int y = 20;

  void show() {
    System.out.println(x + " " + y);
  }

  static void display() {
    // Cannot make a static reference to the non-static field y
    // System.out.println(x + " " + y);

    System.out.println(x);
  }
}

class StaticBlock {
  static {
    System.out.println("Block 1");
  }

  static {
    System.out.println("Block 2");
  }
}

class FinalKeyword {
  final float PI;
  {
    PI = 3.14255f;
  }

  static final int x;
  static {
    x = 10;
  }
}

public class _01Static {
  public static void main(String[] args) {
    callStaticMembers();
    callStaticBlock();
    callFinalKeyword();
  }

  /*     
  Each instance of the `StaticMembers` class gets its own copy of the non-static variable `y`. These are entirely separate from one another and can hold different values.
  
  When you create `sm1` and `sm2`, both are separate instances of the `StaticMembers` class, and each has its own `y` variable.
  
  1. `sm1.y` starts with a value of 20, then is set to 50.
  2. `sm2.y` starts with a value of 20 and is not modified.
  
  On the other hand, the static variable `x` is shared across all instances (`sm1` and `sm2` in this case) because it is a class-level variable. So when you modify `StaticMembers.x`, the change is reflected across all instances. 
  */
  static void callStaticMembers() {
    System.out.println("callStaticMembers:");
    StaticMembers sm1 = new StaticMembers();
    sm1.show();

    // The static field StaticMembers.x should be accessed in a static way
    // sm1.x = 30;
    StaticMembers.x = 30;
    sm1.y = 50;

    StaticMembers sm2 = new StaticMembers();
    sm2.show();
  }

  static void callStaticBlock() {
    System.out.println("\ncallStaticBlock:");

    StaticBlock sb1 = new StaticBlock();
    System.out.println("Main");
  }

  static void callFinalKeyword() {
    FinalKeyword fk1 = new FinalKeyword();
  }
}
