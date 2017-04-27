import java.util.*;
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente extends Usuario
{
    // instance variables - replace the example below with your own
   private List<Vehiculo> listaDeVehiculos;
   private String nif;

    /**
     * Constructor for objects of class Cliente
     */
    public Cliente(String nif)
    {
        // initialise instance variables
       listaDeVehiculos = new ArrayList<Vehiculo>();
       this.nif = nif;
    }

    public void agregarVehiculo(Vehiculo vehiculo)
    {
        listaDeVehiculos.add(vehiculo);
    }
    public String getNIF()
    {
        return nif;
    }
}
