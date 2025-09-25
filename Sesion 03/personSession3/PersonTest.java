

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PersonTest.
 *
 * @author  (Surya N. Stasiak Vega)
 * @version (2025.09.25)
 */
public class PersonTest
{
    /**
     * Pruebas de setAge en el rango [0-120)
     * Escenarios o casos de prueba:
     * 1.- Parametro edad sea < 0 --> Lanza una excepción
     * 2.- Parametro edad sea = 120 --> Lanza una excepción
     * 3.- Parametro edad sea > 120 --> Lanza una excepción
     * 4.- Parametro edad sea > 0 && < 120 --> Cambia la edad
     * 5.- Parametro edad sea = 0 --> Cambia la edad
     */
    /*
     * Disposicion alternativa:
     * 1.- Parametro sea < 0 --> error
     * 2.- Parametro sea 0 <= edad < 120 --> modifica
     * 3.- Parametro sea >=120 --> error
     */
    /**
     * caso 1
     */
    @Test
    public void setAgeBelowLimit(){
        Person person1 = new Person(20);
        try {
            person1.setAge(-3);
            fail("Deberia haber fallado");
        } catch (RuntimeException e) {
            assertEquals("Illegal age input.", e.getMessage());
        }
    }
    
    /**
     * caso 2
     */
    @Test
    public void setAgeOverLimit(){
        Person person1 = new Person(20);
        try {
            person1.setAge(120);
            fail("Deberia haber fallado");
        } catch (RuntimeException e) {
            assertEquals("Illegal age input.", e.getMessage());
        }
    }
    
    /**
     * caso 3
     */
    @Test
    public void setAgeOverrLimit(){
        Person person1 = new Person(20);
        try {
            person1.setAge(1800);
            fail("Deberia haber fallado");
        } catch (RuntimeException e) {
            assertEquals("Illegal age input.", e.getMessage());
        }
    }
    
    /**
     * caso 4
     */
    @Test
    public void setAgeInsideLimit(){
        Person person1 = new Person(20);
        person1.setAge(25);
        assertEquals(25, person1.getAge());
    }
    
    /**
     * caso 2
     */
    @Test
    public void setAgeBottomLimit(){
        Person person1 = new Person(20);
        person1.setAge(0);
        assertEquals(0, person1.getAge());
    }
}
