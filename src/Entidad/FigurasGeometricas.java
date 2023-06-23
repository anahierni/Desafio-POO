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
public class FigurasGeometricas {
    private int lado1;
    private int lado2;
    private int lado3;
    private int altura;
    private String opcion;
    Scanner leer= new Scanner(System.in);
    public void crearFigura(){
        System.out.println("Seleccione la figura que desea calcular área y perímetro");
        System.out.println("A- Cuadrado");
        System.out.println("B- Rectángulo");
        System.out.println("C- Triángulo");
        System.out.println("D-Circulo");
        System.out.println("E - Hexagono");
        System.out.println("F- Pentagono");
        System.out.println("G - Rombo");
        opcion=leer.nextLine(); 
        opcion=opcion.toUpperCase();
        switch (opcion){
            case "A": System.out.println("Ingrese la medida del lado del cuadrado");
                      lado1=leer.nextInt();
                      break;
            case "B": System.out.println("Ingrese la medida de los lados del rectángulo");
                      lado1=leer.nextInt();
                      lado2=leer.nextInt();
                      break;
            case "C": System.out.println("Ingresa la base y la altura del triángulo");
            lado1=leer.nextInt();
            altura=leer.nextInt();
                System.out.println("Ingrese los lados restantes");
                      lado2=leer.nextInt(); 
                      lado3=leer.nextInt();
                      break;
            case "D": System.out.println("Ingrese el radio del circulo"); 
                       lado1=leer.nextInt();
                       break;
            case "E": System.out.println("Ingrese la medida del lado del hexagono regular");
                      lado1=leer.nextInt();
                      System.out.println("Ingrese la apotema del hexagono");
                      lado2=leer.nextInt();
                      break;
            case "F": System.out.println("Ingrese la medida del lado del pentagono regular");
                      lado1=leer.nextInt();
                      System.out.println("Ingrese la apotema del pentagono");
                      lado2=leer.nextInt();
                      break;
            case "G": System.out.println("Ingrese la medida del lado del rombo");
                      lado1=leer.nextInt();
                      System.out.println("Ingrese las diagonales del rombo");
                      lado2=leer.nextInt();
                      lado3=leer.nextInt();
                      break;
        }
    }
    
    public double perimetro (){
        
    double perimetro;
        switch (opcion){
            case "A": perimetro=4*lado1;
                      return perimetro;
            case "B": perimetro=2*lado1+2*lado2;
                      return perimetro;
                      
            case "C": perimetro=lado1+lado2+lado3;
                      return perimetro;
            case "D": perimetro=2*Math.PI*lado1;
             return perimetro;
            case "E": perimetro=6*lado1;
             return perimetro;
                     
            case "F": perimetro=5*lado1;
             return perimetro;
            case "G": perimetro=4*lado1;
             return perimetro;
            default: return 0;
    }
}
    
    public double area (){
        
    double area;
        switch (opcion){
            case "A": area=lado1*lado1;
                      return area;
            case "B": area=lado1*lado2;
                      return area;
                      
            case "C": area=lado1*altura/2;
                      return area;
            case "D": area=Math.PI*(lado1*lado1);
             return area;
            case "E": area=3*lado1*lado2;
             return area;
                     
            case "F": area=(5*lado1*lado2)/2;
             return area;
            case "G": area=lado2*lado3/2;
             return area;
            default: return 0;
    }
}
}