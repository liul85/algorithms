package Y2018.Oct.A28th;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BubbleSort2Test {
    private BubbleSort<Integer> bubbleSort;

    @Before
    public void setup() {
        bubbleSort = new BubbleSort<>();
    }

    @Test
    public void shouldSortCollectionCorrectly() {
        Integer[] integers = {4, 6, 3, 7, 1, 5, 6, 3};
        bubbleSort.sort(integers);

        assertThat(integers, is(new Integer[]{1, 3, 3, 4, 5, 6, 6, 7}));
    }
}