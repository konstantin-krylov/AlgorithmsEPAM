package com.epam.algorithms;

import com.epam.algorithms.hw1.QueuePrototype;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QueuePrototypeTest {

    QueuePrototype queue;

    @Before
    public void init() {
        queue = new QueuePrototype();
        queue.addFirst(5);
        queue.addFirst(6);
        queue.addFirst(7);
    }

    @Test
    public void addFirst() {
        queue.addFirst(2);
        Object head = queue.head();
        assertEquals(5, head);
    }

    @Test
    public void removeLast() {
        Object last = queue.removeLast();
        assertEquals(5, last);
    }

    @Test
    public void head() {
        Object head = queue.head();
        assertEquals(5, head);
    }

    @Test
    public void tail() {
    }

    @Test
    public void size() {
    }
}