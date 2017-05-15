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
    protected int numeroDePuertas;
    protected boolean esVehiculoDeServicioPublico;
    protected TipoCombustible tipoDeCombustible;
    private int kilometros;
    private Date fechaDeFabricacion;
    private TipoDeVehiculo tipoDeVehiculo;
    private String modelo;
    private String matricula;
    private List<TareaDeMantenimiento> listaDeTareasDeMantenimiento;
    
    public Vehiculo(String matricula, String modelo, TipoCombustible tipoCombustible)
    {
        listaDeTareasDeMantenimiento = new ArrayList<TareaDeMantenimiento>();
        this.matricula = matricula;
        this.modelo = modelo;
        this.tipoDeCombustible = tipoCombustible;
    }
    public String getMatricula()
    {
        return matricula;
    }
    public String getModelo()
    {
        return modelo;
    }
    
    public int getNumeroDeRuedas() {
        return numeroDeRuedas;
    }
    public int getNumeroDePuertas()
    {
        return numeroDePuertas;
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
        return listaDeTareasDeMantenimiento;
    }
}
