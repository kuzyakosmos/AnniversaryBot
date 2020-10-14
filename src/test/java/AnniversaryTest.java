import org.junit.Before;
import org.junit.Test;

public class AnniversaryTest {
    //todo как в мс?
    private static Anniversary anniversary;

    @Before
    public void before() {
        anniversary = new Anniversary();
    }

    @Test
    public void anniversaryTest() {
        System.out.println();
        System.out.println("Прошло " + anniversary.getDaysSinceMeeting() + " дней со дня знакомства");
        System.out.println("Прошло " + anniversary.getWeeksSinceMeeting() + " дней со дня знакомства");
        System.out.println("Прошло " + anniversary.getMonthSinceMeeting() + " месяцев со дня знакомства");
        System.out.println("Прошло " + anniversary.getYearsSinceMeeting() + " года со дня знакомства");
        System.out.println();
    }
}
