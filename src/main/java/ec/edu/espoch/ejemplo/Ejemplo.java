/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.ejemplo;

import ec.edu.espoch.ejemplo.clases.Animal;
import ec.edu.espoch.ejemplo.clases.Gato;
import ec.edu.espoch.ejemplo.clases.Leon;
import ec.edu.espoch.ejemplo.clases.Lobo;
import ec.edu.espoch.ejemplo.clases.Perro;

/**
 *
 * @author SO-LAB1-PC14
 */
public class Ejemplo {

    public static void main(String[] args) {
         Animal [] animales = new Animal [4];
      
        animales [0] = new Gato();
        animales [1] = new Perro();
        animales [2] = new Lobo();
        animales [3] = new Leon();  
        
        for (int i = 0; i < animales.length; i++) {
            System.out.println("Nombre Cientifico:"+animales[i].getNombreCientifico());
            System.out.println("Su alimentacion es:"+animales[i].getAlimentacion());
            System.out.println("Su habitad es:"+animales[i].getHabitad());
            System.out.println("su sonido es:"+animales[i].getSonido());
        }
    }        
    
}
