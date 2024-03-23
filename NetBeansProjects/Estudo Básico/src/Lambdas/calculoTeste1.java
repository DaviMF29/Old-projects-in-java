/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;

/**
 *
 * @author Miguel
 */
public class calculoTeste1 {
    public static void main(String[] args) {
        
        Calculo calculo = new Somar();
        System.out.println(calculo.executar(1, 2));
        
        calculo = new Mutiplicar();
        System.out.println(calculo.executar(3, 2));
    }
}
