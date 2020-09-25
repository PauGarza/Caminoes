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
public class Empresa {
    
    private Camiones camionArr [];
    private int ocupado = 0;
    private final int MAX = Integer.MAX_VALUE;
    
    public Empresa(){
        camionArr = new Camiones [MAX];
    }
    
    public Empresa(int numCamiones){
        camionArr = new Camiones [numCamiones];
    }
    
    public void agregar(Camiones nuevo){  //Agrega un camión al arreglo de camiones
        camionArr[ocupado] = nuevo; 
        ocupado++;  
    }
    
    public String imprimirDatosPasajeros(){ //Imprime todos los toString de cada camión de pasajeros
        StringBuilder sb = new StringBuilder ("");
        for (int i = 0; i < ocupado; i++) {
            if(camionArr[i] instanceof Pasajeros)
                sb.append(((Pasajeros)camionArr[i]).toString()).append("\n");
        }
        return sb.toString();
    }
    
    public String imprimirDatosVolteo(){ //Imprime todos los toString de cada camión de volteo
        StringBuilder sb = new StringBuilder ("");
        for (int i = 0; i < ocupado; i++) {
            if(camionArr[i] instanceof Volteo)
                sb.append(((Volteo)camionArr[i]).toString()).append("\n");
        }
        return sb.toString();
        
    }
    
    public boolean actualizarCapacidadVolteo(String placa, double nuevaCapacidad){ // Dada la placa de un camión de volteo, se actualiza su capacidad por una cantidad que el usuario ingresa
      boolean resp = true;
      boolean encontrado = false;
      int fin = 0;
      int i = 0;
      while(i < ocupado && !encontrado){
          if(camionArr[i] instanceof Volteo && camionArr[i].getPlacas().equals(placa)){
              encontrado = true;
              fin = i;
          }
          i++;
      }
      if(encontrado == false){
          resp = false;
      }else{
          ((Volteo)camionArr[fin]).setCapacidad(nuevaCapacidad);
      }
      return resp;
    }
    
    public int numPorMarcaPasajeros (String marca){ //Imprime el número de camiones de pasajeros que sean de una marca dada
        int numCamiones = 0;
        for (int i = 0; i < ocupado; i++) {
            if(camionArr[i] instanceof Pasajeros && camionArr[i].getMarca().equals(marca))
                numCamiones ++;
        }
        return numCamiones;
    }
    
    public double totalCapacidadVolteo (){ //Imprime la suma de capacidades de todos los camiones de volteo
        double capacidadTotal =0;
         for (int i = 0; i < ocupado; i++) {
            if(camionArr[i] instanceof Volteo){
                capacidadTotal += ((Volteo)camionArr[i]).getCapacidad();     
            }
        }
         return capacidadTotal;
    }
    
}
