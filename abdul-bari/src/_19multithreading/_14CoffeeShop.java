package src._19multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class CoffeeShop2 {
  private BlockingQueue<String> orders = new LinkedBlockingQueue<>(10); // Capacity for orders

  public void placeOrder(String order) throws InterruptedException {
    orders.put(order); // This will block if the queue is full.
    System.out.println("Order placed: " + order);
  }

  public String getNextOrder() throws InterruptedException {
    return orders.take(); // This will block if the queue is empty.
  }
}

class Customer5 extends Thread {
  private CoffeeShop2 coffeeShop;
  private String order;

  public Customer5(String name, CoffeeShop2 coffeeShop, String order) {
    super(name);
    this.coffeeShop = coffeeShop;
    this.order = order;
  }

  public void run() {
    try {
      coffeeShop.placeOrder(order);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }
}

class Barista2 extends Thread {
  private CoffeeShop2 coffeeShop;
  private volatile boolean running = true;

  public Barista2(String name, CoffeeShop2 coffeeShop) {
    super(name);
    this.coffeeShop = coffeeShop;
  }

  public void shutdown() {
    running = false;
    this.interrupt();
  }

  public void run() {
    while (running) {
      try {
        String order = coffeeShop.getNextOrder();
        System.out.println("Making coffee for: " + order);
        Thread.sleep(1000);
        System.out.println("Coffee ready for: " + order);
      } catch (InterruptedException e) {
        Thread.currentThread().interrupt();
      }
    }
  }
}

public class _14CoffeeShop {
  public static void main(String[] args) {
    CoffeeShop2 coffeeShop = new CoffeeShop2();
    Barista2 barista1 = new Barista2("Barista1", coffeeShop);
    Barista2 barista2 = new Barista2("Barista2", coffeeShop);
    Barista2 barista3 = new Barista2("Barista3", coffeeShop);

    barista1.start();
    barista2.start();
    barista3.start();

    new Customer5("Customer1", coffeeShop, "Espresso").start();
    new Customer5("Customer2", coffeeShop, "Latte").start();
    new Customer5("Customer3", coffeeShop, "Cappuccino").start();
    new Customer5("Customer4", coffeeShop, "Americano").start();
    new Customer5("Customer5", coffeeShop, "Mocha").start();

    // To gracefully shutdown baristas after a certain period or condition
    try {
      Thread.sleep(10000); // Sleep for 10 seconds
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    barista1.shutdown();
    barista2.shutdown();
    barista3.shutdown();
  }
}
