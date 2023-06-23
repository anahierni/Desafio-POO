/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import Entidad.Vehiculo;

/**
 *
 * @author Usuario
 */
public class Ejer1_Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo auto = new Vehiculo();
        Vehiculo moto = new Vehiculo();
        Vehiculo bici = new Vehiculo();
        auto.crearVehiculo();
        moto.crearVehiculo();
        bici.crearVehiculo();
       int metrosAut=auto.frenar(auto.moverse(10));
       int metrosMoto=moto.frenar(moto.moverse(300));
       int metrosBici=bici.frenar(bici.moverse(30));
       if ((metrosAut>metrosMoto) && (metrosAut>metrosBici)){
           System.out.println("Lo que más avanzó fue el auto y avanzó "+metrosAut);
    }else if ((metrosMoto>metrosAut) && (metrosMoto>metrosBici)){
        System.out.println("Lo que más avanzó fue la moto y avanzó "+metrosMoto);
    }else if ((metrosBici>metrosAut) && (metrosBici>metrosMoto)){
        System.out.println("Lo que más avanzó fue la bici y avanzó "+metrosBici);
    }
    
}
}