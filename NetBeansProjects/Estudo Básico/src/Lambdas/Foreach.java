/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana","bia","gui");
        System.out.println("Forma tradicional:");
        for(String nome: aprovados){
            System.out.println(nome);
        }
        System.out.println("\nLambda versão 1:");
        aprovados.forEach((nome) -> {System.out.println(nome+"!!!");});
        
        System.out.println("\nMethod reference:"); 
        aprovados.forEach(System.out::println);
        
        System.out.println("\nLambda versão 2:");
        aprovados.forEach(nome -> meuImprimir(nome));
        
        System.out.println("\nMethod reference 2 :"); 
        aprovados.forEach(Foreach::meuImprimir);
        
        
    }
    static void meuImprimir(String nome){
        System.out.println("Oi, meu nome é "+ nome);
    }
}
