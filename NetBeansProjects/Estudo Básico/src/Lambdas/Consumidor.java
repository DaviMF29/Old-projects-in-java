/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author Miguel
 */
public class Consumidor {
    public static void main(String[] args) {
        
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto produto1 = new Produto("Caneta",12,0.09);
        Produto produto2 = new Produto("notebook",1000,0.15);
        Produto produto3 = new Produto("garrafa",20,0.09);
        Produto produto4 = new Produto("caderno",30,0.09);
        //imprimir.accept(produto1);
        
        List<Produto> produtos =  Arrays.asList(produto1,produto2,produto3,produto4);
        produtos.forEach(imprimir);
        produtos.forEach(p->System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
    
}
