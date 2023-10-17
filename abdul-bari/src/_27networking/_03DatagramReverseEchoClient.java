package src._27networking;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import src.utils.AnsiColors;

// Class definition for the Datagram Reverse Echo Client
public class _03DatagramReverseEchoClient {
  public static void main(String[] args) {
    // Using try-with-resources to create a DatagramSocket
    try (DatagramSocket ds = new DatagramSocket(2001)) {
      // Message to be sent to the server
      String msg = "It's Friday!";

      // Creating a DatagramPacket to send the message
      DatagramPacket dp = new DatagramPacket(
          msg.getBytes(),
          msg.length(),
          InetAddress.getByName("localhost"),
          2000);

      // Sending the DatagramPacket to the server
      ds.send(dp);

      // Buffer to store the incoming data
      byte b[] = new byte[1024];

      // Creating a DatagramPacket to receive the message
      dp = new DatagramPacket(b, 1024);

      // Receiving the message from the server
      ds.receive(dp);

      // Extracting the message and printing it
      msg = new String(dp.getData()).trim();
      AnsiColors.println("From Server: ", msg);

      // Handling IOException
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

// Class definition for the Datagram Reverse Echo Server
class Server {
  public static void main(String[] args) {
    // Using try-with-resources to create a DatagramSocket
    try (DatagramSocket ds = new DatagramSocket(2000)) {

      // Buffer to store the incoming data
      byte b[] = new byte[1024];

      // Creating a DatagramPacket to receive the message
      DatagramPacket dp = new DatagramPacket(b, 1024);

      // Receiving the message from the client
      ds.receive(dp);

      // Extracting the message and printing it
      String msg = new String(dp.getData()).trim();
      AnsiColors.println("From Client: ", msg);

      // Reversing the message
      StringBuilder sb = new StringBuilder(msg);
      sb.reverse();
      msg = sb.toString();

      // Creating a DatagramPacket to send the reversed message back to the client
      dp = new DatagramPacket(
          msg.getBytes(),
          msg.length(),
          InetAddress.getByName("localhost"),
          2001);

      // Sending the reversed message back to the client
      ds.send(dp);

      // Handling IOException
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
