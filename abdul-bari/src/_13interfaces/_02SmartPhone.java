package src._13interfaces;

class Phone {
  public void sms() {
    System.out.println("Phone sms");
  }

  public void call() {
    System.out.println("Phone call");
  }
}

interface ICamera {
  void capture();

  void record();
}

interface IMusicPlayer {
  void play();

  void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer {
  public void videoCall() {
    System.out.println("Smart phone video calling");
  }

  public void capture() {
    System.out.println("Smart phone captures image");
  }

  public void record() {
    System.out.println("Smart phone records video");
  }

  public void play() {
    System.out.println("Smart phone plays music");
  }

  public void stop() {
    System.out.println("Smart phone stop music");
  }
}

public class _02SmartPhone {
  public static void main(String[] args) {
    SmartPhone sp = new SmartPhone();
    sp.call();
    sp.videoCall();
    sp.capture();
  }
}
