
/**
 * Write a description of class Moto here.
 * 
 * @author Ricardo García
 * @version 15/05/2017
 */
public class Moto extends Vehiculo
{

    /**
     * Constructor for objects of class Moto
     */
    public Moto(String matricula, String modelo, TipoCombustible tipoCombustible)
    {
        super(matricula, modelo, tipoCombustible);
        this.numeroDeRuedas = 2;
        this.numeroDePuertas = 0;
    }

}
