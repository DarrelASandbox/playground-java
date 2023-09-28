package src._19multithreading;

class ATM {
  public static void checkBalance(String name) {
    System.out.println(name + " is checking balance.");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("An error occurred while checking balance: " + e.getMessage());
    }
    System.out.println(name + "'s balance is available.");
  }

  public synchronized void withdraw(String name, int amount) {
    System.out.println(name + " is withdrawing.");
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("An error occurred while withdrawing: " + e.getMessage());
    }
    System.out.println(name + " has withdrawn " + amount);
  }
}

class Customer3 extends Thread {
  ATM atm;
  String name;
  int amount;

  Customer3(String name, ATM atm, int amount) {
    this.name = name;
    this.atm = atm;
    this.amount = amount;
    start();
  }

  public void run() {
    ATM.checkBalance(name);
    atm.withdraw(name, amount);
  }
}

public class _10ATMExample {
  public static void main(String[] args) {
    ATM atm = new ATM();
    new Customer3("Smith", atm, 100);
    new Customer3("Joh", atm, 200);
  }
}