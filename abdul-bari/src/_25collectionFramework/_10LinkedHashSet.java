package src._25collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

import src.utils.AnsiColors;

public class _10LinkedHashSet {
  public static void main(String[] args) {

    LinkedHashSet<String> lhs = new LinkedHashSet<>(10);
    lhs.add("A");
    lhs.add("C");
    lhs.add("E");
    lhs.add("K");
    lhs.add("B");
    lhs.add("G");
    lhs.add("B");
    AnsiColors.println("LinkedHashSet<String>:");
    lhs.forEach(System.out::println);

    HashSet<String> hs = new HashSet<>(10);
    hs.add("A");
    hs.add("C");
    hs.add("E");
    hs.add("K");
    hs.add("B");
    hs.add("G");
    hs.add("B");

    Iterator<String> itr = hs.iterator();
    AnsiColors.println("\nHashSet<String>:");
    while (itr.hasNext())
      System.out.println(itr.next());

  }
}
