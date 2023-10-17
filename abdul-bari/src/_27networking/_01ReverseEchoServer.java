package src._27networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import src.utils.AnsiColors;

// Main server class
public class _01ReverseEchoServer {
  public static void main(String[] args) {
    // Initialize ServerSocket and listen on port 2000
    try (
        ServerSocket ss = new ServerSocket(2000);
        Socket stk = ss.accept(); // Accept client connections
        BufferedReader br = new BufferedReader(new InputStreamReader(stk.getInputStream())); // Read input from client
        PrintStream ps = new PrintStream(stk.getOutputStream()) // Send output to client
    ) {
      String msg; // Store client messages
      StringBuilder sb; // To reverse the client messages

      // Main loop to handle client messages
      do {
        msg = br.readLine(); // Read a line from the client

        // Check for client disconnection
        if (msg == null) {
          break;
        }

        sb = new StringBuilder(msg); // Initialize StringBuilder with client message
        sb.reverse(); // Reverse the string
        msg = sb.toString(); // Convert StringBuilder back to string

        ps.println(msg); // Send reversed string back to client
      } while (!"dne".equals(msg)); // Continue until 'dne' is received

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

// Client class
class Client {
  public static void main(String[] args) {
    // Initialize client socket to connect to server on localhost and port 2000
    try (
        Socket stk = new Socket("localhost", 2000);
        BufferedReader brKeyboard = new BufferedReader(new InputStreamReader(System.in)); // Read input from keyboard
        BufferedReader brServer = new BufferedReader(new InputStreamReader(stk.getInputStream())); // Read server responses
        PrintStream ps = new PrintStream(stk.getOutputStream()) // Send messages to server
    ) {
      String msg; // To store user and server messages

      // Main loop to interact with server
      do {
        msg = brKeyboard.readLine(); // Read a line from the keyboard
        ps.println(msg); // Send the keyboard input to server

        msg = brServer.readLine(); // Read server's response
        AnsiColors.println("From Server: ", msg); // Print server's response

      } while (!"dne".equals(msg)); // Continue until 'dne' is received

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
