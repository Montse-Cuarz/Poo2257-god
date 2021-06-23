/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciatarea6;

import ico.fes.personas.Alumno;
import ico.fes.personas.Persona;

/**
 *
 * @author Montse García
 */
public class HerenciaTarea6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona pers1 = new Persona("Montserrat García",19 ,"femenino", 1.63f);
        Alumno alum1 = new Alumno("318333537", "Ing. en computación", 2, "Montserrat García", 19, "Femenino", 1.63f);
        System.out.println(pers1);
        System.out.println(alum1);
    }
    
}
