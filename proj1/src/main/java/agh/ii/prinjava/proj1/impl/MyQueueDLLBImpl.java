package agh.ii.prinjava.proj1.impl;
import agh.ii.prinjava.proj1.MyQueue;


public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems;

    /**
     * Add an elem at the start of the list
     * @param x type E
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
        throw new RuntimeException("To be implemented");
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
        if (!isEmpty()){
            return elems.getLast();
        }
        throw new RuntimeException("null");
    }

    /**
     *
     * @return queue string
     */
    @Override
    public String toString(){
        return "Queue{" + elems.toString() + "}";
    }
}
