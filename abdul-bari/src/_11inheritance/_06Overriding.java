package src._11inheritance;

class Super {
  public void display() {
    System.out.println("Super class display");
  }
}

class Sub extends Super {
  @Override
  public void display() {
    System.out.println("Sub class display");
  }
}

class TV {
  public void switchON() {
    System.out.println("TV is Switched ON");
  }

  public void changeChannel() {
    System.out.println("TV Channel is Changed ");
  }

}

class SmartTV extends TV {
  @Override
  public void switchON() {
    System.out.println("Smart TV is Switched ON");
  }

  @Override
  public void changeChannel() {
    System.out.println("SmartTV Channel is Changed ");
  }

  public void browse() {
    System.out.println("Smart Tv Browsing");
  }

}

class Car {
  public void start() {
    System.out.println("Car Started");
  }

  public void accelerate() {
    System.out.println("Car is Accelerated");
  }

  public void changeGear() {
    System.out.println("Car Gear Changed");
  }

}

class LuxuryCar extends Car {
  public void changeGear() {
    System.out.println("Automatic Gear");
  }

  public void openRoof() {
    System.out.println("Sun Roof is Opened");
  }

}

public class _06Overriding {
  public static void main(String[] args) {
    Super sup = new Super();
    sup.display();

    Sub sub = new Sub();
    sub.display();

    // SmartTV is still a TV
    // But you can't access the new features in SmartTV
    TV tv = new SmartTV();
    tv.switchON();
    tv.changeChannel();

    Car car = new LuxuryCar();
    car.start();
    car.accelerate();
    car.changeGear();
    //car.openRoof();
  }
}
