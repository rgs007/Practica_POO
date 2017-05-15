/**
 * Abstract class Usuario - write a description of the class here
 * 
 * @author Ricardo García
 * @version 15/05/2017
 */
public abstract class Usuario
{
   private String nombre;
   private String telefono;
   
   public Usuario(String nombre, String telefono)
   {
       this.nombre = nombre;
       this.telefono = telefono;
   }
   
   public String getNombre()
   {
       return nombre;
   }
   public String getTelefono()
   {
       return telefono;
   }
}
