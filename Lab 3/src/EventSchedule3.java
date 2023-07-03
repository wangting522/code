import java.time.LocalDate;

public class EventSchedule3 {
    private int year;
    private int month;
    private int day;

    public EventSchedule3() {
        this(LocalDate.now().getYear());
        System.out.println("EventSchedule() was called");
    }

    public EventSchedule3(int year) {
        this(year, LocalDate.now().getMonthValue());
        System.out.println("EventSchedule(int) was called");
    }

    public EventSchedule3(int year, int month) {
        this(year, month, LocalDate.now().getDayOfMonth());
        System.out.println("EventSchedule(int, int) was called");
    }

    public EventSchedule3(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        System.out.println("EventSchedule(int, int, int) was called");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String createReport() {
        return String.format("EventSchedule, year: %d, Month: %d, Day: %d%n", year, month, day);
    }
}
