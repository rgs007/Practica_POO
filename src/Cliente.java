import java.util.*;
/**
 * Write a description of class Cliente here.
 * 
 * @author Ricardo García
 * @version 15/05/2017
 */
public class Cliente extends Usuario
{
    // instance variables - replace the example below with your own
   private List<Vehiculo> listaDeVehiculos;
   private String nif;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nombre, String telefono, String nif)
    {
       super(nombre, telefono);
        // initialise instance variables
       listaDeVehiculos = new ArrayList<Vehiculo>();
       this.nif = nif;
    }

    /**
     * Agrega un vehículo al usuario
     */
    public void agregarVehiculo(Vehiculo vehiculo)
    {
        listaDeVehiculos.add(vehiculo);
    }
    
    /**
     * Devuelve el NIF
     */
    public String getNIF()
    {
        return nif;
    }
    
    /**
     * Devuelve la lista de vehículos
     */
    public List<Vehiculo> getListaVehiculos()
    {
        return listaDeVehiculos;
    }
}
