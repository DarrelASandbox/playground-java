package src._23javaIOStreams;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class Producer2 extends Thread {
  OutputStream os;

  public Producer2(OutputStream o) {
    os = o;
  }

  public void run() {
    int count = 1;
    while (true) {
      try {
        os.write(count);
        os.flush();
        System.out.println("Producer: " + count);
        System.out.flush();
        count++;
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}

class Consumer2 extends Thread {
  InputStream is;

  public Consumer2(InputStream i) {
    is = i;
  }

  public void run() {
    int x;
    while (true) {
      try {
        x = is.read();
        System.out.println("Consumer: " + x);
        System.out.flush();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}

public class _07PipedStreams {
  public static void main(String[] args) {
    PipedInputStream pis = new PipedInputStream();
    PipedOutputStream pos = new PipedOutputStream();

    try {
      pis.connect(pos);
    } catch (IOException e) {
      e.printStackTrace();
    }

    Producer2 p = new Producer2(pos);
    Consumer2 c = new Consumer2(pis);
    p.start();
    c.start();
  }
}
