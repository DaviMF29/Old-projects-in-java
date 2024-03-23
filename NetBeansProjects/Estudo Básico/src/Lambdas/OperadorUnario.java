/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;

import java.util.function.UnaryOperator;

/**
 *
 * @author Miguel
 */
public class OperadorUnario {
    public static void main(String[] args) {
        
        UnaryOperator<Integer> maisDois = valor -> valor + 2;
        UnaryOperator<Integer> vezesDois = valor -> valor * 2;
        UnaryOperator<Integer> aoQuadrado = valor -> valor * valor;
        
        
        int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2);
        System.out.println(resultado1);
        
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(2);
        System.out.println(resultado2);
        
    }
    
}
