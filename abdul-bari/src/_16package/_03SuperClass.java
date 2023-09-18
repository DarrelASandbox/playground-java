package src._16package;

public class _03SuperClass extends _01SuperClass {
  _01SuperClass sc1 = new _01SuperClass();

  public void show() {
    // The field _01SuperClass.b is not visible
    System.out.println(sc1.a + sc1.c + sc1.d);
  }
}
