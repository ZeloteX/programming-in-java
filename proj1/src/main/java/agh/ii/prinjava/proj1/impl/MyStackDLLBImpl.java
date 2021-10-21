package agh.ii.prinjava.proj1.impl;
import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {
    private DLinkList<E> elems;

    /**
     * delete the last element of the list
     * @return E the element deleted
     */
    @Override
    public E pop() {
        if (!elems.isEmpty()) {
            return elems.removeLast();
        }
        throw new IllegalStateException("No values");
    }

    /**
     * push l'element to the end
     * @param x
     */
    @Override
    public void push(E x) {
        elems.addLast(x);
    }

    /**
     * Return the number of integer
     * @return integer
     */
    @Override
    public int numOfElems() {
        return elems.numOfElems();
    }

    /**
     * Return the first elem of the list without deleted it
     * @return any E / Type
     */
    @Override
    public E peek() {
        return  elems.peek();
    }
}
