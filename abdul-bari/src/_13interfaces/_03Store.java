package src._13interfaces;

interface Member {
  // Default to public
  void callback();
}

class Store2 {
  Member mem[] = new Member[100];
  int count = 0;

  void register(Member m) {
    mem[count++] = m;
  }

  void salesBroadcast() {
    for (int i = 0; i < count; i++)
      mem[i].callback();
  }
}

class Customer2 implements Member {
  String name;

  public Customer2(String name) {
    this.name = name;
  }

  public void callback() {
    System.out.println("RSVP to sales event: " + name);
  }

}

public class _03Store {

  public static void main(String[] args) {
    Store2 s = new Store2();
    Customer2 c1 = new Customer2("John");
    Customer2 c2 = new Customer2("Smith");
    s.register(c1);
    s.register(c2);
    s.salesBroadcast();
  }
}
