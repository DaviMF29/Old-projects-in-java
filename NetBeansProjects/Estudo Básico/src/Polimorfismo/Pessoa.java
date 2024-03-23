/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author Miguel
 */
public class Pessoa {
    private double peso ;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >=0){
        this.peso = peso;  
        }
    }
    public Pessoa(double peso){
        setPeso(peso);
    }
    public void Comer(Comida comida){
        this.peso += comida.getPeso();
        
    }
    
    
}
