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
public class Masajista extends SeleccionFutbol implements IntegranteInterface, DeportistaInterface {

    private String titulacion;
    private int anhosExperiencia;

    public Masajista(String titulacion, int anhosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anhosExperiencia = anhosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.println("Concentrase o masajista");
    }

        @Override
    public void entrenar() {
        System.out.println("Entrena o masajista");
    }

    @Override
    public void jugarPartido() {
        System.out.println("Xoga o masajista");
    }
    
    @Override
    public void viajar() {
        System.out.println("Viaxa o masajista");
    }

    public void darMasaje() {
        System.out.println("Da mensaxe o masajista");
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public void setAnhosExperiencia(int anhosExperiencia) {
        this.anhosExperiencia = anhosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public int getAnhosExperiencia() {
        return anhosExperiencia;
    }

    @Override
    public String toString() {
        return "Masajista " + "id: " + this.getId() + ", nombre: " + this.getNombre() + ", apellidos: " + this.getApellidos() + ", edad: " + this.getEdad() + ", titulacion: " + titulacion + ", anosExperiencia:" + anhosExperiencia;
    }

}