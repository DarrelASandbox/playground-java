package src._12abstractClasses;

abstract class Hospital {
  abstract void emergency();

  abstract void appointment();

  abstract void admission();

  abstract void billing();
}

class MyHospital extends Hospital {
  @Override
  public void emergency() {
    System.out.println("MyHospital emergency");
  }

  @Override
  public void appointment() {
    System.out.println("MyHospital appointment");
  }

  @Override
  public void admission() {
    System.out.println("MyHospital admission");
  }

  @Override
  public void billing() {
    System.out.println("MyHospital billing");
  }
}

public class _02Hospital {
  public static void main(String[] args) {
    Hospital h = new MyHospital();
    h.emergency();
    h.appointment();
    h.admission();
    h.billing();
  }
}
