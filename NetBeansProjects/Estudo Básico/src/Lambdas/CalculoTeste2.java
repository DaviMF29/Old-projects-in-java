/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;

/**
 *
 * @author Miguel
 */
public class CalculoTeste2 {
    public static void main(String[] args) {
        
        Calculo calc = (double a, double b) -> {  //SINTAXE MAIOR
            return a +b;
        };
        System.out.println(calc.executar(2, 3));
        
        calc = (a,b) -> a*b;                      //SINTAXE MAIS ENXUTA
        System.out.println(calc.executar(2, 2));
        System.out.println(calc.legal());
    }
}
