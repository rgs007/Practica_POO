import java.util.*;
import java.io.*;
/**
 * Clase taller, lleva la gestión de todos los elementos que intervienen en un taller.
 * .
 * @author Ricardo García
 * @version 15/05/2017
 */
public class taller
{
     
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
    
    private void guardarDatos()
    {
        SerializeObject(listaDeVehiculos, "vehiculos.ser");
        SerializeObject(listaDeRevisiones, "revisiones.ser");
        SerializeObject(listaDeClientes, "clientes.ser");
        SerializeObject(listaDeMecanicos, "mecanicos.ser");
    }
    
    private void cargarDatos()
    {
        DeserializeObject(listaDeVehiculos, "vehiculos.ser");
        DeserializeObject(listaDeRevisiones, "revisiones.ser");
        DeserializeObject(listaDeClientes, "clientes.ser");
        DeserializeObject(listaDeMecanicos, "mecanicos.ser");
    }
    
    private void SerializeObject(Object e, String rutaDelArchivo)
    {
         try {
         FileOutputStream fileOut =
         new FileOutputStream(rutaDelArchivo);
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in " + rutaDelArchivo);
        }
        catch(IOException i) {
         i.printStackTrace();
        }
    }
    private Object DeserializeObject(Object e, String rutaDelArchivo)
    {
       
      try {
         FileInputStream fileIn = new FileInputStream(rutaDelArchivo);
         ObjectInputStream in = new ObjectInputStream(fileIn);
         e = in.readObject();
         in.close();
         fileIn.close();
      }catch(IOException i) {
         i.printStackTrace();
         return e;
      }catch(ClassNotFoundException c) {
         System.out.println("Class not found");
         c.printStackTrace();
         return null;
      }
      return null;
    }
    public static void main (String [ ] args) 
    {
        taller miTaller = new taller();
        miTaller.cargarDatos();
        ConsoleUI console = new ConsoleUI(miTaller);
        console.mainMenu();
        miTaller.guardarDatos();
    }
    
    Vehiculo darDeAltaVehiculo(Vehiculo vehiculo, Cliente cliente)
    {
        cliente.agregarVehiculo(vehiculo);
        listaDeVehiculos.add(vehiculo);
        return vehiculo;
    }
    void darDeAltaCliente(Cliente cliente)
    {
        listaDeClientes.add(cliente);
    }
    
    void darDeAltaRevision(Vehiculo vehiculo, Cliente cliente)
    {
        listaDeRevisiones.add(new Revision(vehiculo, cliente));
        
    }
    List<Vehiculo> obtenerListaVehiculos()
    {
        return listaDeVehiculos;
    }
    List<Cliente> obtenerListaClientes()
    {
        return listaDeClientes;
    }
    
    Revision obtenerSiguienteRevision(Mecanico mecanico)
    {
        for(Revision revision : listaDeRevisiones)
        {
            if(revision.getEstadoRevision() == EstadoRevision.PENDIENTE && revision.getMecanicoAsignado() == mecanico)
             return revision;
        }
        
        return null;
    }
    
    List<Revision> obtenerListaRevisionesPendientes(Mecanico mecanico)
    {
        ArrayList<Revision> listaDeRevisionesPendientes = new ArrayList<Revision>();
        for(Revision revision : listaDeRevisiones)
        {
            if(revision.getEstadoRevision() == EstadoRevision.PENDIENTE && revision.getMecanicoAsignado() == mecanico)
             listaDeRevisionesPendientes.add(revision);
        }
        
        return listaDeRevisionesPendientes;
    }
    
    List<Revision> obtenerListaRevisionesPendientes()
    {
        ArrayList<Revision> listaDeRevisionesPendientes = new ArrayList<Revision>();
        for(Revision revision : listaDeRevisiones)
        {
            if(revision.getEstadoRevision() == EstadoRevision.PENDIENTE)
             listaDeRevisionesPendientes.add(revision);
        }
        
        return listaDeRevisionesPendientes;
    }
    
    List<Revision> obtenerListaRevisionesRealizadas()
    {
        ArrayList<Revision> listaDeRevisionesRealizadas = new ArrayList<Revision>();
        for(Revision revision : listaDeRevisiones)
        {
            if(revision.getEstadoRevision() == EstadoRevision.COMPLETADA)
             listaDeRevisionesRealizadas.add(revision);
        }
        
        return listaDeRevisionesRealizadas;
    }
    List<Vehiculo> obtenerListaVehiculosRevisados()
    {
        ArrayList<Vehiculo> listaDeVehiculosRevisados = new ArrayList<Vehiculo>();
        for(Revision revision : listaDeRevisiones)
        {
            if(revision.getEstadoRevision() == EstadoRevision.COMPLETADA)
             listaDeVehiculosRevisados.add(revision.getVehiculo());
        }
        
        return listaDeVehiculosRevisados;
    }
    List<Revision> obtenerListaRevisiones()
    {
        return listaDeRevisiones;
    }
    List<Mecanico> getListaMecanicos()
    {
        return listaDeMecanicos;
    }
    
}
