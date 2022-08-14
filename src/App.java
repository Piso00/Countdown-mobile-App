import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App{
    Event event;
    Event []  activeEvents;

    // how much time left til the event
    public int[] calculateTimeLeft(Date date, int[] time){
        // Event date
        int eventDay = date.day;
        int eventMonth = date.month;
        int eventYear = date.year;


        // current date and time values
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        int currentDay = localDate.getDayOfMonth();
        int currentMonth = localDate.getMonthValue();
        int currentYear = localDate.getYear();

        // for testing
        System.out.println("local Date  " + localDate + "\n" + "local Time  " + localTime);
        System.out.println("current date \n day:  " + currentDay + "  month: "+ currentMonth + "  year: " + currentYear);
        return null;
    }
}
