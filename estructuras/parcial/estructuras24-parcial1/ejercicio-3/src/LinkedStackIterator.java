package src;

 

import java.util.NoSuchElementException;
import java.util.Iterator;


/**
 * An Iterator implementation for LinkedStack
 */
public class LinkedStackIterator<T> implements Iterator<T>
{
    private Node<T> current;
    
    /**
     * @post Creates an iterator for stack
     */
    public LinkedStackIterator(LinkedStack<T> stack) 
    {
        this.current = stack.top;
    }
    
    /**
     * @post Returns true if and only if the iteration has more elements.
     */
    public boolean hasNext() 
    {
        return current != null;
    }

    /**
     * @pre hasNext() (throws NoSuchElementException).
     * @post Returns the next element in the iteration.
     */
    public T next() 
    {
        if (!hasNext()) 
            throw new NoSuchElementException();
        
        T item = current.item;
        current = current.next;
        return item;
    }
}
