package DateTime;

import java.time.*;  // import the LocalDate class
import java.time.format.DateTimeFormatter;

public class MainDate {
    public static void main(String[] args) {

        LocalTime myObjTime = LocalTime.now(); //Create a time Object
        LocalDate myObj = LocalDate.now();  // Create a date object
        System.out.println(myObj);  // Display the current date
        System.out.println(myObjTime); // Display the current Time

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Before formatting: " + localDateTime);

        // Other Formats E, MMM dd yyyy
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, dd-MM-yyyy HH:mm:ss");
        String fomattedDate = localDateTime.format(dateTimeFormatter);
        System.out.println("Before formatting: " + fomattedDate);
    }
}