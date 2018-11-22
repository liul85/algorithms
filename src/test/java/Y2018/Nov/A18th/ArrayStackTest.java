package Y2018.Nov.A18th;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class ArrayStackTest {
    private ArrayStack<Integer> stack;

    @Before
    public void setup() {
        stack = new ArrayStack<>(16);
    }

    @Test
    public void shouldCreateEmptyStack() {
        assertThat(stack.isEmpty(), is(true));
    }

    @Test
    public void shouldPushElementToStack() {
        stack.push(1);
        assertThat(stack.isEmpty(), is(false));
    }

    @Test
    public void shouldPopElementForEmptyStack() {
        assertThat(stack.pop(), is(nullValue()));
    }

    @Test
    public void shouldPopCorrectElement() {
        stack.push(1);
        stack.push(2);

        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(1));
        assertThat(stack.pop(), is(nullValue()));
    }

    @Test
    public void shouldIncreaseCapacityDynamiclly() {
        stack = new ArrayStack<>(1);
        stack.push(1);
        stack.push(2);
        assertThat(stack.pop(), is(2));
        assertThat(stack.pop(), is(1));
    }
}