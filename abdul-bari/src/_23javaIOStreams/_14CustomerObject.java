package src._23javaIOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

import src.utils.AnsiColors;

// In Java, the `java.io.NotSerializableException` is thrown when the Java serialization mechanism encounters an object that cannot be serialized, but a serialization operation was attempted on it. 
class Customer6 implements Serializable {
  String customerId;
  String name;
  String phoneNo;

  static int count = 0;

  public Customer6() {
  }

  public Customer6(String name, String phoneNo) {
    count++;
    this.customerId = "C" + count;
    this.name = name;
    this.phoneNo = phoneNo;
  }

  public String toString() {
    return AnsiColors.ANSI_PURPLE + "\nCustomer Details: " + AnsiColors.ANSI_RESET +
        "\nCustomer ID: " + customerId +
        "\nName: " + name +
        "\nHP: " + phoneNo + "\n";
  }
}

public class _14CustomerObject {
  public static void main(String[] args) {
    String filePath = "abdul-bari/src/_23javaIOStreams/Customers.txt";
    Customer6 list[] = {
        new Customer6("John", "(770) 888-2098"),
        new Customer6("Mary", "(617) 323-5845"),
        new Customer6("Tom", "(803) 691-8431")
    };

    // Use try-with-resources for cleaner and more reliable stream management.
    // This ensures that streams get closed even if an exception is thrown.
    try (FileOutputStream fos = new FileOutputStream(filePath);
        ObjectOutputStream oos = new ObjectOutputStream(fos)) {

      oos.writeInt(list.length);
      for (Customer6 c : list)
        oos.writeObject(c);

    } catch (IOException e) {
      e.printStackTrace();
    }

    try (Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream(filePath);
        ObjectInputStream ois = new ObjectInputStream(fis)) {

      int listLength = ois.readInt();
      Customer6[] objectList = new Customer6[listLength];
      for (int i = 0; i < listLength; i++)
        objectList[i] = (Customer6) ois.readObject();

      System.out.println("Enter the customer's name:");
      String cn = sc.nextLine();

      boolean customerFound = false;

      for (int i = 0; i < listLength; i++)
        if (cn.equalsIgnoreCase(objectList[i].name)) {
          System.out.println(objectList[i]);
          customerFound = true;
          break;
        }

      if (!customerFound)
        System.out.println("Not found!");

    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
