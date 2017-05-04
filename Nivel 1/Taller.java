import java.util.*;
/**
 * Write a description of class Taller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class taller
{
     
    // instance variables - replace the example below with your own
    private List<Vehiculo> listaDeVehiculos;
    private List<Revision> listaDeRevisiones;
    private List<Cliente> listaDeClientes;
    private List<Mecanico> listaDeMecanicos;
    private Comercial comercialDelTaller;
    private JefeDeTaller JefeDeTaller;
    
    /**
     * Constructor for objects of class Taller
     */
    public taller()
    {
        // initialise instance variables
        this.listaDeVehiculos = new ArrayList<Vehiculo>();
        this.listaDeRevisiones = new ArrayList<Revision>();
        this.listaDeClientes = new ArrayList<Cliente>();
        this.listaDeMecanicos = new ArrayList<Mecanico>();
    }
    Vehiculo darDeAltaVehiculo(String matricula, TipoDeVehiculo tipoDeVehiculo, Cliente cliente)
    {
        Vehiculo vehiculo = null;
        switch(tipoDeVehiculo)
        {
            case MOTO:
                vehiculo = new Moto(){ };
                listaDeVehiculos.add(vehiculo);
                cliente.agregarVehiculo(vehiculo);
                break;
            case COCHE:
                vehiculo = new Moto(){ };
                listaDeVehiculos.add(vehiculo);
                cliente.agregarVehiculo(vehiculo);
                break;
            case COCHESP:
                vehiculo = new Moto(){ };
                listaDeVehiculos.add(vehiculo);
                cliente.agregarVehiculo(vehiculo);
                break;
            case MOTOSP:
                vehiculo = new Moto(){ };
                listaDeVehiculos.add(vehiculo);
                cliente.agregarVehiculo(vehiculo);
                break;
        }
        cliente.agregarVehiculo(vehiculo);
        listaDeVehiculos.add(vehiculo);
        return vehiculo;
    }
    void DarDeAltaCliente(String nif)
    {
        listaDeClientes.add(new Cliente(nif));
    }
    
    void DarDeAltaRevision(Mecanico mecanico, Vehiculo vehiculo, Cliente cliente)
    {
        listaDeRevisiones.add(new Revision(mecanico, vehiculo, cliente));
        
    }
    List<Vehiculo> ObtenerListaVehiculos()
    {
        return listaDeVehiculos;
    }
    List<Cliente> ObtenerListaClientes()
    {
        return listaDeClientes;
    }
    
    Revision ObtenerSiguienteRevision(Mecanico mecanico)
    {
        for(Revision revision : listaDeRevisiones)
        {
            if(revision.getEstadoRevision() == EstadoRevision.PENDIENTE && revision.getMecanicoAsignado() == mecanico)
             return revision;
        }
        
        return null;
    }

    
}
