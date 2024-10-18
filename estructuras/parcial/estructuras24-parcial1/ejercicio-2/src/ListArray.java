package src;


/**
 * ArrayList implements unbounded sequences of objects of type T
 * using a resizing array.
 * 
 * A typical List is a sequence [o1, o2,..., on]; we 
 * denote this by: this = [o1, o2,..., on].
 * 
 * The methods use equals to determine equality of elements.
 */
public class ListArray<T> implements List<T>
{
    // initial capacity of underlying resizing array
    protected static final int INIT_CAPACITY = 8;

    protected T[] array;         // array of items
    protected int size;
    
    /**
     * @post Crea una lista vacía. La capacidad inicial
     *   del array debe ser igual a INIT_CAPACITY (8);
     *   Más formalmente, satisface: this = [].
     */
    public ListArray() 
    {
        array = (T[]) new Object[INIT_CAPACITY];
        size = 0;
    }
    
    /**
     * @post Returns the number of elements in the list.
     *   More formally, it satisfies: result = #this.
     */
    public int size() {
        return size;
    }

    /**
     * @post Returns true iff the list contains no elements.
     *   More formally, it satisfies: result = #this = 0.
     */
    public boolean isEmpty() {
        return size == 0;    
    }
    
    /**
     * @post Returns true iff the list contains element e.
     *   More formally, it satisfies: 
     *   result = exists o | o in this && e.equals(o).
     */
    public boolean contains(T e) {

    }
    
    /**
     * @pre capacity > size() (throws IllegalArgumentException).
     * @post Resize the underlying array to the given capacity.
     */
    private void resize(int capacity) 
    {

    }
    
    /**
     * @post Agrega el elemento e al final de la lista.
     *   Duplica el tamaño del arreglo cada vez que 
     *   size == array.length.
     *   Más formalmente, satisface: this = old(this) ++ [e].
     */
    public void add(T e) {

    }
    
    /**
     * @post Removes the first occurrence of e from this list.
     *   If e is not in the list it does not modify the list.
     *   Returns true iff e is removed (result = e in old(list)).
     */
    public boolean remove(T e) {
        int index = indexOf(e);
        if (index == -1)
            return false;
        
        remove(index);
        return true;
    }
    
    /**
     * @post Removes all of the elements from the list,
     *   More formally, it satisfies: #this = 0.
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }
    
    /**
     * @pre 0 <= index < size() (throws an IndexOutOfBoundsException)
     * @post Returns the element at position index in the list,
     *   More formally, it satisfies: result = this[index].
     */
    public T get(int index) {

    }
    
    /**
     * @pre 0 <= index < size() (throws an IndexOutOfBoundsException)
     * @post Replaces the element at position index with e, and returns
     *   the element that was replaced.
     *   More formally, it satisfies: 
     *     this[index].equals(e) && #this = #old(this) && 
     *     result.equals(old(this)[index]).
     */
    public T set(int index, T e) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("");
        
        T old = array[index];
        array[index] = e;
        return old;
    }
    
    /**
     * @pre 0 <= index < size() (throws an IndexOutOfBoundsException)
     * @post Inserts the element at position index with e.
     *   More formally, it satisfies: 
     *   this[index].equals(e) && #this = #old(this) +1.
     */
    public void add(int index, T e) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("");
            
        if (size == array.length) 
            resize(2*array.length);   // double size of array if necessary
        
        for (int i = size; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = e;
        size++;
    }
    
    /**
     * @pre 0 <= index < size() (throws an IndexOutOfBoundsException)
     * @post Removes the element at position index.
     *   More formally, it satisfies: 
     *   result = old(this)[index] && #this = #old(this) -1.
     */
    public T remove(int index){

    }
    
    /** 
     * @post Returns the index of the first occurrence of e
     *   in the list, or -1 if this list does not contain e.
     *   More formally, it satisfies: 
     *     result = -1 -> !(e in this) && 
     *     result != -1 -> this[result].equals(e).
     */
    public int indexOf(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e))
                return i;
        }
        return -1;
    }
    
    /**
     * @post Returns a string representation of the stack. Implements
     *   the abstraction function. Hence, it represents the stack as a 
     *   sequence "[o1, o2,..., on]".
     */
    public String toString() {

    }
    
}
