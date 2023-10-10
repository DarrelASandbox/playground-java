package src._25collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import src.utils.AnsiColors;

public class _01ArrayListAndIterator {
  public static void main(String[] args) {
    // Initialize ArrayLists
    ArrayList<Integer> al1 = new ArrayList<>(20);
    ArrayList<Integer> al2 = new ArrayList<>(List.of(50, 60, 70, 80, 90));

    // Add elements to al1
    al1.add(10);
    al1.add(0, 5);
    al1.addAll(1, al2);
    al1.add(5, 70);

    System.out.println(al1);
    AnsiColors.println("al1.contains(50): ", al1.contains(50));
    AnsiColors.println("al1.get(5): ", al1.get(5));
    AnsiColors.println("al1.indexOf(70):", al1.indexOf(70));

    al1.set(6, 100);
    System.out.println(al1);

    // Iterate through al1 using a for loop and display each element
    AnsiColors.print("al1.get(i): ");
    for (int i = 0; i < al1.size(); i++)
      System.out.print(al1.get(i) + " ");

    // Iterate through al1 using an Iterator and display each element
    System.out.println("");
    for (Iterator<Integer> it = al1.iterator(); it.hasNext();) {
      java.lang.Integer x = it.next();
      System.out.print(x + " ");
    }

    // Iterate through al1 using forEach and lambda expression
    System.out.println("");
    al1.forEach(x -> System.out.print(x + " "));

    // Another way to iterate through al1 using an Iterator
    System.out.println("");
    Iterator<Integer> it = al1.iterator();
    while (it.hasNext()) {
      System.out.print(it.next() + " ");
    }

    // Iterate through al1 using a ListIterator
    System.out.println("");
    ListIterator<Integer> lit = al1.listIterator();
    while (lit.hasNext()) {
      System.out.print(lit.next() + " ");
    }

    // Another way to iterate through al1 using a ListIterator
    System.out.println("");
    for (ListIterator<Integer> lit2 = al1.listIterator(); lit2.hasNext();)
      System.out.print(lit2.next() + " ");

    // Iterate through al1 using method reference
    System.out.println("");
    al1.forEach(System.out::print);

    // Iterate through al1 and apply a condition using the show method
    System.out.println("");
    al1.forEach(n -> show(n));
  }

  public static void show(int n) {
    if (n > 60)
      System.out.print(n + " ");
  }
}
