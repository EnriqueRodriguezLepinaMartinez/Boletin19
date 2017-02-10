/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import javax.swing.JOptionPane;

/**
 *
 * @author erodriguez-lepinamartinez
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        Libreria libreria1 = new Libreria();
        
        libreria1.añadirLibro(new Libro("erhyerheh","Alberto","c10",8.20,3));
        libreria1.añadirLibro(new Libro("ergedrgteargerh","Ernesto","c11",9,1));
        libreria1.añadirLibro(new Libro("erysdfgser","Isabel","c12",10,0));

        int seg = 0;
        while(seg == 0){
            System.out.println("Clickar:");
            System.out.println("A (Añadir)");
            System.out.println("B (Eliminar)");
            System.out.println("C (Enseñar libros ordenados)");
            System.out.println("D (Eliminar libros con 0 unidades)");
            System.out.println("E (Consultar)");
            System.out.println("F (Salir)");
            String res = JOptionPane.showInputDialog("Pulsar opcion: A,B,C,D,E,F");
            switch(res){
                case "A":
                    String titulo = JOptionPane.showInputDialog("Titulo: ");
                    String autor = JOptionPane.showInputDialog("Autor: ");
                    String ISBM = JOptionPane.showInputDialog("ISBM: ");
                    double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio: "));
                    int unidades = Integer.parseInt(JOptionPane.showInputDialog("Unidades: "));
                    libreria1.añadirLibro(new Libro(titulo,autor,ISBM,precio,unidades));
                    break;
                case "B":
                    String t = JOptionPane.showInputDialog("Titulo: ");
                    libreria1.venderLibro(t);
                    break;
                case "C":
                    libreria1.ordenar();
                    break;
                case "D":
                    libreria1.bajaLibros();
                    break;
                case "E":
                    String cod = JOptionPane.showInputDialog("ISBM: ");
                    libreria1.consultar(cod);
                    break;
                case "F":
                    seg = 1;
                    break;
            }
        }

    }
}
