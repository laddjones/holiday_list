/* This class is for grading convenience
 * DO NOT modify or delete this class */

import java.util.Arrays;
import java.util.Comparator;

public class SortWrapper {
    private static Class<? extends Comparator> comparatorClass;

    public static Class<? extends Comparator> getComparatorClass() {
        return comparatorClass;
    }

    public static void sort(Holiday[] array) {
        Arrays.sort(array);
    }

    public static void sort(Holiday[] array, Comparator<? super Holiday> c) {
        comparatorClass = c.getClass();
        Arrays.<Holiday>sort(array, c);
    }
}
