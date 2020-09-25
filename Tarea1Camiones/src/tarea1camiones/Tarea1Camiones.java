/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1camiones;

import java.io.*;
import java.util.*;


/**
 *
 * @author Paulina Garza & Dante Figueroa
 */
public class Tarea1Camiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File archivo;
	Scanner lectura, lee;
        int tam = 0;
        String tipo;
        String marca;
        String numMotor;
        String placas;
        Volteo nuevoVolteo;
        Pasajeros nuevoPasajero;
        double capacidad; //solo para voleto
        int numPasajeros; //solo para pasajeros
        Empresa pau;
        boolean checar;
        lee = new Scanner(System.in);
        
        try{
            
            archivo = new File ("P.txt");
            lectura = new Scanner (archivo);
            tam = lectura.nextInt();
            pau = new Empresa(tam);
            
            //nuevoVolteo = new Volteo("marca","20","placas",2.0); 
            //pau.agregar(nuevoVolteo);
            
            for(int i = 0; i < tam; i++){
                
                tipo = lectura.next();
                marca = lectura.next();
                numMotor = lectura.next();
                placas = lectura.next();
                
                if(tipo.equals("Volteo")){
                    capacidad = lectura.nextDouble();
                    nuevoVolteo = new Volteo(marca, numMotor, placas, capacidad);
                    pau.agregar(nuevoVolteo);
                }else{
                    numPasajeros = lectura.nextInt();
                    nuevoPasajero = new Pasajeros(marca, numMotor, placas, numPasajeros);
                    pau.agregar(nuevoPasajero);
                } 
            }
            
            System.out.println(pau.getClass().getSimpleName());
            
            System.out.println("Datos de camiones de pasajeros: ");
            System.out.println(pau.imprimirDatosPasajeros());
            
            System.out.println("Datos de camiones de volteo: ");
            System.out.println(pau.imprimirDatosVolteo());
            
            System.out.println("Actualizar capacidad de un camion de volteo con una placa");
            System.out.println("Ingrese la placa (YOLO, XD): ");
            placas = lee.next();
            System.out.println("Ingrese la nueva capacidad: ");
            capacidad = lee.nextDouble();
            checar = pau.actualizarCapacidadVolteo(placas, capacidad);
            if(checar == true){
                System.out.println("Se pudo actualizar correctamente \n");
                System.out.println("Datos de camiones de volteo: ");
                System.out.println(pau.imprimirDatosVolteo());
            }else{
                System.out.println("No se pudo actualizar\n");
            }
            
            System.out.println("Cuántos camiones de pasajeros hay de una marca: ");
            System.out.println("Ingrese la marca (Toyota, Ford): ");
            marca = lee.next();
            System.out.println(pau.numPorMarcaPasajeros(marca));
            
            System.out.println("\nTotal de capacidad de todos los camiones de volteo: ");
            System.out.println(pau.totalCapacidadVolteo());
            
            lectura.close();
        }catch(Exception e){
            System.out.println("No se pudo leer el archivo.");
        }
        
    }
    
}
