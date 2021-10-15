package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class LinkedListBasedImpl implements StackOfInts {

    @Override
    public int pop() {
        if (numOfElems != 0) {
            int elem = node.elem;
            node = node.next;
            numOfElems-- ;
            return elem;
        }
        throw new IllegalStateException("Empty"); // Never use throw new Error //
    }

    @Override
    public void push(int x) {
        if (numOfElems == 0) {
            Node Nnode = new Node(x);
            node = Nnode;
        }
        Node newNode = new Node(x);
        newNode.next = node ;
        node = newNode ;

        numOfElems++ ;
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {
        if (numOfElems != 0) {
            return node.elem;
        }
        throw new IllegalStateException("To be implemented");
    }

    private static class Node {
        int elem;
        Node next;

        public Node(int elem) {
            this.elem = elem;
        }
    }

    private int numOfElems = 0;
    private Node node;
}
