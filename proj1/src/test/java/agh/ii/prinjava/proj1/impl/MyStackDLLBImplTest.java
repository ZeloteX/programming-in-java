package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void pop() {
        MyStack<Integer> stackOfInts = MyStack.create();
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        stackOfInts.pop();
        assertEquals("Stack{DLinkList{ 1 2 }}", stackOfInts.toString());
    }

    @Test
    void push() {
        MyStack<Integer> stackOfInts = MyStack.create();
        stackOfInts.push(1);
        stackOfInts.push(2);
        stackOfInts.push(3);
        assertEquals("Stack{DLinkList{ 1 2 3 }}", stackOfInts.toString());
    }
}