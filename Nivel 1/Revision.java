import java.util.*;
/**
 * Write a description of class Revision here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
    public Revision(Mecanico mecanico, Vehiculo vehiculo, Cliente cliente)
    {
        // initialise instance variables
        this.mecanico = mecanico;
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.tareaMantenimiento = new ArrayList<TareaDeMantenimiento>();
    }
    
    public EstadoRevision getEstadoRevision()
    {
        return estadoRevision;
    }
    public void setEstadoRevision(EstadoRevision estadoRevision)
    {
        this.estadoRevision = estadoRevision;
    }
    public Mecanico getMecanicoAsignado()
    {
        return mecanico;
    }
    
}
