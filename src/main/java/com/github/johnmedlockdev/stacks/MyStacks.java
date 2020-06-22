package com.github.johnmedlockdev.stacks;

import java.util.Queue;
import java.util.Stack;

public class MyStacks {

    public Queue<String> myQueue(Queue<String> waitingQueue) {

        waitingQueue.poll();
        return waitingQueue;
    }

    public Stack<Integer> myStack(Stack<Integer> testStack){
        testStack.pop();
        testStack.pop();
        testStack.pop();
        return testStack;

    }
}
