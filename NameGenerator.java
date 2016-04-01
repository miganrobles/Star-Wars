
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        // initialise instance variables
    }

    /**
     * Genera un nombre para la película
     */
    public void generateStarWarsName(String nombre, String primerApellido, String segundoApellido, String ciudadDeNacimiento)
    {
        System.out.println(nombre.substring(0,3) + primerApellido.substring(0,3) + " " + segundoApellido.substring(0,2) +  ciudadDeNacimiento.substring(0,3));
    }
}
