
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
        int PRIMER = 0;
        int SEGUNDO = 2;
        int TERCER = 3;
        System.out.println(nombre.substring(PRIMER,TERCER) + primerApellido.substring(PRIMER,TERCER) + " " + 
        segundoApellido.substring(PRIMER,SEGUNDO) +  ciudadDeNacimiento.substring(PRIMER,TERCER));
    }
}
