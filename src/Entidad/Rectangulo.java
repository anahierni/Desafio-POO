/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Rectangulo {
    private float base;
    private float altura; 
    private Scanner leer=new Scanner(System.in);
    
    public void crearRectangulo(){
        System.out.println("Ingrese la base del rectángulo");
        base=leer.nextFloat();
         System.out.println("Ingrese la altura del rectángulo");
         altura=leer.nextFloat();
    }
}
