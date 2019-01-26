package AssertJ_tests;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BubbleSortTest {

    private List<String> names;
    private BubbleSort bSort;
    private List<String> sortedList = Arrays.asList("Justyna", "Justyna", "Katarzyna", "Urszula");


    @BeforeEach
    void setup() {
        bSort = new BubbleSort();
        names = Arrays.asList("Justyna", "Katarzyna", "Urszula","Justyna");

    }

    @Test
    void testListSize() {
        List<String> result = bSort.sort(names);

        Assertions.assertThat(result)
                .hasSize(names.size())
                .isNotEmpty();
    }

    @Test
    void testSortIsCorrect() {
        List<String> result = bSort.sort(names);
        Assertions.assertThat(result).isEqualTo(sortedList);
    }
}
