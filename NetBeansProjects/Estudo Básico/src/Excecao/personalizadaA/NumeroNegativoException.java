/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecao.personalizadaA;

/**
 *
 * @author Miguel
 */
@SuppressWarnings("serial")
public class NumeroNegativoException extends RuntimeException{
    
    public String nomeDoAtributo;
    
    public NumeroNegativoException(String nomeDoAtributo) {
         this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está negativo",
                nomeDoAtributo);
    }

    
    
    
    
}
