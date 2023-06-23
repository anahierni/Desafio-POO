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
public class Circunferencia {
    private double radio;
    private  Scanner leer = new Scanner(System.in);
    
    public Circunferencia (double radio){
        this.radio=radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void crearCircunferencia(){
        ///ese usedelimiter lo use porque no me dejaba escribir NIIDEA
        
        System.out.println("Ingrese el radio de la circunferencia");
        radio = leer.nextDouble();
    }
    
     public double Area(double radio){
      double area=Math.PI*radio*radio;
      return area;
    }
     public double Perimetro(double radio){
      double perimetro=Math.PI*radio*2;
      return perimetro;
    }
}
