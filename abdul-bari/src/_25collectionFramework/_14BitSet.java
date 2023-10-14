package src._25collectionFramework;

import java.util.BitSet;

public class _14BitSet {
  public static void main(String[] args) {
    // Create a new BitSet instance named bs1
    BitSet bs1 = new BitSet();

    // Set bits at positions 0, 2, 4, 6, and 8 to true
    bs1.set(0);
    bs1.set(2);
    bs1.set(4);
    bs1.set(6);
    bs1.set(8);

    // Check if the bit at position 1 is set and print the result
    System.out.println(bs1.get(1));

    // Create another BitSet instance named bs2
    BitSet bs2 = new BitSet();

    // Set bits at positions 0 through 8 to true
    bs2.set(0);
    bs2.set(1);
    bs2.set(2);
    bs2.set(3);
    bs2.set(4);
    bs2.set(5);
    bs2.set(6);
    bs2.set(7);
    bs2.set(8);

    // Perform bitwise AND between bs1 and bs2, storing the result in bs1
    bs1.and(bs2);

    // Flip all bits in bs1 from position 0 to the length of bs1
    bs1.flip(0, bs1.length());
    System.out.println(bs1); // Output: {0, 2, 4, 6, 8}
  }
}
