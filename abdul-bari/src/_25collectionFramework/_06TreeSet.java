package src._25collectionFramework;

import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import src.utils.AnsiColors;

public class _06TreeSet {
  public static void main(String[] args) {
    // Create a TreeSet with initial elements. Duplicates (like 10) will be ignored.
    // TreeSet will sort the elements in natural order.
    TreeSet<Integer> ts = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));

    ts.add(25);
    System.out.println(ts); // Output: [10, 25, 30, 40, 50, 70]

    // Find the smallest element in the set greater than or equal to Integer.SIZE (32)
    // In this case, it's 40.
    AnsiColors.println("ts.ceiling(Integer.SIZE): ", ts.ceiling(Integer.SIZE)); // Output: 40

    // Find the smallest element in the set greater than or equal to 55
    // In this case, it's 70.
    AnsiColors.println("ts.ceiling(55): ", ts.ceiling(55)); // Output: 70

    // Display the hash code of the TreeSet object
    AnsiColors.println("ts.hashCode(): ", ts.hashCode()); // Output: 225

    // Create a Collection object with the same elements as the TreeSet
    // Note: The hash code will be different from TreeSet's hash code
    Collection<Integer> c = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));
    AnsiColors.println("c.hashCode(): ", c.hashCode()); // Output: 200

    // Create a SortedSet object with the same elements as the TreeSet
    // Note: The hash code will be the same as the Collection's hash code
    SortedSet<Integer> ss = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));
    AnsiColors.println("ss.hashCode(): ", ss.hashCode()); // Output: 200
  }
}

/* 
In Java, the `hashCode()` method is used to calculate a hash code for an object. The hash code is an integer value that is used for distributing the keys across the hash table in collections like `HashSet` and `HashMap`. The contract for `hashCode()` is such that if two objects are equal according to their `equals()` method, then their hash codes must also be equal.

In your code, you have three collections: a `TreeSet` named `ts`, a `Collection` named `c`, and a `SortedSet` named `ss`. All three collections contain the same elements: 10, 30, 40, 50, and 70. However, their hash codes are different for `ts` but the same for `c` and `ss`.

Here's why:

1. **TreeSet (`ts`) vs Collection (`c`) and SortedSet (`ss`)**: Even though they contain the same elements, the `TreeSet` instance may have a different hash code from the `Collection` and `SortedSet` instances because the `hashCode()` implementation can be different for different classes. The `TreeSet` class may use additional attributes or internal states in its `hashCode()` calculation that the `Collection` and `SortedSet` interfaces do not specify.

2. **Collection (`c`) vs SortedSet (`ss`)**: Both `c` and `ss` have the same hash code because they are actually instances of the same class (`TreeSet`) and contain the same elements. The `Collection` and `SortedSet` here are just interfaces that the `TreeSet` class implements. Since the underlying objects are the same and contain the same elements, their hash codes are the same.

In summary, the hash code can vary between different types of collections even if they contain the same elements, due to differences in the `hashCode()` implementation. However, if they are instances of the same class and contain the same elements, their hash codes will be the same.
*/