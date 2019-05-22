package jsjf.queue;
import jsjf.exceptions.*;
/**
 * Defines a queue collection.
 *
 * @author Mohammad Chaudhry
 * @version 4.0
 * References:
 * 1. https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
 * 2. https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html
 */
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedQueue<T> implements QueueADT<T>{

    private LinkedList queue;
    /**
     * Constructor
     */
    public LinkedQueue(){
        queue = new LinkedList();
    }
    /**
     * Adds one element to the rear of this queue.
     * @param element  the element to be added to the rear of the queue
     */
    public void enqueue(T element){
        queue.addLast(element);
    }

    /**
     * Removes and returns the element at the front of this queue.
     * @return the element at the front of the queue
     */
    public T dequeue() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("queue");
        return (T) queue.remove();
    }

    /**
     * Returns without removing the element at the front of this queue.
     * @return the first element in the queue
     */
    public T first() throws EmptyCollectionException{
        if(isEmpty())
            throw new EmptyCollectionException("queue");
        return (T) queue.peekFirst(); //TODO Check type cast
    }

    /**
     * Returns true if this queue contains no elements.
     * @return true if this queue is empty
     */
    public boolean isEmpty(){
        return (size()==0);
    }

    /**
     * Returns the number of elements in this queue.
     * @return the integer representation of the size of the queue
     */
    public int size(){
        return queue.size();
    }

    /**
     * Returns a string representation of this queue.
     * @return the string representation of the queue
     */
    public String toString(){
        String s = "Queue: ";
        ListIterator<T> stackIterator = queue.listIterator();
        while(stackIterator.hasNext()){
            s += stackIterator.next() + " ";
        }
        return s;
    }

}
