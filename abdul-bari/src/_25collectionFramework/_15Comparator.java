package src._25collectionFramework;

import java.util.Arrays;
import java.util.Comparator;

// Class implementing the Comparator interface to define a custom comparison logic
class MyComparator2 implements Comparator<Integer> {
  @Override
  public int compare(Integer i1, Integer i2) {
    if (i1 < i2)
      return 1;
    if (i1 > i2)
      return -1;
    return 0;
  }
}

public class _15Comparator {
  public static void main(String[] args) {
    int a1[] = { 2, 4, 6, 8, 1, 3, 5, 7 };
    int b1[] = { 1, 4, 6, 8, 1, 3, 5, 7 };

    // Compare the two arrays lexicographically and print the result
    System.out.println(Arrays.compare(a1, b1)); // Output: 1

    // Create a new array `a2` by copying the first 4 elements of `a1`
    int a2[] = Arrays.copyOf(a1, 4);
    for (int i : a2)
      System.out.print(i + " "); // Output: 2 4 6 8 

    System.out.println();
    Arrays.fill(a2, 0);
    for (int i : a2)
      System.out.print(i + " "); // Output: 0 0 0 0 

    System.out.println();
    int a3[] = Arrays.copyOf(a1, a1.length);
    Arrays.sort(a3); // Sort the array `a3` in ascending order
    for (int i : a3)
      System.out.print(i + " "); // Output: 1 2 3 4 5 6 7 8 

    // Search for the index of element `2` in the sorted array `a3` and print it
    System.out.println("\n" + Arrays.binarySearch(a3, 2));

    // Box the elements of `a1` into an Integer array `a4`
    Integer a4[] = Arrays.stream(a1).boxed().toArray(Integer[]::new);
    // Sort the array `a4` in descending order using custom comparator
    Arrays.sort(a4, new MyComparator2());
    for (int i : a4)
      System.out.print(i + " "); // Output: 8 7 6 5 4 3 2 1 
  }
}
