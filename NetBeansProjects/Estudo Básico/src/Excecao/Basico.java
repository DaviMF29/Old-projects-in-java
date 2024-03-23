/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excecao;

/**
 *
 * @author Miguel
 */
public class Basico {
    public static void main(String[] args) {
        
        Aluno a1= null;
        
        try{
        imprimirAluno(a1); 
        } catch(Exception excecao){
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuário");
        }
        
        
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        
        System.out.println("Fim");
                   
    }
    public static void imprimirAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
