/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author Miguel
 */
public class MinMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ste",10);
        Aluno a2 = new Aluno("Davi",10);
        Aluno a3 = new Aluno("Lixo",3);
        Aluno a4 = new Aluno("Guel",7);
        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4);
        
        Comparator<Aluno> melhorNota = (aluno1,aluno2) ->{
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno2.nota > aluno1.nota) return -1;
            return 0;  
        };
        Comparator<Aluno> piorNota = (aluno1,aluno2) ->{
            if(aluno1.nota > aluno2.nota) return -1;
            if(aluno2.nota > aluno1.nota) return 1;
            return 0;  
        };
        
        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());
        System.out.println(alunos.stream().max(piorNota).get());
    }
}
