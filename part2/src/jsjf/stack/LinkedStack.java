package jsjf.stack;
import jsjf.exceptions.*;

/**
 * Defines a stack collection.
 *
 * @author Mohammad Chaudhry
 * T00554758
 * @version 4.0
 * References:
 * 1. https://docs.oracle.com/javase/7/docs/api/java/util/LinkedList.html
 * 2. https://docs.oracle.com/javase/7/docs/api/java/util/ListIterator.html
 */
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedStack <T> implements StackADT<T> {

    private LinkedList stack;
    /**
     * Constructor
     *
     */
    public LinkedStack(){
        stack = new LinkedList();
    }
    /**
     * Adds the specified element to the top of this stack.
     * @param element element to be pushed onto the stack
     */
    public void push(T element){
        stack.add(element);
    }
    /**
     * Removes and returns the top element from this stack.
     * @return the element removed from the stack
     */
    public T pop() throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("stack");
        }
        return (T) stack.removeLast();
    }

    /**
     * Returns without removing the top element of this stack.
     * @return the element on top of the stack
     */
    public T peek() throws EmptyCollectionException{
        if(isEmpty()){
            throw new EmptyCollectionException("stack");
        }
        return (T) stack.peekLast();
    }

    /**
     * Returns true if this stack contains no elements.
     * @return true if the stack is empty
     */
    public boolean isEmpty(){
        return (stack.size() == 0);
    }

    /**
     * Returns the number of elements in this stack.
     * @return the number of elements in the stack
     */
    public int size(){
        return stack.size();
    }

    /**
     * Returns a string representation of this stack.
     * @return a string representation of the stack
     */
    public String toString(){
        String s = "Stack:\n";
        ListIterator<T> stackIterator = stack.listIterator(size());
        while(stackIterator.hasPrevious()){
            s += stackIterator.previous() + "\n";
        }
        return s;
    }

}
