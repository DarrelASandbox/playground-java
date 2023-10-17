package src._26dateAndTimeAPI;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

import src.utils.AnsiColors;

public class _05DateTimeFormatter {
  public static void main(String[] args) {
    AnsiColors.println("\nDateTimeFormatter:");
    ZonedDateTime zdt = ZonedDateTime.now();
    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MMM-yyyy hh:mm:ss z Z");
    DateTimeFormatter dtf2 = DateTimeFormatter.BASIC_ISO_DATE;
    DateTimeFormatter dtf3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    AnsiColors.println("Custom Pattern: ", dtf1.format(zdt));
    AnsiColors.println("BASIC_ISO_DATE: ", dtf2.format(zdt));
    AnsiColors.println("ISO_LOCAL_DATE_TIME: ", dtf3.format(zdt));

    AnsiColors.println("\nChronoField:");
    LocalDateTime ldt = LocalDateTime.now();
    AnsiColors.println("DAY_OF_MONTH: ", ldt.get(ChronoField.DAY_OF_MONTH));
    AnsiColors.println("YEAR: ", ldt.get(ChronoField.YEAR));
  }
}
