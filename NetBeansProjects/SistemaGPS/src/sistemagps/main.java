/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemagps;

/**
 *
 * @author Miguel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GPS gpsLocal = new GPS("casa",30,30);
        GPS gps1 = new GPS("amigo",30,50);
        GPS gps2 = new GPS("faculdade",50,90);
        
        gps1.cadastrarLocalizacao(gps1);
        gps2.cadastrarLocalizacao(gps2);
        gpsLocal.localizarDestinoProximo(10);
        
        
        
    }
    
}
