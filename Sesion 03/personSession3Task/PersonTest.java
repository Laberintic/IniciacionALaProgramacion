




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
    
    /**
     * Tests para el metodo getCriticalAge.
     * Casos:
     * 1.- Edad menor que 18 -> edad que falta hasta los 18
     * 2.- Edad == 18 -> años que le quedan hasta los 65
     * 3.- Edad entre 18 y 65 -> años que le quedan hasta los 65
     * 4.- Edad == 65 -> años que han trascurrido desde los 65
     * 5.- Edad mayor que 65 -> años que han trascurrido desde los 65
     */

    /**
     * caso 1 
     */
    @Test
    public void getCriticalAgeUnderage() {
      Person person1 = new Person();
      person1.setAge(5);
      int result = person1.getCriticalAge();

      assertEquals(18 - 5, result);
    }
    
    /**
     * caso 2
     */
    @Test
    public void getCriticalAgeAtEighteen() {
      Person person1 = new Person();
      person1.setAge(18);
      int result = person1.getCriticalAge();

      assertEquals(65 - 18, result);
    }
    /**
     * caso 3
     */
    @Test
    public void getCriticalAgeAdult() {
      Person person1 = new Person();
      person1.setAge(20);
      int result = person1.getCriticalAge();

      assertEquals(65 - 20, result);
    }
    
    /**
     * caso 4
     */
    @Test
    public void getCriticalAgeAtSixtyFive() {
      Person person1 = new Person();
      person1.setAge(65);
      int result = person1.getCriticalAge();

      assertEquals(0, result);
    }

    /**
     * caso 5
     */
    @Test
    public void getCriticalAgeRetired() {
      Person person1 = new Person();
      person1.setAge(70);
      int result = person1.getCriticalAge();

      assertEquals(70 - 65, result);
    }

    /**
     * Tests for method getHashCode:
     * cases:
     * solo haremos un caso - Pedro Pascal, con 3 años.
     */
    @Test
    public void getHashCodeTest() {
        Person person1 = new Person(3, "Pedro", "Pascal", false);
        String result = person1.getHashCode();
        
        assertEquals("3-PEDRO-5-PASCAL-6", result);
    }
}
