package src._25collectionFramework;

import java.util.TreeSet;

// Class MyPoint implements the Comparable interface to allow comparison between MyPoint objects.
class MyPoint implements Comparable<MyPoint> {
  int x; // The x-coordinate
  int y; // The y-coordinate

  // Constructor to initialize x and y coordinates
  public MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Overriding the toString method to provide a custom string representation of the object
  public String toString() {
    return "x:" + x + " y:" + y;
  }

  // Commented out the older version of compareTo for reference
  /*
  @Override
  public int compareTo(MyPoint p) {
    if (this.x < p.x)
      return -1;
    else if (this.x > p.x)
      return 1;
    else {
      if (this.y < p.y)
        return -1;
      else if (this.y > p.y)
        return 1;
      else
        return 0;
    }
  }
  */

  // Overriding the compareTo method for comparing MyPoint objects.
  // This version is more concise and leverages integer subtraction for comparison.
  @Override
  public int compareTo(MyPoint p) {
    // If x-coordinates are not equal, return their difference
    if (this.x != p.x)
      return this.x - p.x;
    // If x-coordinates are equal, return the difference of y-coordinates
    return this.y - p.y;
  }
}

public class _07ComparableInterface {
  public static void main(String[] args) {
    // Create a TreeSet to store MyPoint objects
    TreeSet<MyPoint> ts = new TreeSet<>();

    // Add MyPoint objects to the TreeSet
    ts.add(new MyPoint(1, 1));
    ts.add(new MyPoint(5, 5));
    ts.add(new MyPoint(5, 2));

    // It should be sorted according to the compareTo method in MyPoint.
    System.out.println(ts);
  }
}
