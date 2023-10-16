package src._27dateAndTimeAPI;

import java.util.Date;

// Use `@SuppressWarnings` to ignore deprecation warnings for Date class
@SuppressWarnings("deprecation")
public class _01Date {
  public static void main(String[] args) {
    // Calculate the approximate number of years that have passed since 1 Jan 1970
    // Note: This is a rough estimate, not accounting for leap years, daylight savings, etc.
    System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);

    // Display the maximum value that can be stored in a variable of type Long
    System.out.println(Long.MAX_VALUE); // Output: 9223372036854775807

    // Create a Date object to represent the current date and time
    Date d1 = new Date();
    System.out.println(d1);

    // Java 8 and above has a new `java.time` package for better date and time handling
    // Below, we still use the old Date class to create a date object for January 11, 2022
    Date d2 = new Date("1/11/2022");
    System.out.println(d2);

    // Get the date (day of the month) from the d2 object
    System.out.println(d2.getDate()); // Output: 11

    // Get the day of the week from the d2 object (Sunday is 0, Monday is 1, etc.)
    System.out.println(d2.getDay()); // Output: 2

    // Get the month from the d2 object (January is 0, February is 1, etc.)
    System.out.println(d2.getMonth()); // Output: 0

    // Get the year from the d2 object (Note: Year is offset by 1900)
    System.out.println(d2.getYear() + 1900); // Output: 2022
  }
}
