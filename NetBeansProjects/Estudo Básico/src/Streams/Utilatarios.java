/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.function.UnaryOperator;

/**
 *
 * @author Miguel
 */
public class Utilatarios {
    
        public final static UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        public final static UnaryOperator<String> primeiraLetra = n -> n.charAt(0) +"";
        public final static UnaryOperator<String> grito = n -> n+"!!  ";
    
}
