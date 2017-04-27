import java.util.*;


/**
 * Abstract class Vehiculo - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Vehiculo
{
    protected int numeroDeRuedas;
    protected boolean esVehiculoDeServicioPublico;
    protected TipoCombustible tipoDeCombustible;
    private int kilometros;
    private Date fechaDeFabricacion;
    private TipoDeVehiculo tipoDeVehiculo;
    
    public int getNumRuedas() {
        return numeroDeRuedas;
    }

    public boolean getEsVehiculoDeServicioPublico() {
        return esVehiculoDeServicioPublico;
    }
    public TipoDeVehiculo getTipoDeVehiculo()
    {
        return tipoDeVehiculo;
    }
    
    public TipoCombustible getTipoCombustible()
    {
        return tipoDeCombustible;
    }
    public void setFechaDeFabricacion(Date value)
    {
        fechaDeFabricacion = value;
    }
    public Date getFechaFabricacion()
    {
        return fechaDeFabricacion;
    }
    
    public void setKilometros(int value)
    {
        kilometros = value;
    }
    
    public int getKilometros()
    {
        return kilometros;
    }
    
    public List<TareaDeMantenimiento> getTareasDeMantenimiento()
    {
        return null;
    }
}
