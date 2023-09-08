package src._10oop;

class Product {
  private String itemNo; // e.g. A25 - 76 (No operation is required)
  private String name;
  private double price;
  private int qty;

  public Product(String itemNo, String name) {
    this.itemNo = itemNo;
    this.name = name;
    this.qty = 0;
  }

  public Product(String itemNo, String name, double price, int qty) {
    this.itemNo = itemNo;
    this.name = name;
    setPrice(price);
    setQty(qty);
  }

  public String getItemNo() {
    return itemNo;
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQty() {
    return qty;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

}

class Customer {
  private int customerId;
  private String name;
  private String address;
  private String phoneNo; // Some phone number starts with ZERO

  public Customer(int customerId, String name, String address, String phoneNo) {
    this.customerId = customerId;
    this.name = name;
    this.address = address;
    this.phoneNo = phoneNo;
  }

  public int getCustomerId() {
    return customerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhoneNo() {
    return phoneNo;
  }

  public void setPhoneNo(String phoneNo) {
    this.phoneNo = phoneNo;
  }
}

public class _05Customer {
  public static void main(String args[]) {
  }
}