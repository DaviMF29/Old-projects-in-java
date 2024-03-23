/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagps;

import java.util.ArrayList;

/**
 *
 * @author Miguel
 */
public class GPS {
    String nome;
    int x;
    int y;
    
    double menor;
    int auxF;
    int aux;
    
    
    int calculo;
    

    
    ArrayList<GPS> localizacoes = new ArrayList<GPS>();
    ArrayList<Integer> nums = new ArrayList<Integer>();
    
    public GPS(String nome,int x, int y) {
        this.nome = nome;
        this.x = x;
        this.y = y;
    }
    
    public void cadastrarLocalizacao(GPS gps){
        localizacoes.add(gps);
    }
    
    public void localizarDestinoProximo(int distancia){
        
        for(int i=0;i < localizacoes.size();i++){
            int somalocalizacao = localizacoes.get(i).x + localizacoes.get(i).y; 
            if(somalocalizacao<= distancia){
                System.out.println(localizacoes.get(i));
            }
            
        }
        
    }
    

}
