package src._27dateAndTimeAPI;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import src.utils.AnsiColors;

public class _02CalenderAndTimeZone {

  public static void main(String[] args) {

    AnsiColors.println("Calender Class:");

    GregorianCalendar gc = new GregorianCalendar();

    AnsiColors.println("gc.isLeapYear(2020):", gc.isLeapYear(2020)); // Output: true
    AnsiColors.println("gc.get(Calendar.DAY_OF_WEEK):", gc.get(Calendar.DAY_OF_WEEK));
    AnsiColors.println("gc.get(Calendar.DAY_OF_YEAR):", gc.get(Calendar.DAY_OF_YEAR));

    AnsiColors.println("\nTimeZone Class:");

    // Set the time zone to 'America/Los_Angeles' for the GregorianCalendar instance
    gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));

    // Retrieve the TimeZone object set in the GregorianCalendar instance
    TimeZone tz = gc.getTimeZone();

    // Print the TimeZone object, which will include details like the time zone ID
    System.out.println(tz);

    // Print just the time zone ID ("America/Los_Angeles" in this case)
    System.out.println(tz.getID());
  }
}
