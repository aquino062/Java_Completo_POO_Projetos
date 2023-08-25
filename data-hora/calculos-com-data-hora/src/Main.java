import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekD04 = d04.minusDays(7);
        LocalDate nextWeekD04 = d04.plusDays(7);

        LocalDateTime pastWeekLocalDateTime = d05.plusDays(7);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastweek " + pastWeekD04);
        System.out.println("nextweek " + nextWeekD04);

        System.out.println("pastWeekInstant " + pastWeekInstant);
        System.out.println("nextWeekInstant " + nextWeekInstant);

        Duration t1 = Duration.between(d05, pastWeekLocalDateTime);
        Duration t2 = Duration.between(pastWeekD04.atStartOfDay(), d04.atStartOfDay());

        Duration t3 = Duration.between(pastWeekInstant,d06);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
    }
}