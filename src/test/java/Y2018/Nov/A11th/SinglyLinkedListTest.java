package Y2018.Nov.A11th;

import Y2018.Nov.A11th.SinglyLinkedList.Node;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class SinglyLinkedListTest {
    private SinglyLinkedList<Integer> singlyLinkedList;

    @Before
    public void setup() {
        singlyLinkedList = new SinglyLinkedList<>();
    }

    @Test
    public void shouldGetNullHead() {
        assertNull(singlyLinkedList.getFirst());
    }

    @Test
    public void shouldGetNullTail() {
        assertNull(singlyLinkedList.getLast());
    }

    @Test
    public void shouldInsertHead() {
        singlyLinkedList.insert(1);
        assertThat(singlyLinkedList.getFirst(), is(1));
    }

    @Test
    public void shouldGetCorrectDataByIndex() {
        singlyLinkedList.insert(1);
        singlyLinkedList.insert(2);
        singlyLinkedList.insert(3);

        assertThat(singlyLinkedList.get(0), is(1));
        assertThat(singlyLinkedList.get(1), is(2));
        assertThat(singlyLinkedList.get(2), is(3));
    }

    @Test
    public void shouldGetlast() {
        singlyLinkedList.insert(1);
        singlyLinkedList.insert(2);
        singlyLinkedList.insert(3);

        assertThat(singlyLinkedList.getLast(), is(3));
    }

    @Test
    public void shouldReturnTrueIfContainsSpecifiedValue() {
        singlyLinkedList.insert(1);
        singlyLinkedList.insert(2);
        singlyLinkedList.insert(3);

        assertThat(singlyLinkedList.contains(2), is(true));
    }

    @Test
    public void shouldReturnFalseIfEmptyLink() {
        assertThat(singlyLinkedList.contains(1), is(false));
    }

    @Test
    public void shouldReturnFalseIfNotContainsSpecifiedValue() {
        singlyLinkedList.insert(1);
        assertThat(singlyLinkedList.contains(2), is(false));
    }

    @Test
    public void shouldReturnTrueIfSpecifiedValueIsLast() {
        singlyLinkedList.insert(1);
        singlyLinkedList.insert(2);
        assertThat(singlyLinkedList.contains(2), is(true));
    }

    @Test
    public void shouldReverseEmptyList() {
        SinglyLinkedList reversedLink = singlyLinkedList.reverse();
        assertThat(reversedLink.getFirst(), is(nullValue()));
    }

    @Test
    public void shouldReverseNonEmptyList() {
        singlyLinkedList.insert(1);
        singlyLinkedList.insert(2);
        singlyLinkedList.insert(3);
        singlyLinkedList.insert(4);
        singlyLinkedList.insert(5);

        SinglyLinkedList reversedLink = singlyLinkedList.reverse();
        assertThat(reversedLink.getFirst(), is(5));
        assertThat(reversedLink.get(1), is(4));
        assertThat(reversedLink.getLast(), is(1));
    }

    @Test
    public void shouldReturnFalseForEmptyLink() {
        assertThat(singlyLinkedList.circled(), is(false));
    }

    @Test
    public void shouldReturnFalseWhenNOCircledNodes() {
        singlyLinkedList.insert(1);
        singlyLinkedList.insert(2);
        singlyLinkedList.insert(3);

        assertThat(singlyLinkedList.circled(), is(false));
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

        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>(node1);
        assertThat(singlyLinkedList.circled(), is(true));
    }

    @Test
    public void shouldMergeTwoLinksSequencely() {
        SinglyLinkedList<Integer> leftLinkedList = new SinglyLinkedList<>();
        leftLinkedList.insert(1);
        leftLinkedList.insert(3);
        leftLinkedList.insert(5);
        SinglyLinkedList<Integer> rightLinkedList = new SinglyLinkedList<>();
        rightLinkedList.insert(2);
        rightLinkedList.insert(3);
        rightLinkedList.insert(4);

        SinglyLinkedList<Integer> mergedList = leftLinkedList.sortedMerge(rightLinkedList);
        assertThat(mergedList.get(0), is(1));
        assertThat(mergedList.get(1), is(2));
        assertThat(mergedList.get(2), is(3));
        assertThat(mergedList.get(3), is(3));
        assertThat(mergedList.getLast(), is(5));
    }

}