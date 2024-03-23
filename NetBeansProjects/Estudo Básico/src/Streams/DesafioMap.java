/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;


import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author Miguel
 */
public class DesafioMap {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        

        UnaryOperator<String> inverter =
                s-> new StringBuilder(s).reverse().toString();
        
        Function<String, Integer> binarioParaInt = 
                s -> Integer.parseInt(s,2);
                
        
        nums.stream().map(Integer::toBinaryString)
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);
       
        
        
    }

    
}
