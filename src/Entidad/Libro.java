/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
// *ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío.
 * @author Usuario
 */
public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int NumPag;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int NumPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.NumPag = NumPag;
        
    }

  
    
    public void cargarlibro(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); ///ese usedelimiter lo use porque no me dejaba escribir NIIDEA
        
        System.out.println("Ingrese ISBN del libro");
        isbn = leer.nextInt();
        
        System.out.println("Ingrese titulo del libro");
        titulo = leer.next();
        
        System.out.println("Ingrese autor del libro");
        autor = leer.next();
        
        System.out.println("Ingrese número de páginas del libro");
        NumPag = leer.nextInt();
      
    }
    
    public void mostrarLibro(){
         System.out.println("El ISBN del libro es "+isbn);
         System.out.println("El titulo del libro es "+titulo);
         System.out.println("El autor del libro es "+autor);
         System.out.println("El num de pag del libro es "+NumPag);
    }
    
}
