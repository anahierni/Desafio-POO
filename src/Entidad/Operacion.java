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
public class Operacion {
    private float numero1;
    private float numero2;
private  Scanner leer = new Scanner(System.in);
    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public float getNumero1() {
        return numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){ 
        System.out.println("Ingrese los números");
        numero1= leer.nextFloat();
        numero2=leer.nextFloat();
    }
    public float Sumar(float n , float m){
     float suma=n+m;
      return suma;
    }
     public float Restar(float  n , float  m){
      float  resta=n-m;
      return resta;
    }
      public float  Multiplicar(float  n ,float  m){
          if (n==0 || m==0){
              System.out.println("Uno de los números es cero");
              return 0;
          } else {
             float  mult=n*m;
      return mult; 
          }
      }
       

    public float  Division(float  n, float  m){
        if (m == 0) {
            System.out.println("No se puede dividir por cero");
            return 0;
        } else {
           float  divid = n / m;
            return divid;
        }
    }
    
}
