/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author Miguel
 */
public class CriantoStream {
    public static void main(String[] args) {
        
        Consumer<String> print =System.out::print;
        Consumer<Integer> println = System.out::println;
        
        
        Stream<String> langs = Stream.of("java ","lua ","Js\n");
        langs.forEach(print);
        String[] maisLangs= {"Python ", "Lisp ", "Perl ", "Go\n"};
        Stream.of(maisLangs).forEach(print);
        Arrays.stream(maisLangs).forEach(print);
        Arrays.stream(maisLangs,1,2).forEach(print);
        System.out.println(" ");
        List<String> outrasLangs = Arrays.asList("C ","Php ","Kotlin" );
        System.out.println(outrasLangs);
        System.out.println(" ");
        outrasLangs.stream().forEach(print);
        System.out.println(" ");
        outrasLangs.parallelStream().forEach(print);
//      Stream.generate(()->"a").forEach(print);
        Stream.iterate(0, n -> n+1).forEach(println);
        
    }
    
}
