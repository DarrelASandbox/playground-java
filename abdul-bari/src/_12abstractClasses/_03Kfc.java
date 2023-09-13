package src._12abstractClasses;

abstract class KFC {
  abstract void makeItem();

  abstract void billing();

  abstract void offer();
}

class KFCFranchise extends KFC {
  @Override
  public void makeItem() {
    System.out.println("KFCFranchise makeItem");
  };

  @Override
  public void billing() {
    System.out.println("KFCFranchise billing");
  };

  @Override
  public void offer() {
    System.out.println("KFCFranchise offer");
  };
}

public class _03Kfc {

  public static void main(String[] args) {
    KFC kfc = new KFCFranchise();
    kfc.makeItem();
    kfc.billing();
    kfc.offer();
  }
}
