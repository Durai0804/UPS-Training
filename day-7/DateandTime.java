import java.time.*;
import java.time.format.*;

public class DateandTime{
    public static void main(String[] args){
        // LocalDate date = LocalDate.now();
        // LocalTime time = LocalTime.now();
        // LocalDateTime datetime = LocalDateTime.now();


        // System.out.println("Todays date : "+ date.now());

        // System.out.println("Current Time : "   + time);
        // System.out.println("Current Date and Time : " + datetime);
 
        // DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy" + " "+" HH:mm:ss");
        // System.out.println("Current Date and Time : " + LocalDateTime.now().format(format));

        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Current Date and time : " + dt);
        System.out.println("Current Year : " + dt.getYear());
        System.out.println("Current Month : " + dt.getMonth());
        System.out.println("Current Day : " + dt.getDayOfMonth());
        System.out.println("Current Hour : " + dt.getHour());
        System.out.println("Current Minute : " + dt.getMinute());
        System.out.println("Current Second : " + dt.getSecond());


    }
}