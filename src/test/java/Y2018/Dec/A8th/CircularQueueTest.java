package Y2018.Dec.A8th;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class CircularQueueTest {
    private CircularQueue queue;

    @Before
    public void setUp() {
        queue = new CircularQueue(2);
    }

    @Test
    public void shouldEnqueueItem() {
        String item1 = "a";
        boolean result = queue.enqueue(item1);
        assertThat(result, is(true));
    }

    @Test
    public void shouldReturnFalseIfQueueIsFull() {
        boolean item1Result = queue.enqueue("1");
        boolean item2Result = queue.enqueue("2");
        assertThat(item1Result, is(true));
        assertThat(item2Result, is(false));
    }

    @Test
    public void shouldDequeueCorrect() {
        queue.enqueue("1");
        String item = queue.dequeue();
        assertThat(item, is("1"));
    }

    @Test
    public void shouldHandleCorrectDequeueThenEnqueue() {
        queue.enqueue("1");
        queue.dequeue();
        boolean result = queue.enqueue("2");
        assertThat(result, is(true));
    }

    @Test
    public void shouldDequeueCorrectItemsMultiCall() {
        queue = new CircularQueue(4);
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");

        String item = queue.dequeue();
        assertThat(item, is("1"));

        item = queue.dequeue();
        assertThat(item, is("2"));

        item = queue.dequeue();
        assertThat(item, is("3"));
    }

    @Test
    public void shouldReturnNullIfEmptyQueue() {
        String item = queue.dequeue();
        assertThat(item, is(nullValue()));
    }

}