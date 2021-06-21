/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareacomposicion;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
import ico.fes.computadora.Computadora;

/**
 *
 * @author Montse García
 */
public class Tareacomposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora comp1 = new Computadora(2021, 318333,
                (new Monitor("Acer", "curvo G27C5", 27)),
                (new Mouse("corsair", "NIGHTSWORD", "Alambrico")),
                (new Teclado("Corsair", "K70 MK.2 RBG", 104, 7)),
                (new CPU ("AMD","YD180XBCAEWOF", 3)));
        System.out.println(comp1);
    }
    
}
