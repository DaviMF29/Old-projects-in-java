/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author Miguel
 */
public class Filter {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Davi",10);
        Aluno aluno2 = new Aluno("Vitor",8.7);
        Aluno aluno3 = new Aluno("Ste",10);
        Aluno aluno4 = new Aluno("Guel",6.7);
        Aluno aluno5 = new Aluno("Lixo",2.7);
        Aluno aluno6 = new Aluno("Leo",3.7);
        
        List<Aluno> alunos =
                Arrays.asList(aluno1,aluno2,aluno3,aluno4,aluno5,aluno6);
        
        Predicate<Aluno> aprovado = a -> a.nota>= 7;
        Function<Aluno,String> saudacaoAprovado = a -> "Parabéns " + a.nome +" você foi aprovado(a)";
        
        alunos.stream()
                .filter(aprovado)
                .map(saudacaoAprovado)
                .forEach(System.out::println);
        
        
        Produto produto1 = new Produto("Lápis", 1.5,2023);
        Produto produto2 = new Produto("Caderno", 20.5,2021);
        Produto produto3 = new Produto("Garrafinha", 30,2040);
        List<Produto> produtos = Arrays.asList(produto1,produto2,produto3);
        Predicate<Produto> estaNoOrcamento =
                a -> a.preco <= 100;
        Predicate<Produto> estaNaValidade =
                a -> a.validade >=2023;
        Function<Produto,String> podeComprar = a-> a.nome + " Pode ser comprado";
        
        produtos.stream()
                .filter(estaNoOrcamento)
                .filter(estaNaValidade)
                .map(podeComprar)
                .forEach(System.out::println);
        
    }
    
    
}
