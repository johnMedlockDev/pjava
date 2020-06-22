package com.github.johnmedlockdev.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class MyStacksTest {
    MyStacks myStacks = new MyStacks();
    Queue<String> waitingQueue = new LinkedList<String>();
    Queue<String> expectedQueue = new LinkedList<String>();
    @BeforeEach
    void setup() {
        waitingQueue.add("Rajeev");
        waitingQueue.add("Chris");
        waitingQueue.add("John");
        waitingQueue.add("Mark");
        waitingQueue.add("Steven");
        expectedQueue.addAll(waitingQueue);
        expectedQueue.poll();
    }

    @Test
    void myQueue() {
       assertEquals(expectedQueue,myStacks.myQueue(waitingQueue));
    }
}