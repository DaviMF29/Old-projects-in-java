package com.mycompany.jogo21;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Miguel
 */
public class Carta {

	private String naipe;
	private String nome;
	private int valor;
	
	public Carta(String nome, String naipe, int valor){
		this.naipe = naipe;
		this.nome = nome;
		this.valor = valor;
	}
	
	public String getNaipe() {
		return naipe;
	}
	
	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
}
