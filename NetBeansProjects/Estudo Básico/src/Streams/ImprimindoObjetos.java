/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Miguel
 */
public class ImprimindoObjetos {
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Lu","gui","ana","luca");
        System.out.println("Usando Foreach:");
        for(String nome: aprovados){
            System.out.println(nome);
        }
        
        System.out.println("\nUsando Iterador:");
        Iterator<String> iterator = aprovados.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());      
        }
        
        System.out.println("\nUsando Stream:");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);             //Laço interno
        
        
        
    }
    
}
