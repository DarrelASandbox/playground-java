package src._20javaLangPkg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

class MyReflect {
  private int a;
  protected int b;
  public int c;
  int d;

  public int getA() {
    return a;
  }

  public MyReflect() {
  }

  public MyReflect(int x, int y) {
  }

  public void display(String s1, String s2) {
  }

  public int show(int x, int y) {
    return 0;
  }

}

public class _06Reflect {
  public static void main(String[] args) {
    // Class is a raw type. References to generic type Class<T> should be parameterized
    // Class c = MyReflect.class;
    Class<MyReflect> c = MyReflect.class;

    Field field[] = c.getDeclaredFields();

    System.out.println("\nAll Fields:");
    for (Field f : field)
      System.out.println(f);

    // Constructor is a raw type. References to generic type Constructor<T> should be parameterized
    // Constructor con[] = c.getConstructors();
    Constructor<?>[] constructors = c.getConstructors();

    System.out.println("\nAll Constructors:");
    for (Constructor<?> constructor : constructors) {
      System.out.println(constructor);
    }

    Method meth[] = c.getMethods();

    System.out.println("\nAll Methods:");
    for (Method m : meth)
      System.out.println(m);

    Parameter param[] = meth[1].getParameters();

    System.out.println("\nAll Parameters:");
    for (Parameter p : param) {
      System.out.println(p);
    }

  }
}
