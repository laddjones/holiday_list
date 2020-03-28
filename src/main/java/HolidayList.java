import java.util.Iterator;

public class HolidayList implements Iterable<Holiday> {

    private int size;
    private final int capacity;
    private Holiday[] holidayList;

    public HolidayList(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.holidayList = new Holiday[capacity];
    }

    public void add(Holiday s) {
        if (size >= capacity) {
            throw new ArrayIndexOutOfBoundsException("List is full");
        }

        holidayList[size++] = s;
    }

    public Holiday get(int index) {
        return holidayList[index];
    }

    public boolean isEmpty() {
        return 0 == size;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < size; ++i) {
            str += holidayList[i].toString();
            str += "\n";
        }
        return str;
    }

    public void sortByName() {
        SortWrapper.sort(holidayList);
    }

    public void sortByMonth() {
        SortWrapper.sort(holidayList, (Holiday holiday1, Holiday holiday2) -> {
                return Integer.compare(holiday1.getMonth().ordinal(),
                holiday2.getMonth().ordinal());
            });
    }

    public Iterator<Holiday> iterator() {
        return new HolidayIterator();
    }

    public class HolidayIterator implements Iterator<Holiday> {
        private int cursor = 0;

        public boolean hasNext() {
            return (cursor < holidayList.length);
        }
        public Holiday next() {
            return (holidayList[cursor++]);
        }
    }

}
