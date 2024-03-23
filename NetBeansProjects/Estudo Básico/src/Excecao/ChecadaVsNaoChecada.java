/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecao;

/**
 *
 * @author Miguel
 */
public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Fim");
        
        }
        static void geraErro1(){
            throw new RuntimeException("Ocorreu um erro #01");
        }
        static void geraErro2(){
            new Exception("Ocorreu um erro #02");
        }
        
    
}
