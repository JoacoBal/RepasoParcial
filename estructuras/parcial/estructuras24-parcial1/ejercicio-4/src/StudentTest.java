package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * The test class StudentTest.
 */
public class StudentTest
{

    @Test
    public void test0() {
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        assertTrue(s1.equals(s2));
    }
    
    @Test
    public void test1() {
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudiantePosgrado("Leonardo Da Vinci", "11222333");
        assertFalse(s1.equals(s2));
    }
    
    @Test
    public void test2() {
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudianteGrado("Alexander Graham Bell", "22333444");
        assertFalse(s1.equals(s2));
    }
    
    @Test
    public void test3() {
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudianteGrado("Alexander Graham Bell", "11222333");
        assertFalse(s1.equals(s2));
    }
    
    @Test
    public void test4() {
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        assertTrue(s1.deGrado());
    }
    
    @Test
    public void test5() {
        Student s1 = new EstudiantePosgrado("Leonardo Da Vinci", "11222333");
        assertFalse(s1.deGrado());
    }
    
}
