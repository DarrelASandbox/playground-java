package src._26dateAndTimeAPI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _04Time {
  public static void main(String[] args) {

    // OffsetDateTime: Represents a date-time with an offset from UTC/Greenwich
    // It's useful for storing date-time with the offset from UTC.
    OffsetDateTime odt = OffsetDateTime.now();
    System.out.println(odt);

    // ZonedDateTime: Represents a date-time with a time zone
    // Local time zone
    ZonedDateTime zdt1 = ZonedDateTime.now();
    System.out.println(zdt1);

    // ZonedDateTime with custom ZoneId: Getting date-time for specific time zone
    // It is good for dealing with contexts where you need to consider the time zone rules like daylight saving time.
    ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    System.out.println(zdt2);

    // MonthDay: Represents only the month and day, without a year or time
    // This can be useful for events that recur every year on the same day and month, like birthdays.
    MonthDay md = MonthDay.now();
    System.out.println(md);

    // Period: Represents a period of time in years, months, and days
    // Useful for calculating durations between two `LocalDate` objects.
    // Output a date 2 years, 2 months, and 10 days from now
    Period p = Period.of(2, 2, 10);
    System.out.println(p.addTo(LocalDate.now()));

    // Instant: Represents an instantaneous point on the time-line
    // It is often used for capturing timestamps in a uniform time scale.
    // Output the current instant in UTC time
    Instant i = Instant.now();
    System.out.println(i);
  }
}
