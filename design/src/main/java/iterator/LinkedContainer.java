package iterator;

import com.sun.istack.internal.Nullable;

/**
 * 基于链表的简易LinkedList
 * @param <T>
 */
public class LinkedContainer<T> implements Container<T> {
    private LinkNode<T> head, current, tail;
//    private T data;
//    private LinkedContainer<T> next;
    private int length;

    public LinkedContainer() {
        head = new LinkNode<>();
        current = head;
        tail = head;
        length = 0;
    }

//    private LinkedContainer(T data) {
//        this.data = data;
//    }

    public void add(T item) {
        if (length == 0) {
            head.data = item;
        } else {
            tail.next = new LinkNode<>(item);
            tail = tail.next;
        }
        length++;
    }

    public void remove(T item) {
        LinkNode<T> h = head;
        LinkNode<T> c = head;

        if (head.data == item) {
            head = head.next;
            length--;
        } else {
            while (c != null && c.next != null) {
                if (c.next.data == item) {
                    h.next = c.next.next;
                    length--;
                }
                h = h.next;
                c = c.next.next;
            }
        }
    }

    public int length() {
        return length;
    }

    @Nullable
    public T get(int index) {
        if (index < 0) return null;

        int c = 0;
        LinkNode<T> h = head;
        while (h != null) {
            if (c == index) {
                return h.data;
            }
            h = h.next;
            c++;
        }
        return null;
    }

    @Override
    public Iterator<T> getIterator() {
        return new ItemIterator();
    }

    private class ItemIterator implements Iterator<T> {
        ItemIterator() {
            current = head;
        }
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }
    }
}
