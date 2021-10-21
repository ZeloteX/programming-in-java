package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {
    private Node<E> first ; //least-recently add

    private static class Node<T> {
        T elem;
        Node<T> next;
        Node<T> prev;
    }


    /**
     * @return boolean
     * true if list empty
     * false if not
     */
    public boolean isEmpty () {
        return first.elem == null;
    }

    /**
     * Add at the beginning
     * @param elem
     */
    public void addFirst(E elem) {
        if (isEmpty()) {
            first.elem = elem ;
            first.next = null ;
            first.prev = null ;
        }
        else {
            Node<E> newNode = new Node<>() ;
            newNode.next = first ;
            first.prev = newNode ;
            newNode.elem = elem ;
            first = newNode ;
        }

    }

    /**
     * add at the end
     * @param elem
     */
    public void addLast (E elem) {
        if (isEmpty()) {
            first.elem = elem ;
            first.next = null ;
            first.prev = null ;
        }
        else {
            Node<E> temp = first;
            while (temp.next != null) {
                temp = temp.next ;
            }

            Node<E> newNode = new Node<E>() ;
            newNode.prev = temp  ;
            temp.next = newNode ;
            newNode.elem = elem ;
        }
    }

    /**
     * delete at the beginning
     * @return Node
     * the deleted node
     */
    public E removeFirst () {
        Node<E> toDelete = first;

        if (isEmpty() || first.next == null) {
            first = null;
            return toDelete.elem;
        }
        first = first.next ;
        first.prev = null;
        return toDelete.elem ;
    }

    /**
     * Delete at the end
     * @return Node
     * return the last node deleted
     */
    public E removeLast () {
        Node<E> toDelete = first;
        if (isEmpty() || first.next == null) {
            first = null;
            return toDelete.elem;
        }

        while (toDelete.next != null) {
            toDelete = toDelete.next ;
        }

        Node<E> temp = toDelete.prev ;
        temp.next = null ;
        return toDelete.elem;
    }

    /**
     *
     * @return toString of the doubly linked list
     */
    @Override
    public String toString() {
        Node<E> temp = first;
        String tostring = "DLinkList{ ";

        while(temp.next != null){
            tostring += temp.elem + " / ";
            temp = temp.next;
        }

        return tostring + " }";
    }

    int numOfElems(){
        if(first.elem == null){
            return 0;
        }
        else{
            int counter = 1;
            Node<E> temp = first;
            while(temp.next != null) {
                counter++;
                temp = temp.next;
            }
            return counter;
        }
    }

    public E peek () {
        if (!isEmpty()) {
            return first.elem;
        }
        throw new IllegalStateException("Nothing here");
    }
}
