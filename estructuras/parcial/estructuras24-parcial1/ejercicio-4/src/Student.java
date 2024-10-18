package src;

/**
 * The Student class represents a student in a student administration system.
 * It holds the student details relevant in our context.
 */
public abstract class Student
{
    // the student's full name
    private String name;
    // the student ID
    private String id;
    // the amount of credits for study taken so far
    private int credits;

    /**
     * @pre name.length() > 4 && id.length > 3
     * @post Create a new student with a given name and ID number.
     */
    public Student(String fullName, String studentID)
    {
        name = fullName;
        id = studentID;
        credits = 0;
    }

    /**
     * @post Return the full name of this student.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @post Set a new name for this student.
     */
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    /**
     * @post Return the student ID of this student.
     */
    public String getStudentID()
    {
        return id;
    }

    /**
     * @pre additionalPoints > 0
     * @post Add some credit points to the student's accumulated credits.
     */
    public void addCredits(int additionalPoints)
    {
        credits += additionalPoints;
    }

    /**
     * @post Return the number of credit points this student has accumulated.
     */
    public int getCredits()
    {
        return credits;
    }

    /**
     * @post Return the login name of this student. The login name is a combination
     * of the first four characters of the student's name and the first three
     * characters of the student's ID number.
     */
    public String getLoginName()
    {
        return name.substring(0,4) + id.substring(0,3);
    }
    
    /**
     * @post Print the student's name and ID number to the output terminal.
     */
    public void print()
    {
        System.out.println(name + ", student ID: " + id + ", credits: " + credits);
    }
    
    /**
     * @post Retorna true si y solo si es un estudiante de grado.
     */
    public abstract boolean deGrado();
    
    /**
     * @post Returns true if and only if 'obj' is equal to 'this'.
     */
    public boolean equals(Object obj)
    {

    }
    
    /**
     * @post Returns the hash code for object 'this'.
     */
    public int hashCode()
    {
        int result = 17; // An arbitrary starting value.
        // Make the computed value depend on the order in which
        // the fields are processed.
        result = 37 * result + name.hashCode();
        result = 37 * result + id.hashCode();
        result = 37 * result + (deGrado() ? 1 : 0);
        return result;
    }
}
