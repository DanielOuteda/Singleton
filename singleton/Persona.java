/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author doutedasolla
 */
public class Persona {

    String Nombre;
    String Apellido;
    int edad;
    private static Persona launica;
    
    public Persona() {
    }

    public Persona(String Nombre, String Apellido, int edad) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
    }

    public static Persona getInstance(){
        launica = new Persona("Cristiano Ronaldo", "dos Santos Aveiro", 32);
        return launica;
    }

    @Override
    public String toString() {
        return Nombre + " " + Apellido + ", edad = " + edad;
    }
    
        
    

}
