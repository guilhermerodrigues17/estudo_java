package instanceDateHour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormattingDate {
    public static void main(String[] args) {
        //formatando data-hora para texto customizado
        LocalDate dt4 = LocalDate.parse("2024-07-12");
        LocalDateTime dt5 = LocalDateTime.parse("2024-07-12T16:50:34");
        Instant dt6 = Instant.parse("2024-07-12T16:51:00Z");

        System.out.println();
        System.out.println("Formatação de data-hora para texto custom");

        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("dt4: " + dt4.format(fmt4));
        System.out.println("dt5: " + dt5.format(fmt6));
        System.out.println("dt6: " + fmt5.format(dt6));
        System.out.println("dt6: " + fmt7.format(dt6));
    }
}
