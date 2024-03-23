/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;

import java.util.function.Predicate;

/**
 *
 * @author Miguel
 */
public class PredicadoComposicao {
    public static void main(String[] args) {
        
        Predicate<Integer>  isPar = valor ->valor %2 ==0;
        Predicate<Integer> isTresDigitos = valor -> valor >= 100 && valor <=999;
        
        System.out.println(isPar.and(isTresDigitos).negate().test(122));
        System.out.println(isPar.and(isTresDigitos).test(122));
    }
    
}
