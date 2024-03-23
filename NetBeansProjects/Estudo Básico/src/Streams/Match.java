/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Miguel
 */
public class Match {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ste",10);
        Aluno a2 = new Aluno("Davi",10);
        Aluno a3 = new Aluno("Lixo",3);
        Aluno a4 = new Aluno("Guel",7);
        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
        Predicate<Aluno> aprovado = a-> a.nota >=7;
        
        System.out.println(alunos.stream().allMatch(aprovado));
        System.out.println(alunos.stream().anyMatch(aprovado));
        System.out.println(alunos.stream().noneMatch(aprovado));
        
    }
}
