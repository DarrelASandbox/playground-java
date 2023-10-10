package src._25collectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

import src.utils.AnsiColors;

// Custom comparator class to sort integers in descending order
class MyComparator implements Comparator<Integer> {
  public int compare(Integer o1, Integer o2) {
    if (o1 < o2)
      return 1;
    if (o1 > o2)
      return -1;
    return 0;
  }
}

public class _04PriorityQueue {
  public static void main(String[] args) {
    // Create a priority queue with natural ordering (min-heap)
    PriorityQueue<Integer> pq1 = new PriorityQueue<>();

    pq1.add(20);
    pq1.add(10);
    pq1.add(30);
    pq1.add(5);
    pq1.add(15);
    pq1.add(3);

    AnsiColors.println("\nmin-heap:");
    pq1.forEach(x -> System.out.print(x + " ")); // Output: 3 10 5 20 15 30
    // Display the head element (smallest in this case)
    AnsiColors.println("\nHEAD: ", pq1.peek()); // Output: 3

    pq1.poll();
    AnsiColors.print("After removing the head element: ");
    pq1.forEach(x -> System.out.print(x + " ")); // Output: 5 10 30 20 15

    // Create a priority queue with custom comparator (max-heap)
    PriorityQueue<Integer> pq2 = new PriorityQueue<>(new MyComparator());

    pq2.add(20);
    pq2.add(10);
    pq2.add(30);
    pq2.add(5);
    pq2.add(15);
    pq2.add(3);

    AnsiColors.println("\n\nmax-heap:");
    pq2.forEach(x -> System.out.print(x + " ")); // Output: 30 15 20 5 10 3
    // Display the head element (largest in this case)
    AnsiColors.println("\nHEAD: ", pq2.peek()); // Output: 30

    pq2.poll();
    AnsiColors.print("After removing the head element: ");
    pq2.forEach(x -> System.out.print(x + " ")); // Output: 20 15 3 5 10
  }
}
