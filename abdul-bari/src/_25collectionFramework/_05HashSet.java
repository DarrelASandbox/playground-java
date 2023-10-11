package src._25collectionFramework;

import java.util.HashSet;

public class _05HashSet {
  public static void main(String[] args) {
    // Create a HashSet with an initial capacity of 20 and a load factor of 0.75
    // The load factor is a measure of how full the HashSet is allowed to get before its capacity is automatically increased
    HashSet<Integer> hs = new HashSet<>(20, 0.75f);

    // Add elements to the HashSet
    // Duplicates will be ignored
    hs.add(10);
    hs.add(20);
    hs.add(30);

    // Attempt to add a duplicate element (10)
    // This will have no effect, as HashSet does not allow duplicate values
    hs.add(10);

    // Display the contents of the HashSet
    // Note: The order of elements in a HashSet is not guaranteed to be in any particular order
    System.out.println(hs); // Output: [10, 20, 30]
  }
}
