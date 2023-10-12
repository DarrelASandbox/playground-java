package src._25collectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import src.utils.AnsiColors;

public class _08TreeMapAndHashMap {
  public static void main(String[] args) {
    AnsiColors.println("\n\nTree Map:");

    // Initialize TreeMap with some values
    // Runtime Complexity: O(n) where n is the number of elements in the map
    TreeMap<Integer, String> tm = new TreeMap<>(
        Map.of(0, "A", 1, "B", 2, "C", 3, "D"));
    System.out.println(tm);

    // Insert new key-value pairs into TreeMap
    // Runtime Complexity: O(log n) for each put operation
    tm.put(4, "E");
    tm.put(5, "F");
    System.out.println(tm);

    // Retrieve value associated with key 5 using ceilingEntry
    // Runtime Complexity: O(log n)
    AnsiColors.println("tm.ceilingEntry(5).getValue(): ", tm.ceilingEntry(5).getValue());

    // Retrieve value associated with key 3
    // Runtime Complexity: O(log n)
    AnsiColors.println("tm.get(3): ", tm.get(3));

    // Retrieve and print the first entry in the TreeMap
    // Runtime Complexity: O(1)
    Entry<Integer, String> e = tm.firstEntry();
    System.out.println(e.getKey() + " " + e.getValue());
    System.out.println(tm);

    AnsiColors.println("\n\nHash Map:");

    // Initialize HashMap with some values
    // Runtime Complexity: O(n) where n is the number of elements in the map
    HashMap<Integer, String> hm = new HashMap<>(
        Map.of(0, "A", 1, "B", 2, "C", 3, "D"));
    System.out.println(hm);

    // Insert new key-value pairs into HashMap
    // Runtime Complexity: O(1) for each put operation, assuming good hash distribution
    hm.put(4, "E");
    hm.put(5, "F");
    System.out.println(hm);

    // Retrieve value associated with key 3
    // Runtime Complexity: O(1), assuming good hash distribution
    AnsiColors.println("hm.get(3): ", hm.get(3));
  }
}
