package instanceDateHour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertingGlobalToLocal {
    public static void main(String[] args) {
        //convertendo data-hora global para local
        LocalDate dt4 = LocalDate.parse("2024-07-12");
        LocalDateTime dt5 = LocalDateTime.parse("2024-07-12T16:50:34");
        Instant dt6 = Instant.parse("2024-07-12T16:51:00Z");

        System.out.println();
        System.out.println("convertendo data-hora global para local");

        LocalDate r1 = LocalDate.ofInstant(dt6, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(dt6, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(dt6, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(dt6, ZoneId.of("Portugal"));

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("dt4 dia = " + dt4.getDayOfMonth());
        System.out.println("dt4 mes = " + dt4.getMonthValue());
        System.out.println("dt4 ano = " + dt4.getYear());

        System.out.println("dt5 hora = " + dt5.getHour());
        System.out.println("dt5 minutos = " + dt5.getMinute());
        System.out.println("dt5 segundos = " + dt5.getSecond());
    }
}
