
/**
 * Clase Person, que define una persona.
 * 
 * Sesión 1: nombre y edad como propiedades. Metodos get/set.
 * 
 * Tarea Sesión 1: apellidos y genero como propiedades. Metodos get/set.
 * 
 * Sesión 2: 
 * 
 * 
 * @author Surya N. Stasiak Vega
 * @version 2025.09.18
 */

/*
 * "Code is art and therefore should be interpretative and not documented"
 *                                                      - not Linus Torvalds
 */
public class Person
{
    public final static int MIN_AGE = 0;
    public final static int MAX_AGE = 120;
    
    public final static boolean GENDER_MALE = false;
    public final static boolean GENDER_FEMALE = true;
    
    // instance variables - replace the example below with your own
    private int age;
    private String name;
    private String surname; 
    private boolean gender; // true for female and false for male

    /**
     * Constructor for objects of class Person, gives initial value to the object.
     *      |
     * Se denomina "Constructor por defecto" pues no tiene parametros.
     */
    public Person()
    {
        // initialise instance variables
        age = 18;
        name = "Pedro";
        surname = "Fernandez";
        gender = GENDER_MALE;
    }
    
    /**
     * Método setAge, modifica la edad.
     *
     * @param newAge la nueva edad, ha de estar entre MIN_AGE y MAX_AGE.
     */
    public void setAge(int newAge) { // <- this part is called "cabecera" or "signatura"
        checkParam(newAge >= MIN_AGE && newAge < MAX_AGE, "Illegal age input.");
        age = newAge;
    }
    
    /**
     * Modifica o cambia el valor del nombre.
     * 
     * @param newName El nuevo valor del nombre, ha de ser String no vacia.
     */
    public void setName(String newName) {
        checkParam(newName != "" && newName != null, "Name cannot be the empty string.");
        name = newName;
    }
    
    
    /**
     * Modifica el valor del apellido.
     *
     * @param newSurname El nuevo valor del apellido, ha de ser String no vacio.
     */
    public void setSurname(String newSurname) {
        checkParam(newSurname != "" && newSurname != null, "Surname cannot be the empty string.");
        surname = newSurname;
    }
    
    /**
     * Modifica el valor del genero.
     *
     * @param newGender Boolean, true = mujer, false = hombre.
     */
    public void setGender(boolean newGender) {
        gender = newGender;
    }
    
    /**
     * Retorna el valor del apellido.
     *
     * @return El apellido en forma de String.
     */
    public String getSurname() {
        return surname;
    }
    
    /**
     * Retorna el valor del genero.
     *
     * @return Booleano que representa el genero: true = mujer, false = hombre
     */
    public boolean getGender() {
        return gender;
    }

    /**
     * Retorna la edad.
     *
     * @return La edad en forma de int.
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Retorna el valor del nombre.
     *
     * @return El nombre en forma de String.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Muestra por consola una cadena con informacion sobre la edad de la persona.
     *
     */
    public void printAge() {
        // aqui en vez de usar getAge() tb puedes usar age. (menos gasto computacional??)
        System.out.println("My age is " + getAge() + 
                    " pero el año que viene tendre " + (getAge() + 1) + ".");
    }
    
    /**
     * Devuelve una cadena que contenga la información de un objeto persona.
     * Para la propiedad gender debe mostrar el texto "masculino" o "femenino".
     * 
     * @return la cadena con la representacion textual del objeto.
     */
    public String toString() {
        return "Nombre " + getName()
            + "; Apellidos: " + getSurname()
            + "; Edad: " + getAge()
            + "; Género: " + genderToString();
    }
    
    /**
     * Devuelve el genero en forma de string.
     * 
     * @return String "masculino"/"femenino"
     */
    private String genderToString() {
        if (getGender()) return "femenino";
        return "masculino";
    }
    
    /**
     * Se usa para validar parametros. Si no se cumple la condiciom,
     * el parametro no es valido y se
     * lanza una excepcion indicando el motivo del error.
     * 
     * @param condition Condicion a evaluar (tipo boolean).
     * @param error_message String con el mensaje de error.
     */    
    private void checkParam(boolean condition, String error_message) {
        if (condition) return; // se podria hacer a la inversa, pero me parece mas ordenado asi.
        throw new RuntimeException(error_message);        
    }
    
    
}
