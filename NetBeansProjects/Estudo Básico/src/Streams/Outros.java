/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Miguel
 */
public class Outros {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ste",10);
        Aluno a2 = new Aluno("Davi",10);
        Aluno a3 = new Aluno("Lixo",3);
        Aluno a4 = new Aluno("Guel",7);
        Aluno a5 = new Aluno("leo",10);
        Aluno a6 = new Aluno("Davi",10);
        Aluno a7 = new Aluno("Lixo",3);
        Aluno a8 = new Aluno("Guel",7);
//        Aluno a5 = new Aluno("quinho",4);
//        Aluno a6 = new Aluno("fat",9);
//        Aluno a7 = new Aluno("jv",7);
//        Aluno a8 = new Aluno("leo",2);
        
        List<Aluno> alunos =
                Arrays.asList(a1,a2,a3,a4,a5,a6,a7,a8);
        
        System.out.println("Distinct...");
        alunos.stream().distinct().forEach(System.out::println);
        
        System.out.println("\nSkip/Limit");
        alunos.stream().distinct().limit(2).skip(1).forEach(System.out::println);
        
//        System.out.println("\nTakeWhile");
//        alunos.stream().distinct().takeWhile(a->a.nota >=7).forEach(System.out::println);
//        
    }
}
