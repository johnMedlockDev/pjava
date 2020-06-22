package com.github.johnmedlockdev.stacks;

import java.util.LinkedList;
import java.util.Queue;

public class MyStacks {

    public Queue<String> myQueue(Queue<String> waitingQueue) {

        waitingQueue.poll();
        return waitingQueue;
    }
}
