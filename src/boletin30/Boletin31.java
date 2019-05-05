/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin30;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class Boletin31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     ArrayList<SeleccionFutbol> lista = new ArrayList<>();

        FutbolistaHM obf = new FutbolistaHM(1, "centrocampista", 5, "Xavi", "Hernández", 31);
        EntrenadorHM obe = new EntrenadorHM(2, 4, "Julian", "Muñoz", 50);
        Masajista obm = new Masajista("Universidade", 20, 3, "Miguel", "Robles", 48);
        Seleccionador obs = new Seleccionador(4, "Samuel", "Gómez", 22);

        lista.add(obf);
        lista.add(obe);
        lista.add(obm);
        lista.add(obs);

        for (SeleccionFutbol lis : lista) {

            System.out.println(lis);

        }

    }

}