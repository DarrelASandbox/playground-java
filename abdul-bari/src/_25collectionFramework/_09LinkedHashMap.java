package src._25collectionFramework;

import java.util.LinkedHashMap;
import java.util.Map;

import src.utils.AnsiColors;

public class _09LinkedHashMap {
  public static void main(String[] args) {
    // Initialize a LinkedHashMap with a capacity of 5
    LinkedHashMap<Integer, String> lhm1 = new LinkedHashMap<>(5);

    // Insert key-value pairs into the LinkedHashMap
    lhm1.put(1, "A");
    lhm1.put(2, "B");
    lhm1.put(3, "C");
    lhm1.put(4, "D");
    lhm1.put(5, "E");

    // Display the contents of the LinkedHashMap
    AnsiColors.println("lhm1:");
    lhm1.forEach((k, v) -> AnsiColors.println(k.toString() + ": ", v));

    // Access some elements to demonstrate access order
    lhm1.get(2);
    lhm1.get(5);
    lhm1.get(1);
    System.out.println();
    lhm1.forEach((k, v) -> AnsiColors.println(k.toString() + ": ", v));

    lhm1.put(6, "F");
    System.out.println();
    lhm1.forEach((k, v) -> AnsiColors.println(k.toString() + ": ", v));

    // Initialize another LinkedHashMap with custom settings
    // This LinkedHashMap will remove the eldest entry if its size exceeds 5
    LinkedHashMap<Integer, String> lhm2 = new LinkedHashMap<>(5, .75f, true) {
      protected boolean removeEldestEntry(Map.Entry<Integer, String> e) {
        return size() > 5;
      }
    };

    // Populate and manipulate the second LinkedHashMap
    lhm2.put(1, "A");
    lhm2.put(2, "B");
    lhm2.put(3, "C");
    lhm2.put(4, "D");
    lhm2.put(5, "E");
    lhm2.get(2);
    lhm2.get(5);
    lhm2.get(1);
    lhm2.put(6, "F");

    // Display the contents of the second LinkedHashMap
    AnsiColors.println("\nlhm2:");
    lhm2.forEach((k, v) -> AnsiColors.println(k.toString() + ": ", v));
  }
}
