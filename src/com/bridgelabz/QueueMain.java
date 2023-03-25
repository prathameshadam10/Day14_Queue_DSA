package com.bridgelabz.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.add(56);
        queue.add(30);
        queue.add(70);
        queue.show();
        queue.pop(56);
        queue.show();
    }
}

