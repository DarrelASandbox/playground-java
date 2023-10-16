package src._26dateAndTimeAPI;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

@SuppressWarnings("deprecation")
public class _03JodaTimeAPI {

  public static void main(String[] args) {

    // Initialize a legacy Date object and set its hours to 21
    Date d = new Date();
    d.setHours(21); // Note: This method is deprecated
    System.out.println(d); // Output: Mon Oct 16 21:21:20 SGT 2023

    // Using the new Java Time API for more robust date handling

    // Obtain the current date using the default system clock
    LocalDate d1 = LocalDate.now();

    // Obtain the current date using the system's default time-zone
    LocalDate d2 = LocalDate.now(Clock.systemDefaultZone());

    // Obtain the current date in a specific time-zone ("America/Los_Angeles")
    LocalDate d3 = LocalDate.now(ZoneId.of("America/Los_Angeles"));

    // Obtain the date corresponding to the epoch day 1 (1 day after Unix epoch)
    LocalDate d4 = LocalDate.ofEpochDay(1);

    // Parse a date string into a LocalDate object
    LocalDate d5 = LocalDate.parse("2023-01-03");

    // Add 6 months to the date; assigning to a new variable due to immutability
    LocalDate d6 = d5.plusMonths(6);

    // Output various date representations
    System.out.println(d1); // Output: 2023-10-16
    System.out.println(d2); // Output: 2023-10-16
    System.out.println(d3); // Output: 2023-10-15
    System.out.println(d4); // Output: 1970-01-02
    System.out.println(d5); // Output: 2023-01-03
    System.out.println(d6); // Output: 2023-07-03

    // Get the current local time
    LocalTime t1 = LocalTime.now();

    // Subtract 3 hours from the current time
    LocalTime t2 = t1.minusHours(3);

    // Output current time and time after subtraction
    System.out.println(t1); // Output: 09:18:41.237733
    System.out.println(t2); // Output: 06:18:41.237733

    // Get the current date-time in local time-zone
    LocalDateTime dt1 = LocalDateTime.now();

    // Output the current local date-time
    System.out.println(dt1); // Output: 2023-10-16T09:22:02.743564
  }
}
