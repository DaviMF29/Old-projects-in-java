/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrato;

/**
 *
 * @author Miguel
 */
public class TesteAbstrado {
    public static void main(String[] args) {
        Mamifero p1 = new Cachorro();
        System.out.println(p1.mover());
        System.out.println(p1.mamar());
    }
    
}
