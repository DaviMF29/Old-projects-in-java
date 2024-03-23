/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;

import java.util.function.BinaryOperator;
        
        
/**
 *
 * @author Miguel
 */
public class CalculoTeste3 {
    public static void main(String[] args) {
        
        BinaryOperator<Double> calc = ( a,b) -> {  
            return a +b;
        };
        System.out.println(calc.apply(2.0, 3.0));
        
        calc = (a,b) -> a*b;                     
        System.out.println(calc.apply(2.0, 3.0));
        
        BinaryOperator<Integer> calc2 = ( a,b) -> {  
            return a +b;
        };
        System.out.println(calc2.apply(2, 3));
        
        calc2 = (a,b) -> a*b;                     
        System.out.println(calc2.apply(2, 3));
        
    }
}
