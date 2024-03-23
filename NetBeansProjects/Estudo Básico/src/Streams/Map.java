/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

/**
 *
 * @author Miguel
 */
public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;
        
        List<String> marcas = Arrays.asList("BMW ","AUDI ", "Honda ");
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);
        
        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) +"";
        UnaryOperator<String> grito = n -> n+"!!  ";
        System.out.println("\n");
        System.out.println(maiuscula.andThen(primeiraLetra).andThen(grito).apply("bmw"));
        System.out.println("\n\nUsando letras maisculas");
        
        marcas.stream().map(Utilatarios.maiuscula).map(primeiraLetra).map(grito).forEach(print);
        
    }
}
