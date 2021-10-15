package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    @Override
    public void enqueue(E x) {
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public E dequeue() {
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public int numOfElems() {
        return 0;
    }

    @Override
    public E peek() {
        throw new IllegalStateException("To be implemented");
    }
}
