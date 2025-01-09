/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.ejemplo.clases;

/**
 *
 * @author SO-LAB1-PC14
 */
public class Perro extends Caninos{

@Override
public String getNombreCientifico() {
        return "canispulus familiaris";
    }
          
@Override 
public String getSonido() {
        return "ladrido";
    }
@Override
    public String getAlimentacion() {
        return "carnivoro";
    }
    
@Override
    public String getHabitad() {
        return "domestico";
    }

}