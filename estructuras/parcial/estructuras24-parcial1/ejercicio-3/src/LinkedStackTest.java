package src;

 

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.NoSuchElementException;

/**
 * Tests for LinkedStack.
 */
public class LinkedStackTest
{
    
    /**
     * @post Returns true if and only if stack is a 
     *   valid LinkedStack.
     */
    public static boolean repOK(LinkedStack stack) {
        if (stack.size < 0) 
            return false;
        // check internal consistency of instance variable size,
        // and that the stack is null terminated
        int numberOfNodes = 0;
        Node curr = stack.top;
        while (curr != null && numberOfNodes <= stack.size) {
            numberOfNodes++;
            curr = curr.next;
        }
        if (numberOfNodes != stack.size || curr != null) 
            return false;

        return true;
    }
    
    @Test
    public void test0()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        assertTrue(stack.isEmpty());
    }
    
    @Test
    public void test1()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        assertEquals(0, stack.size());
    }
    
    @Test
    public void test2()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        assertEquals("[]", stack.toString());
    }
    
    @Test
    public void test3()
    {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        assertTrue(repOK(stack));
    }
    
    @Test
    public void test4()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.size());
    }
    
    @Test
    public void test5()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.top());
    }
    
    @Test
    public void test6()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        assertEquals("[1, 2]", stack.toString());
    }
    
    @Test
    public void test7()
    {
        LinkedStack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        Integer top = stack.pop();
        assertTrue(repOK(stack));
    }
    
    @Test
    public void test8()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        Integer top = stack.pop();
        assertEquals(1, stack.size());
    }
    
    @Test
    public void test9()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        Integer top = stack.pop();
        assertEquals(1, stack.top());
    }
    
    @Test
    public void test10()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        Integer top = stack.pop();
        assertEquals(2, top);
    }
    
    @Test
    public void test11()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        Integer top = stack.pop();
        assertEquals("[1]", stack.toString());
    } 
    
    @Test
    public void test12()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        assertThrows(NoSuchElementException.class, 
            () -> stack.top());
    }
    
    @Test
    public void test13()
    {
        Stack<Integer> stack = new LinkedStack<Integer>();
        assertThrows(NoSuchElementException.class, 
            () -> stack.pop());
    }
}

