
/**
 * Write a description of class Tree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private String typeOfTree;
    private int maxNumberOfFlowers;
    private int numberOfFlowers;
    private int numberOfFruits;

    /**
     * Constructor for objects of class Tree
     */
    public Tree()
    {
        typeOfTree = "Manzano";
        maxNumberOfFlowers = 25;
        numberOfFlowers = 7;
        numberOfFruits = 3;
        
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
        typeOfTree = treeName;
    }
    
    /**
     * Metodo get para el atributo numero maximo de flores
     * 
     * @returns numero maximo de floes (int)
     */
    public int getMaxFlowers() {
        return maxNumberOfFlowers;
    }
    
    /**
     * Metodo set para el atributo numero maximo de flores
     * 
     * @param num cantidad maxima de flores (int)
     */
    public void setMaxFlowers(int num) {
        maxNumberOfFlowers = num;
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
        numberOfFruits = num;
    }
    
    public String toString() {
        return typeOfTree + "-" + maxNumberOfFlowers + "-" + numberOfFlowers + "-" +
                numberOfFruits;
    }
    
    public void print() {
        System.out.println("Valores de las propiedades del arbol: " + toString());
    }
}
