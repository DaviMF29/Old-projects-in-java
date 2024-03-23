/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author Miguel
 */
public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(72);
        Arroz arroz1 = new Arroz(0.5);
        Feijão feijão1 = new Feijão(0.2);
        Sorvete sorvete1 = new Sorvete(0.01);
        System.out.println(p1.getPeso());
        p1.Comer(feijão1);
        p1.Comer(arroz1);
        System.out.println(p1.getPeso());
    }
    
}
