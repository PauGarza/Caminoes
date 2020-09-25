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
public class Camiones {
    private String marca;
    private String numMotor;
    private String placas;
    
    public Camiones (String marca, String numMotor, String placas){
        this.marca = marca;
        this.numMotor = numMotor;
        this.placas = placas;
    }

    public String getMarca() {
        return marca;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public String getPlacas() {
        return placas;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder ("");
        sb.append("Marca: "+marca+"\n");
        sb.append("Numero de Motor: "+numMotor+"\n");
        sb.append("Placas: "+placas+"\n");
        return sb.toString();
    }
    
}
