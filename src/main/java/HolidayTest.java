public class HolidayTest {

    public static void main(String[] args) {
        HolidayList holidayList = new HolidayList(10);
        holidayList.add(new Holiday("Thanksgiving",
                    Holiday.Month.NOVEMBER, 26));
        holidayList.add(new Holiday("Independence Day",
                    Holiday.Month.JULY, 4));
        holidayList.add(new Holiday("Martin Luther King Day",
                    Holiday.Month.JANUARY, 19));
        holidayList.add(new Holiday("Veterans Day",
                    Holiday.Month.NOVEMBER, 11));
        holidayList.add(new Holiday("Columbus Day",
                    Holiday.Month.OCTOBER, 12));
        holidayList.add(new Holiday("Christmas",
                    Holiday.Month.DECEMBER, 25));
        holidayList.add(new Holiday("Labor Day",
                    Holiday.Month.SEPTEMBER, 7));
        holidayList.add(new Holiday("New Year's Day",
                    Holiday.Month.JANUARY, 1));
        holidayList.add(new Holiday("Memorial Day",
                    Holiday.Month.MAY, 25));
        holidayList.add(new Holiday("Presidents' Day",
                    Holiday.Month.FEBRUARY, 16));

        holidayList.sortByName();
        System.out.println("If you want to test the code, edit the "
            + " HolidayTest.java file after you make HolidayList implement "
            + " Iterable and uncomment the indicated lines");

        //holidayList.forEach(System.out::println);
        System.out.println();
        holidayList.sortByMonth();
        //holidayList.forEach(System.out::println);
    }
}
