/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Operacion;

/**
 *
 * @author Usuario
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        
        Operacion cuenta1 =new Operacion();
        
        cuenta1.crearOperacion();
        float  num1= cuenta1.getNumero1();
        float  num2=cuenta1.getNumero2();
        System.out.println("LA suma es " + cuenta1.Sumar(num1, num2)+" y la resta  "+cuenta1.Restar(num1, num2));
        System.out.println("La multiplicación es "+cuenta1.Multiplicar(num1, num2)+" la división "+cuenta1.Division(num1, num2));
     
   
}
}
