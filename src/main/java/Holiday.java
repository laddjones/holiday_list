
public class Holiday implements Comparable<Holiday> {

    public enum Month {
        JANUARY, FEBRUARY, MARCH,
        APRIL, MAY, JUNE,
        JULY, AUGUST, SEPTEMBER,
        OCTOBER, NOVEMBER, DECEMBER
    }

    private String name;
    private Month month;
    private int day; // day of the month (e.g., 1-31)

    public Holiday(String name, Month month, int day) {
        this.name = name;
        this.month = month;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public Month getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %d", name, month, day);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Holiday) {
            return this.name.equals(((Holiday) o).name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }

    public int compareTo(Holiday holiday) {
        return this.getName().compareTo(holiday.getName());
    }
}
