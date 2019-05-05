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
public class EntrenadorHM extends SeleccionFutbol implements IntegranteInterface, DeportistaInterface{
    
 private int idFederacion;


    public EntrenadorHM(int idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    @Override
    public void concentrarse() {
        System.out.println("Concentrase o entrenador");
    }

      @Override
    public void entrenar() {
        System.out.println("Entrena o entrenador");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o entrenador");
    }
    
 @Override
    public void viajar() {
        System.out.println("Viaxa o entrenador");
    }

    public void planificarEntrenamiento() {
        System.out.println("Planifica entrenamiento o entrenador");
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador: " + "id: " + this.getId() + ", nombre: " + this.getNombre() + ", apellidos :" + this.getApellidos() + ", edad: " + this.getEdad() + ", idFederacion: " + idFederacion;
    }

}
