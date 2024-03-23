/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrato;

/**
 *
 * @author Miguel
 */
public class Cachorro extends Mamifero{

    
   
    public String mamar(){
        return "mamar";
    }

    @Override
    public String mover() {
        return "usando as patas"; 
    }
    
}
