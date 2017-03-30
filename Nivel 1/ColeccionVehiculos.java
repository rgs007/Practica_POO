import java.util.*;
/**
 * Write a description of class ColeccionVehiculos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ColeccionVehiculos
{
    // instance variables - replace the example below with your own
    private List<Vehiculo> listaDeVehiculos;

    /**
     * Constructor for objects of class ColeccionVehiculos
     */
    public ColeccionVehiculos()
    {
       listaDeVehiculos = new ArrayList<Vehiculo>();
    }

    public void AgregarVehiculo(Vehiculo vehiculo)
    {
        listaDeVehiculos.add(vehiculo);
    }
    public void BorrarVehiculo(Vehiculo vehiculo)
    {
        listaDeVehiculos.remove(vehiculo);
    }
}
