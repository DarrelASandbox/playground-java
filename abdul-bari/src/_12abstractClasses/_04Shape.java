package src._12abstractClasses;

abstract class Shape {
  // No properties

  abstract double perimeter();

  abstract double area();
}

class Circle4 extends Shape {
  double radius;

  @Override
  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

}

class Rectangle4 extends Shape {
  double length;
  double breadth;

  @Override
  public double perimeter() {
    return 2 * (length + breadth);
  }

  @Override
  public double area() {
    return length * breadth;
  }
}

public class _04Shape {
  public static void main(String[] args) {
    Rectangle4 r = new Rectangle4();
    r.length = 10;
    r.breadth = 5;

    // Runtime Polymorphism or Dynamic Method Dispatch
    Shape s = r;
    System.out.println(s.area());

  }
}

/* 

```java
Shape s = r;
System.out.println(s.area());
```

demonstrates a feature of object-oriented programming known as **Polymorphism**. Specifically, this is an example of **Dynamic Method Dispatch**, or **Runtime Polymorphism**.

### Polymorphism

Polymorphism allows objects to be treated as instances of their parent class rather than their actual class. The benefit is that you can write code that works on the superclass type, but it will work with any subclass type, provided they follow the expected contract (such as method names and parameters).

### Dynamic Method Dispatch

Dynamic method dispatch is a mechanism by which a call to an overridden method is resolved at runtime, rather than at compile time. In Java, this is accomplished through the use of the JVM (Java Virtual Machine).

Here's how it works in your example:

1. The `Rectangle4` class extends `Shape`, which means a `Rectangle4` object is also a `Shape`.

2. You create a new `Rectangle4` object `r` and set its `length` and `breadth`.

3. Then, you assign the `Rectangle4` object `r` to a `Shape` reference `s`. This is called **Upcasting**.

   ```java
   Shape s = r;
   ```

4. Finally, you call `s.area()`. Although `s` is a `Shape` type, it points to an instance of `Rectangle4`. Therefore, Java uses the `Rectangle4`'s `area()` method to calculate the area.

The JVM determines which `area()` method to call at runtime based on the actual object that `s` refers to, not based on the type of the reference variable (`Shape` in this case). This is Dynamic Method Dispatch.

This enables a very powerful feature in OOP, allowing code to be written against interface types (or abstract classes, in this case) that works transparently with any number of concrete implementations, without requiring the code to be aware of those implementations.

*/