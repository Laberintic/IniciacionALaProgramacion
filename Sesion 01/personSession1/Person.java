
/**
 * Clase Person de la sesion 1.
 * 
 * @author (Surya N. Stasiak Vega) 
 * @version (11.9.2025)
 */
public class Person
{
    // instance variables - replace the example below with your own
    private int age;
    private String name;
    private String surname; 
    private boolean gender; // true for female and false for male

    /**
     * Constructor for objects of class Person
     */
    public Person(int personAge)
    {
        // initialise instance variables
        age = personAge;
        name = "Pedro";
    }
    
    public void setAge(int new_age) {
        age = new_age;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public int getAge() {
        return age;
    }
    
    public String getName() {
        return name;
    }
}
