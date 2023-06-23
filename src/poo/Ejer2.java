/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Circunferencia;

/**
 *
 * @author Usuario
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Circunferencia circ =new Circunferencia(3);
        circ.crearCircunferencia();
        double radio=circ.getRadio();
       double area=circ.Area(radio);
      double perimetro=circ.Perimetro(radio);
        System.out.println(area+"   "+perimetro);
        
        
    }
    
}
