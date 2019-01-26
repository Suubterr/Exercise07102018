package AssertJ_tests;

import java.util.Collections;
import java.util.List;

public class BubbleSort {
    static List<String> sort(List<String> names) {
        List<String> sortedList = names;
        Collections.sort(sortedList);
        return sortedList;
    }
}
