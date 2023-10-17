package src._27networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import src.utils.AnsiColors;

// Extend the Thread class to handle each client in a separate thread
public class _02MultiThreadedReverseEchoServer extends Thread {

  // Socket object to interact with the client
  Socket stk;

  // Constructor to initialize socket object
  public _02MultiThreadedReverseEchoServer(Socket st) {
    stk = st;
  }

  // Override run() method to define thread behavior
  @Override
  public void run() {
    // Create BufferedReader and PrintStream to read from and write to the client
    try (
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps = new PrintStream(stk.getOutputStream())) {
      String msg;
      StringBuilder sb;

      // Loop to handle each client message
      do {
        msg = br.readLine(); // Read client message

        // Check for null (client may have disconnected)
        if (msg == null) {
          break;
        }

        sb = new StringBuilder(msg);
        sb.reverse();
        msg = sb.toString();

        ps.println(msg); // Send reversed message back to client
      } while (!"dne".equals(msg));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  // Main method to start the server
  public static void main(String[] args) {
    // Initialize ServerSocket to listen on port 2000
    try (ServerSocket ss = new ServerSocket(2000);) {

      Socket stk;
      _02MultiThreadedReverseEchoServer re;
      int count = 0;

      // Main loop to accept and handle client connections
      do {
        stk = ss.accept(); // Accept a new client connection
        AnsiColors.println("Number of clients that are connected: ", ++count); // Update client count

        // Create and start a new thread for each client
        re = new _02MultiThreadedReverseEchoServer(stk);
        re.start();

      } while (true);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

// Client class
class Client2 {
  public static void main(String[] args) {
    // Connect to the server on localhost and port 2000
    try (
        Socket stk = new Socket("localhost", 2000);
        BufferedReader brKeyboard = new BufferedReader(new InputStreamReader(System.in)); // Read user input
        BufferedReader brServer = new BufferedReader(new InputStreamReader(stk.getInputStream())); // Read server responses
        PrintStream ps = new PrintStream(stk.getOutputStream()) // Send data to server
    ) {
      String msg;

      // Loop to interact with the server
      do {
        msg = brKeyboard.readLine(); // Read user input
        ps.println(msg); // Send to server

        msg = brServer.readLine(); // Read server response
        AnsiColors.println("From Server: ", msg); // Display server response

      } while (!"dne".equals(msg)); // Exit loop if "dne" received

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
