/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

/**
 *
 * @author Miguel
 */
public class Media {
    private double total;
    private int quantidade;
    
    public Media adcionar(double valor){
        total += valor;
        quantidade++;
        return this;
    }
    
    public double getvalor(){
        return total/quantidade;
                
    }
    
    public static Media combinar(Media m1,Media m2){
        Media Resultante = new Media();
        Resultante.total = m1.total + m2.total;
        Resultante.quantidade = m1.quantidade + m2.quantidade;
        return Resultante;        
    }
}
