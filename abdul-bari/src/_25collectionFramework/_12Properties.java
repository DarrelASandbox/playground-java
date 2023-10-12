package src._25collectionFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class _12Properties {
  public static void main(String[] args) {
    // Create a new Properties object
    Properties p = new Properties();

    // Set properties for the laptop
    p.setProperty("Brand", "Dell");
    p.setProperty("Processor", "i7");
    p.setProperty("OS", "Windows10");
    p.setProperty("Model", "Latitude");

    try {
      // Store properties to a text file
      p.store(new FileOutputStream("abdul-bari/src/_25collectionFramework/text.txt"), "Laptop");

      // Store properties to an XML file
      p.storeToXML(new FileOutputStream("abdul-bari/src/_25collectionFramework/text.xml"), "Laptop");

      // Load properties from the text file
      p.load(new FileInputStream("abdul-bari/src/_25collectionFramework/text.txt"));
      System.out.println(p);
      System.out.println(p.getProperty("Model"));

      // Load properties from the XML file
      p.loadFromXML(new FileInputStream("abdul-bari/src/_25collectionFramework/text.xml"));
      System.out.println(p);
      System.out.println(p.getProperty("Model"));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
