package com.bridgelabz.Queue;

import com.bridgelabz.LinkedList;
import com.bridgelabz.Node;

public class Queue<T> {

    LinkedList<T> linkedList = new LinkedList<T>();

    public void add(T data) {
        linkedList.add(data);
    }

    public void show() {
        linkedList.show();
    }

    public void pop(T data) {
        linkedList.pop();
    }
}

