/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecao;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Finally {
    public static void main(String[] args) {
        
            Scanner input = new Scanner(System.in);
        try{
            System.out.println(7/input.nextInt());  
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finalmente");
            input.close();
        
    }
        System.out.println("Fim");
    }
}
