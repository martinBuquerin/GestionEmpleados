
package Dominio;
import Principal.Principal;
/**
 *
 * @author Martín
 */
public class Persona {
    private String nombre;
    private String apellido;
  
    
    public Persona() {
       Principal.contador++;
    }

    public Persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }




    
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", contador=").append(Principal.contador);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
    
}
