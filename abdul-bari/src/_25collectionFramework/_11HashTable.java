package src._25collectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;

// Legacy class
public class _11HashTable {
  public static void main(String[] args) {
    // Create a new Hashtable instance to store Integer keys and String values
    Hashtable<Integer, String> ht = new Hashtable<>();

    // Populate the Hashtable with key-value pairs
    ht.put(1, "A");
    ht.put(2, "B");
    ht.put(3, "C");
    ht.put(4, "D");
    ht.put(5, "E");

    // Retrieve the value associated with the key 3 and store it in variable 's'
    String s = (String) ht.get(3);
    System.out.println(s);

    // Create an Enumeration to iterate over the Hashtable elements
    Enumeration<String> e = ht.elements();
    while (e.hasMoreElements())
      System.out.print(e.nextElement() + " ");

    // Update the value associated with the key 2 by appending "Z" to it
    ht.compute(2, (k, v) -> v + "Z");
  }
}
