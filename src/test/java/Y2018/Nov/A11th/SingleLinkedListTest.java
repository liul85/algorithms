package Y2018.Nov.A11th;

import Y2018.Nov.A11th.SingleLinkedList.Node;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class SingleLinkedListTest {
    private SingleLinkedList<Integer> singleLinkedList;

    @Before
    public void setup() {
        singleLinkedList = new SingleLinkedList<>();
    }

    @Test
    public void shouldGetNullHead() {
        assertNull(singleLinkedList.getFirst());
    }

    @Test
    public void shouldGetNullTail() {
        assertNull(singleLinkedList.getLast());
    }

    @Test
    public void shouldInsertHead() {
        singleLinkedList.insert(1);
        assertThat(singleLinkedList.getFirst(), is(1));
    }

    @Test
    public void shouldGetCorrectDataByIndex() {
        singleLinkedList.insert(1);
        singleLinkedList.insert(2);
        singleLinkedList.insert(3);

        assertThat(singleLinkedList.get(0), is(1));
        assertThat(singleLinkedList.get(1), is(2));
        assertThat(singleLinkedList.get(2), is(3));
    }

    @Test
    public void shouldGetlast() {
        singleLinkedList.insert(1);
        singleLinkedList.insert(2);
        singleLinkedList.insert(3);

        assertThat(singleLinkedList.getLast(), is(3));
    }

    @Test
    public void shouldReturnTrueIfContainsSpecifiedValue() {
        singleLinkedList.insert(1);
        singleLinkedList.insert(2);
        singleLinkedList.insert(3);

        assertThat(singleLinkedList.contains(2), is(true));
    }

    @Test
    public void shouldReturnFalseIfEmptyLink() {
        assertThat(singleLinkedList.contains(1), is(false));
    }

    @Test
    public void shouldReturnFalseIfNotContainsSpecifiedValue() {
        singleLinkedList.insert(1);
        assertThat(singleLinkedList.contains(2), is(false));
    }

    @Test
    public void shouldReturnTrueIfSpecifiedValueIsLast() {
        singleLinkedList.insert(1);
        singleLinkedList.insert(2);
        assertThat(singleLinkedList.contains(2), is(true));
    }

    @Test
    public void shouldReverseEmptyList() {
        SingleLinkedList reversedLink = singleLinkedList.reverse();
        assertThat(reversedLink.getFirst(), is(nullValue()));
    }

    @Test
    public void shouldReverseNonEmptyList() {
        singleLinkedList.insert(1);
        singleLinkedList.insert(2);
        singleLinkedList.insert(3);
        singleLinkedList.insert(4);
        singleLinkedList.insert(5);

        SingleLinkedList reversedLink = singleLinkedList.reverse();
        assertThat(reversedLink.getFirst(), is(5));
        assertThat(reversedLink.get(1), is(4));
        assertThat(reversedLink.getLast(), is(1));
    }

    @Test
    public void shouldReturnFalseForEmptyLink() {
        assertThat(singleLinkedList.circled(), is(false));
    }

    @Test
    public void shouldReturnFalseWhenNOCircledNodes() {
        singleLinkedList.insert(1);
        singleLinkedList.insert(2);
        singleLinkedList.insert(3);

        assertThat(singleLinkedList.circled(), is(false));
    }

    @Test
    public void shouldReturnTrueWhenCircledNodes() {
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);

        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(node4);
        node4.setNext(node2);

        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>(node1);
        assertThat(singleLinkedList.circled(), is(true));
    }

}