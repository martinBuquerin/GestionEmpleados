/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        
    }
    
}
