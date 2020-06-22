package com.github.johnmedlockdev.stacks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    @Test
    void myStack() {
        Stack<Integer> testStack = new Stack<Integer>();
        Stack<Integer> testStackE = new Stack<Integer>();
        Integer[] integers = {1,2,3,4,5,6,7};
        Integer[] integersE = {1,2,3,4};

        for(Integer i : integers){
            testStack.push(i);
        }
        for(Integer i : integersE){
            testStackE.push(i);
        }

        assertEquals( testStackE ,myStacks.myStack(testStack));

    }
}