/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class Libro {
    private String titulo;
    private String autor;
    private int pag;
    private int calificacion;

    public Libro(String titulo, String autor, int pag, int calificacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.pag = pag;
        this.calificacion = calificacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPag() {
        return pag;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPag(int pag) {
        this.pag = pag;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
        
}
