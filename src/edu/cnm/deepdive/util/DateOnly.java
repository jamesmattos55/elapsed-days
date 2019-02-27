package edu.cnm.deepdive.util;

public class DateOnly {

  private static final int DAYS_PER_YEAR = 365;
  private static final int BASELINE_YEAR = 1970;
  private static final int[] DAYS_IN_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
  private static final int BASELINE_LEAP_DAYS = leapDaysFromZero(BASELINE_YEAR)

  public static int elapsedDays(int year, int month, int day) {
    return daysElapsedFromBaseline(year + dayOfYear())
  }

  private static boolean isLeapYear(int year) {
    return year % 4 == 0
        && (year % 100 != 0 || year % 400 == 0);
  }

  private static int daysInMonth(int year, int month) {
    return DAYS_IN_MONTH[month] + ((month == 1 && isLeapYear(year)) ? 1 : 0);
  }

  private static int leapDaysFromZero(int year) {
    return 1
        + Math.floorDiv(year - 1, 4)
        - Math.floorDiv(year - 1, 100)
        + Math.floorDiv(year - 1, 400);
  }

  private static int leapDaysFromBaseline(int year) {
    return leapDaysFromZero(year) - BASELINE_LEAP_DAYS;
  }

  private static int daysElapsedFromBaseline(int year) {
    return DAYS_PER_YEAR * (year - BASELINE_YEAR) + leapDaysFromBaseline(year);
  }

  private static int dayOfYear(int year, int month, int day) {
    int count = 0;
    for (int )
  }
}
