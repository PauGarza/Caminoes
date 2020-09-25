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
public class Volteo extends Camiones {
    
    private double capacidad;
    
    public Volteo(String marca, String numMotor, String placas, double capacidad) {
        super(marca, numMotor, placas);
        this.capacidad = capacidad;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder ("");
        sb.append(super.toString());
        sb.append("Capacidad: "+capacidad+"\n");
       return sb.toString();
    }
   
}
