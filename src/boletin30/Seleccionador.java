/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

/**
 *
 * @author Samuel
 */
public class Seleccionador extends SeleccionFutbol {

    public Seleccionador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }
   
    public void concentrarse() {
        System.out.println("Concentrase o seleccionador");
    }
 
    public void entrenar() {
        System.out.println("Entrena o seleccionador");
    }

    public void jugarPartido() {
        System.out.println("Xoga o seleccionador");
    }

    public void viajar() {
        System.out.println("Viaxa o seleccionardor");
    }

    public void seleccionarXogador() {

        System.out.println("Selecciona o seleccionador");
   }
}
