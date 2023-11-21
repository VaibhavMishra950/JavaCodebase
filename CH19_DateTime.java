import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CH19_DateTime {
    public static void main(String[] args){
        // Returns the number of milliseconds passed since Jan 01 1970, 00:00:00 GMT (05:30:00 IST).
        System.out.println(System.currentTimeMillis());

        // The Date Class
        Date d = new Date(); // We can also provide custom time as long milliseconds.
        System.out.println(d);
        System.out.println(d.getTime());    // Same as System.currentTimeMillis()

        // Calendar Class: An Abstract class with a static method to initialize.
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone().getID());
        System.out.println("Date: " + c.get(Calendar.DATE));
        System.out.println("Month: " + c.get(Calendar.MONTH));
        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Time: " + c.get(Calendar.HOUR) + ":" + c.get(Calendar.MINUTE)
                + ":" + c.get(Calendar.SECOND));

        // GregorianCalendar Class: A concrete class made by extending the Calendar class.
        GregorianCalendar g = new GregorianCalendar();
        System.out.println("Is 2023 a Leap Year: " + g.isLeapYear(2023));

        // LocalDate Class
        LocalDate ld = LocalDate.now();
        System.out.println("LocalDate: " + ld);

        // LocalTime Class
        LocalTime lt = LocalTime.now();
        System.out.println("LocalTime: " + lt);

        // LocalDateTime Class
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println("LocalDateTime: " + ldt);

        // DateTimeFormatter Class
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E, dd/MM/yyyy, hh:mm:ss a");
        String fDate = ldt.format(dtf);
        System.out.println("Formatted LocalDateTime: " + fDate);

    }
}
