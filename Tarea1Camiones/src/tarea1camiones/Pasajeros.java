/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1camiones;

/**
 *
 * @author Paulina Garza & Dante Figueroa
 */
public class Pasajeros extends Camiones {
    
    private int numPasajeros;
    
    public Pasajeros(String marca, String numMotor, String placas, int numPasajeros) {
        super(marca, numMotor, placas);
        this.numPasajeros = numPasajeros;
    }

    public int getNumPasajeros() {
        return numPasajeros;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder ("");
        sb.append(super.toString());
        sb.append("Pasajeros: "+numPasajeros+"\n");
       return sb.toString();
    }
    
}
