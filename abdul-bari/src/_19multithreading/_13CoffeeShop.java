package src._19multithreading;

import java.util.LinkedList;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* 

- **Resource Sharing**: The `orders` list in the `CoffeeShop` class is a shared resource that both customers and baristas access.
  
- **Critical Section**: Critical sections are locked using a `Lock` for customers and synchronized block for baristas.

- **Mutual Exclusion**: We use `Lock` and `Semaphore` to ensure mutual exclusion. 

- **Locking/Mutex**: We use a `ReentrantLock` when a customer places an order to ensure that only one customer can do so at a time.

- **Semaphore**: Semaphore allows up to 3 baristas to make coffee simultaneously.

- **Race Condition**: We prevent race conditions by locking critical sections where the `orders` list is accessed or modified.

- **Inter-Thread Communication**: `wait()` and `notifyAll()` are used for baristas and customers to communicate about the state of the `orders` list.

*/

class CoffeeShop {
  private LinkedList<String> orders = new LinkedList<>();
  private Lock lock = new ReentrantLock();
  private Semaphore semaphore = new Semaphore(3); // At most 3 baristas

  public void placeOrder(String order) {
    lock.lock();
    try {
      // Critical Section: Only one customer can place an order at a time.
      orders.add(order);
      System.out.println("Order placed: " + order);
    } finally {
      lock.unlock();
    }
  }

  public void notifyBaristasOfNewOrder() {
    synchronized (orders) {
      orders.notify();
    }
  }

  public boolean hasOrders() {
    synchronized (orders) {
      return !orders.isEmpty();
    }
  }

  public void makeCoffee() {
    try {
      semaphore.acquire();
      String order = null;

      // The check and action (checking if the order list is empty and
      // removing the order) need to be atomic. 
      synchronized (orders) {
        while (orders.isEmpty()) {
          System.out.println("No orders to make. Barista is waiting.");
          orders.wait();
        }
        order = orders.removeFirst();
      }

      System.out.println("Making coffee for: " + order);
      Thread.sleep(1000);
      System.out.println("Coffee ready for: " + order);

    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    } finally {
      semaphore.release();
    }
  }
}

class Customer4 extends Thread {
  private CoffeeShop coffeeShop;
  private String order;

  public Customer4(String name, CoffeeShop coffeeShop, String order) {
    super(name);
    this.coffeeShop = coffeeShop;
    this.order = order;
  }

  public void run() {
    coffeeShop.placeOrder(order);
    coffeeShop.notifyBaristasOfNewOrder();
  }
}

class Barista extends Thread {
  private CoffeeShop coffeeShop;

  public Barista(String name, CoffeeShop coffeeShop) {
    super(name);
    this.coffeeShop = coffeeShop;
  }

  public void run() {
    while (true) {
      coffeeShop.makeCoffee();
    }
  }
}

public class _13CoffeeShop {
  public static void main(String[] args) {
    CoffeeShop coffeeShop = new CoffeeShop();
    new Barista("Barista1", coffeeShop).start();
    new Barista("Barista2", coffeeShop).start();
    new Barista("Barista3", coffeeShop).start();

    new Customer4("Customer1", coffeeShop, "Espresso").start();
    new Customer4("Customer2", coffeeShop, "Latte").start();
    new Customer4("Customer3", coffeeShop, "Cappuccino").start();
    new Customer4("Customer4", coffeeShop, "Americano").start();
    new Customer4("Customer5", coffeeShop, "Mocha").start();
  }
}
