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
public class Predicado {
    
    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco *(1-prod.desconto) >= 2000);
        Produto produto = new Produto("notebook",2345,0.20);
        System.out.println(isCaro.test(produto));
    }
    
}
