/*
crear clase persona con nombre apellido nombre id y ademas deberemos de tener un contador
 */
package Principal;

import Dominio.Persona;

/**
 *
 * @author Martín
 */
public class Principal {
    
     public static int contador=0;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        Persona per1 = new Persona("martin","buquerin");
        System.out.println(contador);
        Persona per2 = new Persona("ma","buq");
        System.out.println(contador);
        Persona per3 = new Persona("martin","bun");
        System.out.println(contador);
        System.out.println(per1);
        System.out.println(per2);
        System.out.println(per3);
        
    }
    
}
