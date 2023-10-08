package src._24generics;

import java.util.ArrayList;

class MyData3<T> {
  private T obj;

  public void setData(T obj) {
    this.obj = obj;
  }

  public T getData() {
    return this.obj;
  }
}

class MyArray<T> {
  // Type mismatch: cannot convert from Object[] to T[]
  // T A[] = new Object[10];
  // Using ArrayList<T> instead of arrays because Java does not allow generic type arrays
  ArrayList<T> A = new ArrayList<T>(10);

  public void append(T v) {
    A.add(v);
  }

  public void display() {
    for (T t : A) {
      System.out.println(t);
    }
    System.out.println();
  }

}

// Subclass specific to String type
class MyArray2 extends MyArray<String> {
  public void display() {
    System.out.println("Using MyArray2:");
    super.display();
  }
}

// Subclass that restricts the generic type to subclasses of Number
// This ensures operations relevant to numbers can be performed safely.
class MyArray3<T extends Number> extends MyArray<T> {
  public void display() {
    System.out.println("Using MyArray3:");
    super.display();
  }
}

public class _01Generics<T> {

  ArrayList<T> data = new ArrayList<T>();

  // Generic Method: This allows us to have a single method applicable to multiple data types.
  static <E> void show(E[] List) {
    System.out.println("\nUsing Generic Method show:");
    for (E e : List)
      System.out.print(e + " ");
  }

  // Unbounded wildcard `<?>` allows the func method to accept MyArray of any type
  static void func(MyArray<?> obj) {
    System.out.println("\nUsing Generic Method func:");
    obj.display();
  }

  public static void main(String[] args) {
    _01Generics<String> g = new _01Generics<>();
    g.data.add("zero");
    g.data.add("one");
    // g.data.add(Integer.valueOf(2)); // This will now cause a compile-time error

    String str = g.data.get(0);
    System.out.println(str);

    // Demonstrating MyData3's generic nature
    MyData3<Integer> n = new MyData3<>();
    n.setData(10);

    MyData3<String> s = new MyData3<>();
    s.setData("10");

    // Demonstrating generic array usage with Integer type
    MyArray<Integer> ma1 = new MyArray<>();
    ma1.append(1);
    ma1.append(2);
    ma1.append(3);
    ma1.display();

    // Demonstrating MyArray2
    MyArray2 ma2 = new MyArray2();
    ma2.append("One");
    ma2.append("Two");
    ma2.append("Three");
    ma2.display();

    // Demonstrating MyArray3 with Double type
    MyArray3<Double> ma3 = new MyArray3<>();
    ma3.append(1.0);
    ma3.append(2.1);
    ma3.append(3.2);
    ma3.display();

    // Demonstrating MyArray3 with Float type
    MyArray3<Float> ma4 = new MyArray3<>();
    ma4.append(1.00f);
    ma4.append(2.11f);
    ma4.append(3.22f);
    ma4.display();

    show(new String[] { "Hello", "World" });
    show(new Integer[] { 11, 22, 33, 44 });

    func(ma1);
    func(ma2);
  }
}
