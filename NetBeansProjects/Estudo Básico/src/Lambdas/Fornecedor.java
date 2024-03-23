/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author Miguel
 */
public class Fornecedor {
    public static void main(String[] args) {
        Supplier<Object>  umaLista =
                () -> Arrays.asList("Ana","Bia","Lia","Gui");
        
        System.out.println(umaLista.get());
    }
    
}
