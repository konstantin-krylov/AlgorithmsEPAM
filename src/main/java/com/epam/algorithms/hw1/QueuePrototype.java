package com.epam.algorithms.hw1;

public class QueuePrototype<T extends Number & Comparable<T>> {

    private LinkedListPrototype<T> inbox = new LinkedListPrototype<>();
    private LinkedListPrototype<T> outbox = new LinkedListPrototype<>();

    public void addFirst(T item) {
        inbox.addFirst(item);
    }

    public T removeLast() {
        if (outbox.size() == 0) {
            while (inbox.size() != 0) {
                outbox.addFirst(inbox.removeFirst());
            }
        }
        return outbox.removeFirst();
    }

    public T head() {
        if (outbox.size() == 0) {
            while (inbox.size() != 0) {
                outbox.addFirst(inbox.removeFirst());
            }
        }
        return outbox.head();
    }

    public T tail() {
        return inbox.head();
    }

    public int size() {
        return inbox.size() + outbox.size();
    }
}
