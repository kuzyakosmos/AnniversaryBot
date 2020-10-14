import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

public class AnniversaryTest {
    //todo как в мс?
    private static Anniversary anniversary;

    @Test
    public void getAnniversaryTest() {
        anniversary = new Anniversary(LocalDate.now());

        System.out.println();
        System.out.println("Прошло " + anniversary.getDaysSinceMeeting() + " дней со дня знакомства");
        System.out.println("Прошло " + anniversary.getWeeksSinceMeeting() + " дней со дня знакомства");
        System.out.println("Прошло " + anniversary.getMonthSinceMeeting() + " месяцев со дня знакомства");
        System.out.println("Прошло " + anniversary.getYearsSinceMeeting() + " года со дня знакомства");
        System.out.println();
    }

    @Test
    public void fridayTest() {
        anniversary = new Anniversary(LocalDate.of(2020, 10, 9));
        assertTrue(anniversary.isWeekAnniversary());
    }

    @Test
    public void monthTest() {
        anniversary = new Anniversary(LocalDate.of(2020, 10, 25));
        assertTrue(anniversary.isMonthAnniversary());
    }

    @Test
    public void yearTest() {
        anniversary = new Anniversary(LocalDate.of(2021, 1, 25));
        assertTrue(anniversary.isYearAnniversary());
    }
}
