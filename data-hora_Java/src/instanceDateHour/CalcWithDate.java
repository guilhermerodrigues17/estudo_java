package instanceDateHour;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalcWithDate {
    public static void main(String[] args) {
        //calculos com data-hora
        LocalDate dt4 = LocalDate.parse("2024-07-12");
        LocalDateTime dt5 = LocalDateTime.parse("2024-07-12T16:50:34");
        Instant dt6 = Instant.parse("2024-07-12T16:51:00Z");

        LocalDate pastWeekLocalDate = dt4.minusDays(7);
        LocalDate nextWeekLocalDate = dt4.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = dt5.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = dt5.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = dt6.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = dt6.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), dt4.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, dt5);
        Duration t3 = Duration.between(pastWeekInstant, dt6);
        Duration t4 = Duration.between(dt6, pastWeekInstant);

        System.out.println("Comparando duration");
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());

    }
}
