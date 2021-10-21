package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void addFirst() {
        DLinkList<Integer> dLinkList = new DLinkList<>();
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        assertEquals("DLinkList{ 3 2 1 }", dLinkList.toString());
    }

    @Test
    void addLast() {
        DLinkList<Integer> dLinkList = new DLinkList<>();
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        assertEquals("DLinkList{ 1 2 3 }", dLinkList.toString());
    }

    @Test
    void removeFirst() {
        DLinkList<Integer> dLinkList = new DLinkList<>();
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        dLinkList.removeFirst();
        assertEquals("DLinkList{ 2 3 }", dLinkList.toString());
    }

    @Test
    void removeLast() {
        DLinkList<Integer> dLinkList = new DLinkList<>();
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        dLinkList.removeLast();
        assertEquals("DLinkList{ 1 2 }", dLinkList.toString());
    }

    @Test
    void numOfElems() {
        DLinkList<Integer> dLinkList = new DLinkList<>();
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        assertEquals(3, dLinkList.numOfElems());
    }

    @Test
    void peek() {
        DLinkList<Integer> dLinkList = new DLinkList<>();
        dLinkList.addLast(1);
        dLinkList.addLast(2);
        dLinkList.addLast(3);
        assertEquals(1, dLinkList.peek());
    }
}