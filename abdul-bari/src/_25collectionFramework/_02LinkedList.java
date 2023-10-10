package src._25collectionFramework;

import java.util.LinkedList;
import java.util.List;

import src.utils.AnsiColors;

public class _02LinkedList {
  public static void main(String[] args) {
    // Initialize LinkedList
    LinkedList<Integer> al1 = new LinkedList<>();
    LinkedList<Integer> al2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

    // Add elements to al1
    al1.add(10);
    al1.add(0, 5);
    al1.addAll(1, al2);
    al1.add(5, 70);

    System.out.println(al1); // Output: [5, 50, 60, 70, 80, 70, 90, 10]
    AnsiColors.println("al1.contains(50): ", al1.contains(50)); // Output: true
    AnsiColors.println("al1.get(5): ", al1.get(5)); // Output: 70
    AnsiColors.println("al1.indexOf(70):", al1.indexOf(70)); // Output: 3 

    al1.set(6, 100);
    System.out.println(al1); // Output: [5, 50, 60, 70, 80, 70, 100, 10]

    // Iterate through al1 and apply a condition using the show method
    System.out.println("");
    al1.forEach(n -> show(n)); // Output: 70 80 70 100 

    // Methods in `LinkedList` but not in `ArrayList`
    al1.addFirst(500);
    al1.addLast(600);
    System.out.println("");
    System.out.println(al1); // Output: [500, 5, 50, 60, 70, 80, 70, 100, 10, 600]
  }

  public static void show(int n) {
    if (n > 60)
      System.out.print(n + " ");
  }
}
