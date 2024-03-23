/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;


import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author Miguel
 */
public class Desafio {
    public static void main(String[] args) {
   
        
        
        Function<Produto, Double> precoReal =
                produto -> produto.preco *(1 - produto.desconto);
        
        UnaryOperator<Double> impostoMunincipal =
                preco -> preco >= 2500 ? preco * 1.085 : preco;
        
        UnaryOperator<Double> frete = 
                preco -> preco >= 3000 ? preco +100 : preco +50;
        
        UnaryOperator<Double> arredondar = 
                preco -> Double.parseDouble(String.format("%.2f",preco));
       
        Function<Double, String> formatar = 
                preco -> ("R$" + preco).replace(".",",");
        
        
        
        Produto p = new Produto("Ipad",3235.89,0.13);
        String valor = precoReal
                .andThen(impostoMunincipal)
                .andThen(frete)
                .andThen(arredondar)
                .andThen(formatar).apply(p);
        
        System.out.println(valor);
        
        
    }
    
}
