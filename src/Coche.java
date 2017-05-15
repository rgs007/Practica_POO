
/**
 * Write a description of class Coche here.
 * 
 * @author Ricardo García
 * @version 15/05/2017
 */
public class Coche extends Vehiculo
{

    /**
     * Constructor for objects of class Coche
     */
    public Coche(String matricula, String modelo, TipoCombustible tipoCombustible)
    {
        super(matricula, modelo, tipoCombustible);
        this.numeroDeRuedas = 4;
        this.numeroDePuertas = 4;
    }

    
}
