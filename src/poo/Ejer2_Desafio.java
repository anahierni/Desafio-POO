/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.FigurasGeometricas;

/**
 *
 * @author Usuario
 */
public class Ejer2_Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FigurasGeometricas g1=new FigurasGeometricas();
        g1.crearFigura();
        double perimetro=g1.perimetro();
        double area=g1.area();
        System.out.println("El perimetro es " + perimetro+" y el área es "+area);
    }
    
}

        