/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

/**
 *
 * @author Miguel
 */
public class MediaTeste {
    public static void main(String[] args) {
        Media m1 = new Media().adcionar(8.3).adcionar(6.7);
        Media m2 = new Media().adcionar(7.9).adcionar(6.6);
        
        System.out.println(m1.getvalor());
        System.out.println(m2.getvalor());
        
        System.out.println(Media.combinar(m1, m2).getvalor());
    }
}
