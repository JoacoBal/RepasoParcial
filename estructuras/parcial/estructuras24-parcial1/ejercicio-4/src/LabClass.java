package src;

import java.util.*;

/**
 * The LabClass class represents an enrolment list for one lab class. It stores
 * the time, room and participants of the lab, as well as the instructor's name.
 */
public class LabClass
{
    protected String instructor;
    protected String room;
    protected String timeAndDay;
    protected ArrayList<Student> students;
    protected int capacity;
    
    /**
     * @pre 'maxNumberOfStudents' > 0
     * @post Create a LabClass with a maximum number of enrolments. All other details
     * are set to default values.
     */
    public LabClass(int maxNumberOfStudents)
    {
        instructor = "unknown";
        room = "unknown";
        timeAndDay = "unknown";
        students = new ArrayList<Student>();
        capacity = maxNumberOfStudents;
    }

    /**
     * @pre !isFull()
     * @post Agrega el estudiante newStudent a esta LabClass.
     */
    public void inscribirEstudiante(Student newStudent)
    {

    }
    
    /**
     * @post Returns true if and only if the class is full.
     */
    public boolean isFull() {
        return students.size() == capacity;
    }
    
    /**
     * @post Return the number of students currently enrolled in this LabClass.
     */
    public int numberOfStudents()
    {
        return students.size();
    }
    
    /**
     * @post Set the room number for this LabClass.
     */
    public void setRoom(String roomNumber)
    {
        room = roomNumber;
    }
    
    /**
     * @post Set the time for this LabClass. The parameter should define the day
     * and the time of day, such as "Friday, 10am".
     */
    public void setTime(String timeAndDayString)
    {
        timeAndDay = timeAndDayString;
    }
    
    /**
     * @post Set the name of the instructor for this LabClass.
     */
    public void setInstructor(String instructorName)
    {
        instructor = instructorName;
    }
    
    /**
     * @post Retorna la lista de los estudiantes de grado
     *   inscriptos en este curso.
     */
    public List<Student> getEstudiantesGrado()
    {

    }
    
    /**
     * @post Retorna la lista de los estudiantes de posgrado
     *   inscriptos en este curso.
     */
    public List<Student> getEstudiantesPosgrado()
    {

    }

}
