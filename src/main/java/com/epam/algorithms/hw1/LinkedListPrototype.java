package com.epam.algorithms.hw1;

import java.util.NoSuchElementException;
import java.util.Stack;

public class LinkedListPrototype<T extends Comparable<T>> {

    private Node<T> first;
    private Node<T> last;
    private int size = 0;
    private Stack<T> supportStack = new Stack<>();

    public void addFirst(T element) {
        Node<T> currentFirst = first;
        Node<T> newNode = new Node<>(element, currentFirst, null);
        first = newNode;
        if (currentFirst == null)
            last = newNode;
        else
            currentFirst.setPrev(newNode);
        size++;

        if (supportStack.isEmpty()) {
            supportStack.push(element);
        } else if (element.compareTo(supportStack.peek()) > 0) {
            supportStack.push(element);
        }

    }

    public T removeFirst() {
        Node<T> currentFirst = first;
        if (currentFirst == null) {
            throw new NoSuchElementException();
        }
        T element = currentFirst.getItem();
        Node<T> next = currentFirst.getNext();
        first = next;
        if (next == null) {
            last = null;
        } else next.setPrev(null);
        size--;

        if (!supportStack.isEmpty() && element.compareTo(supportStack.peek()) == 0) {
            supportStack.pop();
        }

        return element;
    }

    public int size() {
        return size;
    }

    public T head() {
        Node<T> currentFirst = first;
        if (currentFirst == null) {
            throw new NoSuchElementException();
        }
        return currentFirst.getItem();
    }

    public T getMax() {
        return supportStack.peek();
    }

}
