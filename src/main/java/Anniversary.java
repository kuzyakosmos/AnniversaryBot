import java.time.LocalDate;

import static java.time.DayOfWeek.FRIDAY;
import static java.time.Month.JANUARY;
import static java.time.temporal.ChronoUnit.*;

public class Anniversary {

    private final LocalDate dateOfMeeting = LocalDate.of(2019, 1, 25);
    private LocalDate now;

    public Anniversary() {
        this.now = LocalDate.now();
    }

    public Anniversary(LocalDate now) {
        this.now = now;
    }

    //Неделевщина
    public boolean isWeekAnniversary()  {
        return now.getDayOfWeek() == FRIDAY;
    }

    //Месецевщина
    public boolean isMonthAnniversary()  {
        return now.getDayOfMonth() == 25;
    }

    //Годовщина
    public boolean isYearAnniversary()  {
        return isMonthAnniversary() || now.getMonth() == JANUARY;
    }

    public LocalDate getDateOfMeeting() {
        return dateOfMeeting;
    }

    public long getDaysSinceMeeting() {
        return DAYS.between(dateOfMeeting, now);
    }

    public long getWeeksSinceMeeting() {
        return WEEKS.between(dateOfMeeting, now);
    }

    public long getMonthSinceMeeting() {
        return MONTHS.between(dateOfMeeting, now);
    }

    public long getYearsSinceMeeting() {
        return YEARS.between(dateOfMeeting, now);
    }
}