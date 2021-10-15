package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

public class ArrayBasedImpl implements StackOfInts {

    @Override
    public int pop() {
        if (numOfElems > 0) {
            int elem = arrayList [0];
            int[] newArrayList = new int[0];
            int i;
            for (i=0; i<numOfElems-1; i++ ) {
                newArrayList[i] = arrayList[i+1] ;
            }
            arrayList = newArrayList ;
            numOfElems -- ;
            return elem ;
        }
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public void push(int x) {
        if (numOfElems != 0) {
            int []newArray = new int[0];
            newArray[0] = x ;
            int i;
            for (i=1 ; i<numOfElems; i++) {
                newArray[i] = arrayList[i - 1];
            }
            arrayList = newArray ;
        }
        else {
            arrayList [0] = x ;
        }
    }

    @Override
    public int numOfElems() {
        return numOfElems;
    }

    @Override
    public int peek() {
        if (numOfElems != 0) {
            return arrayList[0];
        }
        throw new IllegalStateException("To be implemented");
    }

    private int numOfElems = 0;
    private int[] arrayList ;
}
