package Y2018.Nov.A3th;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SolutionTest {
    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void shouldReturnOneWhenStringIsOneLetter() {
        assertThat(solution.lengthOfLongestSubStr("a"), is(1));
    }

    @Test
    public void shouldReturnCorrectStringWhenNoRepeat() {
        assertThat(solution.lengthOfLongestSubStr("abc"), is(3));
    }

    @Test
    public void shouldReturnCorrectStringWhenRepeatAhead() {
        assertThat(solution.lengthOfLongestSubStr("aabc"), is(3));
    }

    @Test
    public void shouldReturnCorrectStringWhenRepeatInTail() {
        assertThat(solution.lengthOfLongestSubStr("abcdce"), is(4));
    }
}