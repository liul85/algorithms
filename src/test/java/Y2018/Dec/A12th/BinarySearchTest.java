package Y2018.Dec.A12th;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BinarySearchTest {
    private BinarySearch binarySearch = new BinarySearch();

    @Test
    public void shouldSearchValueFromArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = binarySearch.search(array, 8);
        assertThat(index, is(7));
    }

    @Test
    public void shouldReturnMinusOneIfNoResult() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = binarySearch.search(array, 0);
        assertThat(index, is(-1));
    }

    @Test
    public void shouldRecursiveSearchValueFromArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = binarySearch.recursiveSearch(array, 8);
        assertThat(index, is(7));
    }

    @Test
    public void shouldReturnMinusOneIfNoResultWhenRecursiveSearch() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int index = binarySearch.recursiveSearch(array, 0);
        assertThat(index, is(-1));
    }
}