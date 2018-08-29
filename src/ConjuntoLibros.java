/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
import java.util.Scanner;
public class ConjuntoLibros {
    
    private Libro[] coleccion;
    public ConjuntoLibros(){
    
    this.coleccion= new Libro[4];
    }
    
    public boolean añadirTitulo(Libro libro){
        for (int i = 0; i <this.coleccion.length; i++) {
            if (this.coleccion[i]==null) {
                    return true;
            }
        }
    
    
    }
    public boolean eliminarTitulo(String titulo){
    
    return false;
    }
    public boolean eliminarAutor(String titulo){
    return false;
    
    }
    public Libro[] obtenerTodosLibros(){
    
        return this.coleccion;
    
    }
    

        


}
   
    
}
