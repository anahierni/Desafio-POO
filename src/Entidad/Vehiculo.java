/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" (En tipo, vamos a indicar si es un
*automóvil, una motocicleta, o una bicicleta). El vehículo debe tener los métodos de moverse y frenar:
* Moverse: Es la cantidad de metros que avanzará por segundo
 * @author Usuario
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private int ano;
    private String tipo;
    private Scanner leer=new Scanner(System.in);
  /*  public Vehiculo(String marca, String modelo, int ano, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.tipo = tipo;
    }

   /* public Vehiculo() {
    } */
    public void crearVehiculo(){
        System.out.println("Ingrese la marca del vehiculo");
        this.marca=leer.nextLine();
         System.out.println("Ingrese el modelo del vehiculo");
        this.modelo=leer.nextLine();
        System.out.println("Ingrese el año del vehiculo");
        this.ano=leer.nextInt();
        System.out.println("Ingrese el tipo (automovil-motocicleta-bicicleta) del vehiculo");
        this.tipo=leer.nextLine();
        this.tipo=leer.nextLine();
    }
    public int moverse(int segundos) {
        
        switch (tipo) {

            case "automovil":

                System.out.println("el automovil avanzó " + 3 * segundos);
                
                return 3*segundos;
            case "motocicleta":
                System.out.println(" la moto  avanzó" + 2 * segundos);
                 return 2 * segundos;
            case "bicicleta":
                System.out.println(" la bici  avanzó " + 1 * segundos);
                 return segundos;
                
            default:
                System.out.println("No ingreso un tipo válido");
                return 0;

        }

    }

    public int frenar(int metros){
         switch (tipo) {

            case "automovil":

                System.out.println("Contando el frenado el automovil avanzó " +(metros+2));
                return metros+2;
            case "motocicleta":
                System.out.println("Contando la moto frenado avanzó " + (metros+2));
                return metros+2;
            case "bicicleta":
                System.out.println("Contando la bici frenado avanzó" + metros);
                return metros;
            default:
                System.out.println("No ingreso un tipo válido");
                return 0;

        }
         
    }
}
