/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Persona;

/**
 *
 * @author Usuario
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso1=new Persona("Agustina");
        Persona perso2=new Persona();
       perso1.getNombre();
       perso1.setEdad(15);
       perso1.setNombre("PErla");
        System.out.println(perso1.edad+" "+perso1.nombre);
      
        
    }
    
}
