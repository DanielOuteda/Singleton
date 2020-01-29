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
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Persona Pepe = new Persona("Cristiano Ronaldo", "dos Santos Aveiro", 32);
//        Persona Paco = new Persona("Lionel Andrés", "Messi Cuccittini", 31);
//        System.out.println(Pepe.toString());
//        System.out.println(Paco.toString());
        
        Persona per = Persona.getInstance();
        Persona otra = Persona.getInstance();
        
        
        
    }
    
}