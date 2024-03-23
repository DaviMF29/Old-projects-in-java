/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author Miguel
 */
public class Reduce1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);
        BinaryOperator<Integer> soma =(ac,n) -> ac +n;
        
        int total =numeros.stream().reduce(soma).get();
        System.out.println(total);   
        
        Integer total2 = numeros.parallelStream().reduce(100, soma);
        Integer total3 = numeros.stream().reduce(100, soma); //O valor vai ser passado apenas uma vez
        System.out.println(total2);
        
        numeros.stream().filter(n-> n>5)
                .reduce(soma)
                .ifPresent(System.out::println);
    }
}
