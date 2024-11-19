package instanceDateHour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //instanciando data-hora
        System.out.println("Instanciando data-hora");

        LocalDate dt1 = LocalDate.now();
        LocalDateTime dt2 = LocalDateTime.now();
        Instant dt3 = Instant.now();

        LocalDate dt4 = LocalDate.parse("2024-07-12");
        LocalDateTime dt5 = LocalDateTime.parse("2024-07-12T16:50:34");
        Instant dt6 = Instant.parse("2024-07-12T16:51:00Z");
        Instant dt7 = Instant.parse("2024-07-12T16:51:00-03:00");

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate dt8 = LocalDate.parse("12/07/2024", fmt1);
        LocalDateTime dt9 = LocalDateTime.parse("12/07/2024 16:59", fmt2);
        LocalDate dt10 = LocalDate.of(2024, 7, 12);
        LocalDateTime dt11 = LocalDateTime.of(2024, 7, 12, 17, 2, 0);

        System.out.println("dt1: " + dt1);
        System.out.println("dt2: " + dt2);
        System.out.println("dt3: " + dt3);
        System.out.println("dt4: " + dt4);
        System.out.println("dt5: " + dt5);
        System.out.println("dt6: " + dt6);
        System.out.println("dt7: " + dt7);
        System.out.println("dt8: " + dt8);
        System.out.println("dt9: " + dt9);
        System.out.println("dt10: " + dt10);
        System.out.println("dt11: " + dt11);

    }
}
