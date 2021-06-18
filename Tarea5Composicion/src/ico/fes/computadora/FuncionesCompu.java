/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.computadora;
import ico.fes.computadora.Computadora;
import ico.fes.partes.CPU;
import ico.fes.partes.Monitor;
import ico.fes.partes.Mouse;
import ico.fes.partes.Teclado;

/**
 *
 * @author Montse Garcia
 */

public class FuncionesCompu {
    public static void main(String[] args) {
        Computadora comp1= new Computadora (178, 90, 
                                       new Monitor("HP","VH240a" , 1080),
                                       new Mouse("HP", "SW560", "RAPIDO"), 
                                       new Teclado("HP", "TC900", 250, 300),
                                       new CPU("INTEL", "Ci9", 900));
        System.out.println(comp1);
        
    }
  
}
