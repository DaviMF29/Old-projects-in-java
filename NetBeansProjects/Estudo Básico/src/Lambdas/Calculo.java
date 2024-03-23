/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Lambdas;

/**
 *
 * @author Miguel
 */
@FunctionalInterface                       //APENAS UM ÚNICO MÉTODO
public interface Calculo {
    
    double executar(double a, double b);
    
    
    default String legal(){              //DEFAULT NÃO OBRIGA O USO
        return "Legal";
    }    
    
}
