package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;

    @Override
    public E pop() {
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public void push(E x) {
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public int numOfElems() {
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public E peek() {
        throw new IllegalStateException("To be implemented");
    }
}
