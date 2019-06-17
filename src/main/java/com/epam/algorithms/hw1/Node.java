package com.epam.algorithms.hw1;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Node<T extends Comparable<T>> {
    private T item;
    private Node<T> next;
    private Node<T> prev;
}

