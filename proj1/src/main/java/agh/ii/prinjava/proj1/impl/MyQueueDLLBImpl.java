package agh.ii.prinjava.proj1.impl;
import agh.ii.prinjava.proj1.MyQueue;


public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    /**
     * Add an elem at the start of the list
     * @param x
     */
    @Override
    public void enqueue(E x) {
        elems.addFirst(x);
    }

    /**
     * return the last element of the list
     * @return E
     */
    @Override
    public E dequeue() {
        if (!elems.isEmpty()) {
            return elems.removeLast() ;
        }
        throw new IllegalStateException("To be implemented");
    }

    /**
     * return the number of element
     * @return integer counter
     */
    @Override
    public int numOfElems() {
        return elems.numOfElems() ;
    }

    /**
     * return the first element of the list
     * @return E
     */
    @Override
    public E peek() {
        return elems.peek();
    }
}
