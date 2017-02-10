/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Libro {
    public String titulo;
    public String autor;
    public String ISBN;
    public double precio;
    public int unidades;

    public Libro(String titulo, String autor, String ISBN, double precio, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.precio = precio;
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ISBN=" + ISBN + ", precio=" + precio + ", unidades=" + unidades + '}';
    }
}
