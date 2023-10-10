package src._25collectionFramework;

import java.util.ArrayDeque;

public class _03ArrayDeque {
  public static void main(String[] args) {
    ArrayDeque<Integer> adq = new ArrayDeque<>();

    adq.offerLast(10);
    adq.offerLast(20);
    adq.offerLast(30);
    adq.offerLast(40);
    System.out.println("");
    adq.forEach(x -> System.out.print(x + " "));

    adq.offerFirst(1);
    adq.offerFirst(2);
    adq.offerFirst(3);
    adq.offerFirst(4);
    System.out.println("");
    adq.forEach(x -> System.out.print(x + " "));
  }
}
