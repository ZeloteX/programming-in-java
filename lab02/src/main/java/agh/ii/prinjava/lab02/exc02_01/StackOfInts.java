package agh.ii.prinjava.lab02.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 */

public interface StackOfInts {
    /**
     * remove an integer from the linked list
     * @return int
     */
    int pop();

    /**
     * Push x in the linked list
     * @param x
     */
    void push(int x);

    /**
     * Boolean true then no element - False then there is element
     * @return boolean
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * return the number of element
     * @return Int
     */
    int numOfElems();

    /**
     * show the first element of the list
     * @return int
     */
    int peek();
}
