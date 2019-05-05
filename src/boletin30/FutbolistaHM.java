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
public class FutbolistaHM extends SeleccionFutbol implements IntegranteInterface, DeportistaInterface {
       private int dorsal;
    private String demarcacion;

    public FutbolistaHM(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrase o futbolista");
    }
  
        @Override
    public void entrenar() {
        System.out.println("Entrena o futbolista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o futbolista");
    }
    
    @Override
    public void viajar() {
        System.out.println("Viaxa o futbolista");
    }

    public void entrevista() {
        System.out.println("Entrevista o Futbolista");
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    @Override
    public String toString() {
        return "Futbolista " + "id: " + this.getId() + ", nombre: " + this.getNombre() + ", apellidos: " + this.getApellidos() + ", edad: " + this.getEdad() + ", dorsal: " + dorsal + ", demarcacion: " + demarcacion;
}
}
