package Y2018.Dec.A8th;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class LinkedListQueueTest {
    private LinkedListQueue queue;

    @Before
    public void setUp() {
        queue = new LinkedListQueue();
    }

    @Test
    public void shouldSupportEnqueue() {
        boolean result = queue.enqueue("1");
        assertThat(result, is(true));
    }

    @Test
    public void shouldSupportDequeue() {
        queue.enqueue("1");
        String item = queue.dequeue();
        assertThat(item, is("1"));
    }

    @Test
    public void shouldGetNullFromEmptyQueue() {
        String dequeue = queue.dequeue();
        assertThat(dequeue, is(nullValue()));
    }

}