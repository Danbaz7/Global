
package csci251projectthree;


/**
 * class MyStack: A stack class implemented by using ArrayList
 * All stack elements are stored in an ArrayList. The top element has index top
 * 
 * @author Daniel Obazee    
 * @version 03-08-2026
 */
import java.util.ArrayList;

public class MyStack<E>
{
    private ArrayList<E> list; // used to store elements in stack
    private int top; // the index of top element
    
    /**
     * constructor construct an empty stack
     */
    
   public MyStack() {
        list = new ArrayList<E>();
        top = -1; // Represents an empty state
    }
    
    /**
     * push a given element on the top of the stack i.e
     *
     *
     * Adds an element to the top of the stack.
     * CRUCIAL: Adding to the end of an ArrayList is O(1).
     */
    public void push(E item) {
        list.add(item);
        top++;
    }
    
    /**
     * isEmpty return true if the stack is empty; false otherwise
     * @return true if the stack is empty; false otherwise
     */
  public boolean isEmpty() {
        return list.isEmpty();
    }
    /**
     * peek Return the top element
     */
/**
     * @return The top element or null if empty.
     */
    public E peek() {
        if (isEmpty()) return null;
        return list.get(top);
    }
    /**
     * pop Remove the top element from the stack. If the stack is empty,nothing happen
     */
/**
     * Removes the top element. If empty, nothing happens.
     */
    public void pop() {
        if (!isEmpty()) {
            list.remove(top);
            top--;
        }
    }
    
    /**
     * size return the size of the stack
     * @return number of elements in stack
     */
  public int size() {
        return list.size();
    }
}

