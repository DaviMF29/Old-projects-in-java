/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 *
 * @author Miguel
 */
public class OperadorBinario {
    public static void main(String[] args) {
        
        BinaryOperator<Double> media = (valor1, valor2) -> (valor1 +valor2)/2;
        
        System.out.println(media.apply(7.5,6.4));
        
        BiFunction<Double, Double, String> resultado =
                (n1,n2) -> ((n1+n2)/2) >= 7 ? "Aprovado" : "Reprovado"; 
        
        System.out.println(resultado.apply(7.5, 4.3));
        
        Function<Double,String>  conceito =
                m -> m>= 7 ?"Aprovado" :"Reprovado";
        
        System.out.println(media.andThen(conceito).apply(7.3, 7.6));
    }
    
}
