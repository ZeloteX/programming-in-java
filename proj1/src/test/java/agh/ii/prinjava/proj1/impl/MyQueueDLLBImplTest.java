package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void enqueue() {
        MyQueue<Integer> queueOfInts = MyQueue.create();
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        assertEquals("Queue{DLinkList{ 3 2 1 }}", queueOfInts.toString());
    }

    @Test
    void dequeue() {
        MyQueue<Integer> queueOfInts = MyQueue.create();
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        queueOfInts.dequeue();
        assertEquals("Queue{DLinkList{ 3 2 }}", queueOfInts.toString());
    }

    @Test
    void numOfElems() {
        MyQueue<Integer> queueOfInts = MyQueue.create();
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        assertEquals(3, queueOfInts.numOfElems());
    }

    @Test
    void peek() {
        MyQueue<Integer> queueOfInts = MyQueue.create();
        queueOfInts.enqueue(1);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(3);
        assertEquals(1, queueOfInts.peek());
    }
}