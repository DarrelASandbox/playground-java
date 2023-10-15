package src._25collectionFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import src.utils.AnsiColors;

// Represents a bank account with an account number, name, and balance
class Account implements Serializable {
  private String accNo;
  private String name;
  private Double balance;
  private static int count = 0;

  // Constructor to initialize account with name and unique account number
  public Account(String name) {
    this.accNo = Instant.now().getEpochSecond() + String.valueOf(count);
    this.name = name;
    this.balance = 0.0;
    count++;
  }

  // Getter and Setter methods
  public String getAccNo() {
    return accNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }

  // Output account information as a string
  @Override
  public String toString() {
    return "\nAccount Number: " + accNo + '\n' +
        "Name: " + name + '\n' +
        "Balance: " + balance;
  }
}

// Main class containing logic for bank operations
public class _16MenuDrivenAccount {
  public static void main(String[] args) {
    String accountsFile = "abdul-bari/src/_25collectionFramework/accounts.txt";
    int choice;
    String accNo = "";
    HashMap<String, Account> bank = new HashMap<>();

    // Load existing accounts from file
    try (FileInputStream fis = new FileInputStream(accountsFile)) {
      ObjectInputStream ois = new ObjectInputStream(fis);
      int count = ois.readInt();
      for (int i = 0; i < count; i++) {
        Account acc = (Account) ois.readObject();
        bank.put(acc.getAccNo(), acc);
      }
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

    // User interface for managing accounts
    try (Scanner sc = new Scanner(System.in); FileOutputStream fos = new FileOutputStream(accountsFile)) {
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      do {
        // Display menu
        AnsiColors.println("\n###################################");
        AnsiColors.println("1. Create Account");
        AnsiColors.println("2. Delete Account");
        AnsiColors.println("3. View Account");
        AnsiColors.println("4. View  All Accounts");
        AnsiColors.println("5. Save Accounts & Exit Program");
        AnsiColors.println("Enter a number between 1 to 5:");
        choice = sc.nextInt();
        sc.nextLine();

        if (choice > 5 || choice < 1)
          continue;

        // Perform actions based on user choice
        switch (choice) {
          case 1:
            System.out.println("Enter your name:");
            String n = sc.nextLine();
            Account a = new Account(n);
            bank.put(a.getAccNo(), a);
            AnsiColors.println("Account number: ", a.getAccNo());
            AnsiColors.println("Balance (SGD): ", a.getBalance());
            System.out.println("Congratulation on your new account creation!");
            break;

          case 2:
            System.out.println("Enter your account number:");
            accNo = sc.nextLine();
            if (bank.containsKey(accNo)) {
              System.out.println("Are you sure you want to delete your account (Y/N)?");
              String ans = sc.nextLine();
              if ("y".equalsIgnoreCase(ans)) {
                bank.remove(accNo);
                System.out.println("Account removed.");
              }
            } else
              System.out.println("Invalid account number");
            break;

          case 3:
            System.out.println("Enter your account number:");
            accNo = sc.nextLine();
            Account acc = bank.get(accNo);
            if (acc != null)
              System.out.println(acc.toString());
            else
              System.out.println("Account not found.");
            break;

          case 4:
            for (Map.Entry<String, Account> entry : bank.entrySet())
              System.out.println(entry.getValue().toString());
            break;

          case 5:
            oos.writeInt(bank.size());
            for (Account account : bank.values())
              oos.writeObject(account);
            System.out.println("Exiting program.");
            break;
        }
      } while (choice != 5);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
