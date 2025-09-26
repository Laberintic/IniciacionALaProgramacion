
/**
 * The class for the Tree object.
 *
 * @author Surya N. Stasiak Vega
 * @version 2025.09.26
 */
public class Tree
{
    public static final int MAX_NUMBER_OF_FLOWERS = 12;
    public static final int DEFAULT_NUMBER_OF_FLOWERS = 7;
    public static final int DEFAULT_NUMBER_OF_FRUITS = 3;
    public static final String DEFAULT_TYPE_OF_TREE = "Peral";

    // instance variables - replace the example below with your own
    private String typeOfTree;
    private int numberOfFlowers;
    private int numberOfFruits;

    
    /**
     * Constructor for objects of class Tree
     */
    public Tree()
    {
        typeOfTree = DEFAULT_TYPE_OF_TREE;
        numberOfFlowers = DEFAULT_NUMBER_OF_FLOWERS;
        numberOfFruits = DEFAULT_NUMBER_OF_FRUITSº;
    }
    
    /**
     * Metodo get para el atributo tipo de arbol
     * 
     * @returns String con el tipo de arbol
     */
    public String getType() {
        return typeOfTree;
    }
    
    /**
     * Metodo set para el atributo tipo de arbol
     * 
     * @param name el tipo de arbol
     */
    public void setType(String treeName) {
        checkParam(treeName != "", "String cant be empty");
        typeOfTree = treeName;
    }
    
    /**
     * Metodo get para el atributo numero de flores
     * 
     * @returns numero de flores
     */
    public int getFlowers() {
        return numberOfFlowers;
    }
    
    /**
     * Metodo set para el atributo numero de flores
     * 
     * @param num el numero de flores (int)
     */
    public void setFlowers(int num) {
      checkParam(num >= 0, "Number cant be negative.");
      numberOfFlowers = num;
    }
    
    /**
     * Metodo get para el atributo numero de frutos
     * 
     * @returns numero de frutos
     */
    public int getFruits() {
        return numberOfFruits;
    }
    
    /**
     * Metodo set para el atributo numero de frutos
     * 
     * @param num numero de frutos
     */
    public void setFruits(int num) {
      checkParam(num >= 0, "Number cant be negative.");
      numberOfFruits = num;
    }
    
    public String toString() {
        return typeOfTree + "-" + MAX_NUMBER_OF_FLOWERS + "-" + numberOfFlowers + "-" +
                numberOfFruits;
    }
    
    public void print() {
        System.out.println("Valores de las propiedades del arbol: " + toString());
    }
    
    /**
     * Will increment flowers unless already at the max; if flowers are at max, will decrement them and increment fruits, until those are at max.
     */
    public void water() {
      int currentFlowers = getFlowers();
      int currentFruits = getFruits();
      if (currentFlowers < MAX_NUMBER_OF_FLOWERS) {
        setFlowers(currentFlowers + 1);
      }
      else if (currentFruits < MAX_NUMBER_OF_FLOWERS) {
        setFlowers(currentFlowers - 1);
        setFruits(currentFruits - 1);
      }
    }

    /**
     * Decrements fruit number and returns the result.
     *
     * @return the number of fruits
     */
    public int gatherFruit() {
      setFruits(getFruits() - 1);
      return getFruits();
    } 

    /**
     * Sets fruit number to 0 and returns the "harvested" fruits.
     */
    public int harvest() {
      int currentFruits = getFruits();
      setFruits(0);
      return currentFruits;
    }

    /**
     * checkParam will throw an error when a condition is false.
     *
     * @param contidion if false triggers an error
     * @param errorMessage String with the error msg.
     */
    private void checkParam(boolean condition, String errorMessage) {
      if (condition) return;
      throw new RuntimeException(errorMessage);
    }
} 
