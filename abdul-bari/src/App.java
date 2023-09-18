package src;

import src._16package._01SuperClass;

public class App {
    public static void main(String[] args) throws Exception {
        _01SuperClass sc1 = new _01SuperClass();
        sc1.display();

        // The field _01PackageForApp.a, b & c is not visible
        System.out.println(sc1.d);
    }
}
