import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneDisplay {
    public static void main(String[] args) {
        // Define the time zones
        ZoneId gmtZone = ZoneId.of("GMT");
        ZoneId istZone = ZoneId.of("Asia/Kolkata");
        ZoneId pstZone = ZoneId.of("America/Los_Angeles");

        // Get the current time in each time zone
        ZonedDateTime gmtTime = ZonedDateTime.now(gmtZone);
        ZonedDateTime istTime = ZonedDateTime.now(istZone);
        ZonedDateTime pstTime = ZonedDateTime.now(pstZone);

        // Define a formatter for displaying time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        // Display the time in different time zones
        System.out.println("Current Time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current Time in IST: " + istTime.format(formatter));
        System.out.println("Current Time in PST: " + pstTime.format(formatter));
    }
}
