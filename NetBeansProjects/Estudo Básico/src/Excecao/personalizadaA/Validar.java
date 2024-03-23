/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecao.personalizadaA;

import Streams.Aluno;

/**
 *
 * @author Miguel
 */
public class Validar {
    
    private Validar(){   
    }
    public static void aluno(Aluno aluno)
            throws StringVazia, NumeroNegativoException{
        
        if(aluno ==null){
            throw new IllegalArgumentException("O aluno está nulo");
        }
        
//        if(aluno.nome == null || aluno.nome.trim().isEmpty()){
//            throw new StringVazia("nome");
//        }
//        if(aluno.nota <0 || aluno.nota >10){
//            throw new NumeroNegativoException("nota");
//        }
    }
}
