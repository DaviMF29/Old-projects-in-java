/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo21;

/**
 *
 * @author Miguel
 */
package br.ufrn.imd.ppgsw.ed;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    private static Baralho baralho;
    private static ArrayList<Jogador> jogadores;
    private static Scanner input = new Scanner(System.in);
    private static int opcaoJogo = 1;
    private static int pontosMaior = 0;

    public static void main(String[] args) {

        int opcao = 1;
        Jogador jogador;
        String nome;

        baralho = new Baralho();
        baralho.iniciarBaralho();
        baralho.embaralhar();

        jogadores = new ArrayList<Jogador>();

        jogador = new Jogador();
        jogador.setNome("Banca");
        jogadores.add(jogador);

        
        while (opcao == 1 || opcao ==2) {

            System.out.println();
            System.out.println("---------- 21 ----------");
            System.out.println("------ Digite sua opção -------");
            System.out.println();
            System.out.println("1 - Adicionar Jogador");
            System.out.println("2 - Iniciar Jogo");
            System.out.println("0 - Sair");
            opcao = input.nextInt();

            //Add jogador
            if (opcao == 1) {
                jogador = new Jogador();
                System.out.println("\nDigite o nome do jogador:");
                nome = new String(input.next());
                jogador.setNome(nome);
                jogadores.add(jogador);
            }
       			
            else if (opcao == 2) {
                if (jogadores.size() < 2) {
                    System.out.println("Sem jogadores adicionados.");
                } else {
                    while (opcaoJogo >= 1) {  
                        if (opcaoJogo == 1) {
                            darCartas(jogadores, baralho);
                            opcaoJogo = 2;
                        } 
                        else if (opcaoJogo == 2) {
                            for (int j = (jogadores.size() - 1); j >= 0; j--) {
                                while (jogadores.get(j).getPontos() <= 21 && opcaoJogo != 3) {
                                    jogar(jogadores.get(j), baralho);
                                }
                                opcaoJogo = 2;
                            }
                            opcaoJogo = -1;
                            vencedor();
                        }
                    }
                    opcao = -1;
                }
            }
        }
    }

    public static void darCartas(ArrayList<Jogador> jogadores, Baralho baralho) {
        for (int i = 1; i <= 2; i++) {
            for (Jogador j : jogadores) {
                j.addCarta(baralho.remover());
            }
        }
    }

    public static void mostrarMesa(ArrayList<Jogador> jogadores) {
        System.out.println();
        System.out.println("|¨¨   Mesa   ¨¨|");

        for (Jogador j : jogadores) {
            System.out.println("-------------------------");
            System.out.print("Jogador: ");
            System.out.print("\t" + j.getNome());
            System.out.println("\nCartas:");

            for (Carta c : j.getMao()) {
                System.out.println("\t" + c.getNome() + " de " + c.getNaipe());
            }

            System.out.println("Pontos -> ");
            System.out.println("\t" + j.getPontos());
            System.out.println();
        }
        System.out.println("|__   Mesa   __|");
        System.out.println();
    }

    public static void jogar(Jogador jogador, Baralho baralho) {

        mostrarMesa(jogadores);
        System.out.println();
        System.out.println("Jogador: " + jogador.getNome());
        System.out.println("------ Digite sua opção -------");
        System.out.println("2 - Pegar mais uma");
        System.out.println("3 - Parar");
        opcaoJogo = input.nextInt();

        
        if (opcaoJogo == 2) {
            jogador.addCarta(baralho.remover());
        }

        
        if (opcaoJogo == 3) {
            System.out.println("Opcao:  Stand -> Pontos: " + jogador.getPontos());
        }

        if (jogador.getPontos() >= pontosMaior && jogador.getPontos() <= 21) {
            pontosMaior = jogador.getPontos();
        }
    }

    public static void vencedor() {
        int contEmpate = 0;

        System.out.println("--------------");
        System.out.println("     \\o/     ");
        System.out.println();
        System.out.println("Vencedor(es): ");
        System.out.println();

        for (Jogador j : jogadores) {
            if (j.getPontos() == pontosMaior) {
                System.out.println(j.getNome() + " Pontos: " + j.getPontos());
                contEmpate++;
            }
        }
        if (contEmpate > 1) {
            System.out.println("Portanto, tivemos um empate!!!!");
        }
        System.out.println();
        System.out.println("     \\o/     ");
        System.out.println("--------------");
        System.out.println();
    }
}
