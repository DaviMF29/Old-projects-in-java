/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo21;

/**
 *
 * @author Miguel
 */
import java.util.ArrayList;

public class Jogador {

	
	private String nome;
	private ArrayList<Carta> mao;
	private int pontos;
	
	public Jogador(){
		this.pontos = 0;
		this.mao = new ArrayList<Carta>();
	}
	
	public void addCarta(Carta carta){
		this.pontos += carta.getValor();
		this.mao.add(carta);
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Carta> getMao() {
		return mao;
	}
	
	public void setMao(ArrayList<Carta> mao) {
		this.mao = mao;
	}
	
	public int getPontos() {
                return pontos;
		
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	
}
