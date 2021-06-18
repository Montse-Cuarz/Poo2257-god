/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.partes;

/**
 *
 * @author Montse García
 */
public class Teclado {
   private String marca; 
   private String modelo;
   private int numerodeTeclas;
   private int multimedia;
   
   public Teclado(){
       
   }

    public Teclado(String marca, String modelo, int numerodeTeclas, int multimedia) {
        this.marca = marca;
        this.modelo = modelo;
        this.numerodeTeclas = numerodeTeclas;
        this.multimedia = multimedia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumerodeTeclas() {
        return numerodeTeclas;
    }

    public void setNumerodeTeclas(int numerodeTeclas) {
        this.numerodeTeclas = numerodeTeclas;
    }

    public int getMultimedia() {
        return multimedia;
    }

    public void setMultimedia(int multimedia) {
        this.multimedia = multimedia;
    }

    @Override
    public String toString() {
        return "Teclado{" + "marca=" + marca + ", modelo=" + modelo + ", numerodeTeclas=" + numerodeTeclas + ", multimedia=" + multimedia + '}';
    }
   
   
   
}
