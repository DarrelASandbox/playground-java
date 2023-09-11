package src._11inheritance;

class Account {
  // Static variable to keep track of the last account number
  private static int lastAccountNo = 0;
  private int accountNo;
  private int pin;
  private String name;
  private String address;
  private String phoneNo;
  private String dateOfBirth;
  private double balance;

  public Account(
      int pin,
      String name,
      String address,
      String phoneNo,
      String dateOfBirth) {
    this.accountNo = ++lastAccountNo;
    this.pin = pin;
    this.name = name;
    this.address = address;
    this.phoneNo = phoneNo;
    this.dateOfBirth = dateOfBirth;
    this.balance = 0;
  }

  public int getAccountNo() {
    return accountNo;
  }

  public int getPin() {
    return pin;
  }

  public void setPin(int pin) {
    this.pin = pin;
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

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public double getBalance() {
    return balance;
  }

  protected void setBalance(double balance) {
    this.balance = balance;
  }

}

class SavingsAccount extends Account {

  public SavingsAccount(int pin, String name, String address, String phoneNo, String dateOfBirth) {
    super(pin, name, address, phoneNo, dateOfBirth);
  }

  public String deposit(double amount) {
    setBalance(getBalance() + amount);
    return "Your current balance is " + getBalance();
  }

  public String withdraw(double amount) {
    if (amount > getBalance())
      return "Insufficient funds.";
    else {
      setBalance(getBalance() - amount);
      return "Your current balance is " + getBalance();
    }
  }

}

class LoanAccount extends Account {

  public LoanAccount(int pin, String name, String address, String phoneNo, String dateOfBirth) {
    super(pin, name, address, phoneNo, dateOfBirth);
  }

  //  Equated Monthly Installment 
  public void payEMI(long amount) {
    setBalance(getBalance() - amount);
  }

  public void repay(long amount) {
    if (getBalance() == amount)
      setBalance(0);
  }
}

public class _05Account {

  public static void main(String[] args) {
    SavingsAccount sa1 = new SavingsAccount(0000, "John", "Singapore", "+6593840385", "01-01-2000");

    // The `protected` access modifier allows access within the same package and also in subclasses,
    // even if they are in different packages. 
    // However, it doesn't prevent access from other classes within the same package.
    sa1.setBalance(5555);
    System.out.println("Your current balance is " + sa1.getBalance());
  }

}
