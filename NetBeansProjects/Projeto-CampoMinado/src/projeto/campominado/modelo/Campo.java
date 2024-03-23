/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.campominado.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class Campo {
    
    private boolean minado;
    private boolean aberto;
    private boolean marcado;
    
    private final int coluna;
    private final int linha;

    private List<Campo> vizinhos = new ArrayList<>();
    
    
    public Campo(int coluna, int linha) {
        this.coluna = coluna;
        this.linha = linha;
    }
    
    boolean adcionarVizinho(Campo vizinho){
        
    }
}
