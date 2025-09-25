
/**
 * Clase Person, que define una persona.
 * 
 * Sesión 1: nombre y edad como propiedades. Metodos get/set.
 * 
 * Tarea Sesión 1: apellidos y genero como propiedades. Metodos get/set.
 * 
 * Sesión 2: 
 * Metodos checkParam, print y toString.
 * Constantes MIN_AGE, MAX_AGE, GENDER_MALE, GENDER_FEMALE
 * 
 * Tarea Sesión 2:
 * getCriticalAge, ADULTHOOD_AGE y RETIREMENT_AGE
 * 
 * Sesión 3:
 * Significado de static, añadir mas constructores, operator this, test con JUnit
 * 
 * 
 * @author Surya N. Stasiak Vega
 * @version 2025.09.25
 */

public class Person
{
    // static hace que el atb se guarde en la clase y no en el objeto.
    public final static int MIN_AGE = 0;
    public final static int MAX_AGE = 120;
    
    public final static boolean GENDER_MALE = false;
    public final static boolean GENDER_FEMALE = true;
    
    public final static int ADULTHOOD_AGE = 18;
    public final static int RETIREMENT_AGE = 65;
    
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
     * Constructor for objects of class Person. Requiere el parametro de la edad, el resto los pone por defecto.
     * 
     * @param age la edad
     */
    public Person(int age) {
        this(); // esto llama al constructor sin parametros (es equivalente a llamar Person() desde fuera del objeto)
        setAge(age);
    }
    
    /**
     * Constructor for objects of class Person. Requiere todos los parametros.
     * 
     * @param age la edad
     * @param name el nombre
     * @param surname el apellido
     * @param gender el genero
     */
    public Person(int age, String name, String surname, boolean gender) {
        setAge(age); 
        setName(name); 
        setSurname(surname); 
        setGender(gender);
    }
    
    /**
     * Método setAge, modifica la edad.
     *
     * @param  age, la nueva edad, ha de estar entre MIN_AGE y MAX_AGE.
     */
    public void setAge(int age) { // <- this part is called "cabecera" or "signatura"
        checkParam(age >= MIN_AGE && age < MAX_AGE, "Illegal age input.");
        this.age = age;
    }
    
    /**
     * Modifica o cambia el valor del nombre.
     * 
     * @param name El nuevo valor del nombre, ha de ser String no vacia.
     */
    public void setName(String name) {
        checkParam(name != "" && name != null, "Name cannot be the empty string.");
        this.name = name;
    }
    
    
    /**
     * Modifica el valor del apellido.
     *
     * @param surname El nuevo valor del apellido, ha de ser String no vacio.
     */
    public void setSurname(String surname) {
        checkParam(surname != "" && surname != null, "Surname cannot be the empty string.");
        this.surname = surname;
    }
    
    /**
     * Modifica el valor del genero.
     *
     * @param gender Boolean, true = mujer, false = hombre.
     */
    public void setGender(boolean gender) {
        if (gender) this.gender = GENDER_FEMALE;
        if (!gender) this.gender = GENDER_MALE;
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
        return "Nombre " + getName().toUpperCase()
            + "; Apellidos: " + getSurname().toUpperCase()
            + "; Edad: " + getAge()
            + "; Género: " + genderToString();
    }
    
    /**
     * Devuelve un numero dependiendo de la edad de la persona:
     *  - Si la persona tiene menos de 18 años, devuelve los años que le quedan hasta los 18
     *  - Si la persona tiene entre 18 y 65, los que le quedan para llegar a los 65
     *  - Si tiene mas de 65, los años que han trascurrido desde entonces
     * 
     * @return la cantidad de años, en int
     */
    public int getCriticalAge() {
        int currentAge = getAge();
        if (currentAge < ADULTHOOD_AGE) {
            return ADULTHOOD_AGE - currentAge;
        } else if (currentAge >= ADULTHOOD_AGE && currentAge < RETIREMENT_AGE) {
            return RETIREMENT_AGE - currentAge;
        } else {
            return currentAge - RETIREMENT_AGE;
        }
    }
    
    public String getHashCode() {
        return getAge() + "-"
            + getName().toUpperCase() + "-"
            + getName().length() + "-"
            + getSurname().toUpperCase() + "-"
            + getSurname().length();
        // maybe its more efficient to store name and surname in varibales
        // isntead of calling getName/Surname twice...
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
