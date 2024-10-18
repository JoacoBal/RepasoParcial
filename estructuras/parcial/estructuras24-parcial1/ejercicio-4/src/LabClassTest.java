package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.HashSet;
import java.util.Set;

/**
 * The test class LabClassTest.
 */
public class LabClassTest
{
    
    /**
     * @post Retorna verdadero si la clase satisface el invariante de representación.
    */
    public boolean repOK(LabClass labclass) {
        Set<Student> res = new HashSet<>(labclass.getEstudiantesPosgrado());
        res.addAll(labclass.getEstudiantesGrado());
        Set<Student> all = new HashSet<>(labclass.students);
        return res.equals(all);
    }

    @Test
    public void test1()
    {
        LabClass c = new LabClass(10);
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudianteGrado("Alexander Graham Bell", "22333444");
        Student s3 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        c.inscribirEstudiante(s1);
        c.inscribirEstudiante(s2);
        c.inscribirEstudiante(s3);
        List<Student> res = c.getEstudiantesGrado();
        assertTrue(res.contains(s1));
        assertTrue(res.contains(s2));
        assertFalse(res.contains(s3));
        assertEquals(2, res.size());
    }
    
    @Test
    public void test2()
    {
        LabClass c = new LabClass(10);
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudianteGrado("Alexander Graham Bell", "22333444");
        Student s3 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        c.inscribirEstudiante(s1);
        c.inscribirEstudiante(s2);
        c.inscribirEstudiante(s3);
        assertTrue(c.students.contains(s1));
        assertTrue(c.students.contains(s2));
        assertTrue(c.students.contains(s3));
        assertEquals(3, c.students.size());
        assertTrue(repOK(c));
    }
    
    @Test
    public void test3()
    {
        LabClass c = new LabClass(10);
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudianteGrado("Alexander Graham Bell", "22333444");
        Student s3 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        c.inscribirEstudiante(s1);
        c.inscribirEstudiante(s2);
        c.inscribirEstudiante(s3);
        List<Student> res = c.getEstudiantesPosgrado();
        assertTrue(res.contains(s3));
        assertFalse(res.contains(s1));
        assertFalse(res.contains(s2));
        assertEquals(1, res.size());
    }
    
    @Test
    public void test4()
    {
        LabClass c = new LabClass(10);
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudianteGrado("Alexander Graham Bell", "22333444");
        Student s3 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        c.inscribirEstudiante(s1);
        c.inscribirEstudiante(s2);
        c.inscribirEstudiante(s3);
        assertTrue(c.students.contains(s1));
        assertTrue(c.students.contains(s2));
        assertTrue(c.students.contains(s3));
        assertEquals(3, c.students.size());
        assertTrue(repOK(c));
    }
    
    @Test
    public void test5()
    {
        LabClass c = new LabClass(10);
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudiantePosgrado("Alexander Graham Bell", "22333444");
        Student s3 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        c.inscribirEstudiante(s1);
        c.inscribirEstudiante(s2);
        c.inscribirEstudiante(s3);
        List<Student> res = c.getEstudiantesPosgrado();
        assertTrue(res.contains(s3));
        assertFalse(res.contains(s1));
        assertTrue(res.contains(s2));
        assertEquals(2, res.size());
    }
    
    @Test
    public void test6()
    {
        LabClass c = new LabClass(10);
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudiantePosgrado("Alexander Graham Bell", "22333444");
        Student s3 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        c.inscribirEstudiante(s1);
        c.inscribirEstudiante(s2);
        c.inscribirEstudiante(s3);
        assertTrue(c.students.contains(s1));
        assertTrue(c.students.contains(s2));
        assertTrue(c.students.contains(s3));
        assertEquals(3, c.students.size());
        assertTrue(repOK(c));
    }

    @Test
    public void test7()
    {
        LabClass c = new LabClass(10);
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudianteGrado("Alexander Graham Bell", "22333444");
        Student s3 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        c.inscribirEstudiante(s1);
        c.inscribirEstudiante(s2);
        c.inscribirEstudiante(s3);
        List<Student> res = c.getEstudiantesGrado();
        Student s4 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s5 = new EstudianteGrado("Alexander Graham Bell", "22333444");
        Student s6 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        assertTrue(res.contains(s4));
        assertTrue(res.contains(s5));
        assertFalse(res.contains(s6));
        assertEquals(2, res.size());
    }
    
    @Test
    public void test8()
    {
        LabClass c = new LabClass(10);
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudianteGrado("Alexander Graham Bell", "22333444");
        Student s3 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        c.inscribirEstudiante(s1);
        c.inscribirEstudiante(s2);
        c.inscribirEstudiante(s3);
        List<Student> res = c.getEstudiantesPosgrado();
        Student s4 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s5 = new EstudianteGrado("Alexander Graham Bell", "22333444");
        Student s6 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        assertTrue(res.contains(s6));
        assertFalse(res.contains(s5));
        assertFalse(res.contains(s4));
        assertEquals(1, res.size());
    }
    
    @Test
    public void test9()
    {
        LabClass c = new LabClass(10);
        Student s1 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s2 = new EstudiantePosgrado("Alexander Graham Bell", "22333444");
        Student s3 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        c.inscribirEstudiante(s1);
        c.inscribirEstudiante(s2);
        c.inscribirEstudiante(s3);
        List<Student> res = c.getEstudiantesPosgrado();
        Student s4 = new EstudianteGrado("Leonardo Da Vinci", "11222333");
        Student s5 = new EstudiantePosgrado("Alexander Graham Bell", "22333444");
        Student s6 = new EstudiantePosgrado("Nikola Tesla", "33444555");
        assertTrue(res.contains(s5));
        assertFalse(res.contains(s4));
        assertTrue(res.contains(s6));
        assertEquals(2, res.size());
    }

}

