package com.epam.algorithms;

import com.epam.algorithms.hw1.LinkedListPrototype;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListPrototypeTest {

    LinkedListPrototype<Integer> linkedListPrototype;

    @Before
    public void init() {
        linkedListPrototype = new LinkedListPrototype();
        linkedListPrototype.addFirst(5);
        linkedListPrototype.addFirst(6);
        linkedListPrototype.addFirst(7);
    }

    @Test
    public void addFirst() {
        linkedListPrototype.addFirst(2);
        Object head = linkedListPrototype.head();
        assertEquals(2, head);
    }

    @Test
    public void removeFirst() {
        Object first = linkedListPrototype.removeFirst();
        assertEquals(7, first);
    }

    @Test
    public void size() {
        assertEquals(3, linkedListPrototype.size());
    }

    @Test
    public void head() {
        Integer head = linkedListPrototype.head();
        assertEquals(new Integer(7), head);
    }

    @Test
    public void getMax() {
        linkedListPrototype.addFirst(50);
        linkedListPrototype.addFirst(600);
        linkedListPrototype.addFirst(10000);
        linkedListPrototype.removeFirst();
        Number max = linkedListPrototype.getMax();
        assertEquals(600, max);
    }
}