import java.util.*;
/**
 * Write a description of class Revision here.
 * 
 * @author Ricardo García
 * @version 15/05/2017
 */
public class Revision
{
    // instance variables - replace the example below with your own
    private Mecanico mecanico;
    private Vehiculo vehiculo;
    private Cliente cliente;
    private List<TareaDeMantenimiento> tareaMantenimiento;
    private EstadoRevision estadoRevision;

    /**
     * Constructor for objects of class Revision
     */
    public Revision(Vehiculo vehiculo, Cliente cliente)
    {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.tareaMantenimiento = new ArrayList<TareaDeMantenimiento>();
    }
    
    public Vehiculo getVehiculo()
    {
        return vehiculo;
    }
    public Cliente getCliente()
    {
        return cliente;
    }
    
    public EstadoRevision getEstadoRevision()
    {
        return estadoRevision;
    }
    public void setEstadoRevision(EstadoRevision estadoRevision)
    {
        this.estadoRevision = estadoRevision;
    }
    public void setMecanicoAsignado(Mecanico mecanico)
    {
        this.mecanico = mecanico;
    }
    public Mecanico getMecanicoAsignado()
    {
        return mecanico;
    }
    
}
