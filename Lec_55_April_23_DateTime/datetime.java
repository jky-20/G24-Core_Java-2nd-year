package Lec_55_April_23_DateTime;
import java.time.*;

public class datetime {
    public static void main(String[] args) {
        
        LocalDate today = LocalDate.now();
        LocalTime currTime = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Date : " + today + " || Time : " + currTime);

        LocalDate customDate = LocalDate.of(2011, 04, 02);
        LocalTime customTime = LocalTime.of(23, 30);

        // comparing dates of time - isBefore() / isAfter()
        System.out.println(customDate.isBefore(today));
        System.out.println(currTime.isAfter(customTime));

        // getting day, month, year from LocalDate, LocalDateTime
        int day = today.getDayOfMonth();
        Month month = today.getMonth();
        int monthCount = dateTime.getMonthValue();

        // getting hour, min, second from LocalTime, LocalDateTime
        int hour = currTime.getHour();
        int min = dateTime.getMinute();
        int second = currTime.getSecond();

        // convert to LocalDate / LocalTime from LocalDateTime
        LocalDate date = dateTime.toLocalDate();
        LocalTime time = dateTime.toLocalTime();

        // Calculate previous date / time
        LocalDateTime previousDateTime = LocalDateTime.now().minusDays(12);
        previousDateTime = LocalDateTime.now().minusMonths(18);
        previousDateTime = LocalDateTime.now().minusHours(62);

        // calulate difference in dates
        Period p = Period.between(customDate, today);
        Duration hourDuration = Duration.between(customTime, dateTime);

        // ZoneDateTime
        ZonedDateTime IndianTime = ZonedDateTime.now();
        System.out.println(IndianTime);
        
        ZonedDateTime LondonTime = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(LondonTime);
    }
}
