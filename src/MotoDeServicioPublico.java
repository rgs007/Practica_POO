
/**
 * Write a description of class MotoDeServicioPublico here.
 * 
 * @author Ricardo García
 * @version 15/05/2017
 */
public class MotoDeServicioPublico extends Moto
{
    
    /**
     * Constructor for objects of class MotoDeServicioPublico
     */
    public MotoDeServicioPublico(String matricula, String modelo, TipoCombustible tipoCombustible)
    {
        super(matricula, modelo, tipoCombustible);
        this.esVehiculoDeServicioPublico = true;
    }

    
}
