package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * The test class ListArrayTest.
 */
public class ListArrayTest
{
    /**
     * @post Returns true if and only if list is a 
     *   valid ListArray.
     */
    public static boolean repOK(ListArray list) {
        if (list.size < 0 || list.size > list.array.length)
            return false;
        // The stack does not store null as an element        
        for (int i = 0; i < list.size; i++) {
            if (list.array[i] == null)
                return false;
        }
        // All elements starting from size are null
        for (int i = list.size; i < list.array.length; i++) {
            if (list.array[i] != null)
                return false;
        }        
        
        return true;
    }
      
    /**
     * @post Retorna la longitud del arreglo usado para implementar la
     *   lista.
     */
    public static int getArraySize(ListArray list) {
        return list.array.length;
    }
    
    
    @Test
    public void test0()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        assertEquals(2, list.size());
    }
    
    @Test
    public void test1()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        assertEquals(1, list.get(0));
        assertEquals(0, list.get(1));
    }
    
    @Test
    public void test2()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        assertTrue(list.contains(0));
        assertTrue(list.contains(1));
        assertFalse(list.contains(2));
    }
    
    @Test
    public void test3()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        assertTrue(repOK(list));
    }
    
    @Test
    public void test4()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        assertEquals("[1, 0]", list.toString()); 
    }
       
    @Test
    public void test5()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        assertThrows(IndexOutOfBoundsException.class, 
            () -> list.get(2));
    }
    
    @Test
    public void test6()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        assertThrows(IndexOutOfBoundsException.class, 
            () -> list.remove(2));
    }   
    
    @Test
    public void test7()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        Integer elem = list.remove(0);
        assertEquals(1, elem);
    }
    
    @Test
    public void test8()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        Integer elem = list.remove(0);
        assertEquals(1, list.size());
    }
    
    @Test
    public void test9()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        Integer elem = list.remove(0);
        assertEquals(0, list.get(0));
    }
    
    @Test
    public void test10()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        Integer elem = list.remove(0);
        assertTrue(list.contains(0));
        assertFalse(list.contains(1));
        assertFalse(list.contains(2));
    }
    
    @Test
    public void test11()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        Integer elem = list.remove(0);
        assertTrue(repOK(list)); 
    }
    
    @Test
    public void test12()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        Integer elem = list.remove(0);
        assertEquals("[0]", list.toString()); 
    }
    
    @Test
    public void test20()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        assertEquals(8, ListArray.INIT_CAPACITY);
    }
    
    @Test
    public void test21()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        assertEquals(8, getArraySize(list));
    }
    
    @Test
    public void test22()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        assertEquals(16, getArraySize(list));
    }
    
    @Test
    public void test23()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        assertEquals(9, list.size());
    }
    
    @Test
    public void test24()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        assertEquals(1, list.get(0));
        assertEquals(0, list.get(1));
    }
    
    @Test
    public void test25()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        assertTrue(list.contains(0));
        assertTrue(list.contains(1));
        assertFalse(list.contains(2));
    }
    
    @Test
    public void test26()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        assertTrue(repOK(list));
    }
    
    @Test
    public void test27()
    {
        ListArray<Integer> list = new ListArray<Integer>();
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(0);
        list.add(0);
        assertEquals("[1, 0, 1, 0, 1, 0, 1, 0, 0]", list.toString()); 
    }
}

