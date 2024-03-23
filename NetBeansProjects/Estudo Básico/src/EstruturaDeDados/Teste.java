/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EstruturaDeDados;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Teste {
    public static void main(String[] args) {
        int vetor[] = new int[10];
        vetor[0] = 4;
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        //int valor;
        for(int i = 0; i <= x-1; i++){
            vetor[i] = input.nextInt();
        }
        for(int i = 0; i <= x-1; i++){
            System.out.println(vetor[i]);
            
        }
        
        
    }
    
}
