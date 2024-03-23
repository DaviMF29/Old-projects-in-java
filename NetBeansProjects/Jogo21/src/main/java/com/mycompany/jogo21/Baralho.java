/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogo21;

/**
 *
 * @author Miguel
 */
public class Baralho {

	private Montante<Carta> baralho;
	
	public Baralho(){
		this.baralho = new Montante<Carta>();
	}
	
	public void iniciarBaralho(){
		if(baralho.vazia()){
			criarBaralho();
		}
                else{
                    System.out.println("Baralho ja iniciado.");
                }
		
	}

	public void embaralhar(){
		baralho.embaralhar();
	}
	
	public int tamanho(){
		return baralho.size();
	}
	
	public Carta remover(){
		return (Carta) this.baralho.remover();
	}
	
	public void mostrarBaralho(){
		for(int i = 0; i < baralho.size(); i++){
			System.out.println(((Carta) baralho.get(i)).getNome() + " de " + ((Carta) baralho.get(i)).getNaipe());
		}
	}
	

 	private void criarBaralho(){
		
		Carta c1;
		
		//COPAS
		c1 = new Carta("ÁS","Copas",1);
		baralho.inserir(c1);
		c1 = new Carta("2","Copas",2);
		baralho.inserir(c1);
		c1 = new Carta("3","Copas",3);
		baralho.inserir(c1);
		c1 = new Carta("4","Copas",4);
		baralho.inserir(c1);
		c1 = new Carta("5","Copas",5);
		baralho.inserir(c1);
		c1 = new Carta("6","Copas",6);
		baralho.inserir(c1);
		c1 = new Carta("7","Copas",7);
		baralho.inserir(c1);
		c1 = new Carta("8","Copas",8);
		baralho.inserir(c1);
		c1 = new Carta("9","Copas",9);
		baralho.inserir(c1);
		c1 = new Carta("10","Copas",10);
		baralho.inserir(c1);
		c1 = new Carta("J (Valete)","Copas",10);
		baralho.inserir(c1);
		c1 = new Carta("Q (Rainha)","Copas",10);
		baralho.inserir(c1);
		c1 = new Carta("K (Rei)","Copas",10);
		baralho.inserir(c1);
		
		//PAUS
		c1 = new Carta("ÁS","Paus",1);
		baralho.inserir(c1);
		c1 = new Carta("2","Paus",2);
		baralho.inserir(c1);
		c1 = new Carta("3","Paus",3);
		baralho.inserir(c1);
		c1 = new Carta("4","Paus",4);
		baralho.inserir(c1);
		c1 = new Carta("5","Paus",5);
		baralho.inserir(c1);
		c1 = new Carta("6","Paus",6);
		baralho.inserir(c1);
		c1 = new Carta("7","Paus",7);
		baralho.inserir(c1);
		c1 = new Carta("8","Paus",8);
		baralho.inserir(c1);
		c1 = new Carta("9","Paus",9);
		baralho.inserir(c1);
		c1 = new Carta("10","Paus",10);
		baralho.inserir(c1);
		c1 = new Carta("J (Valete)","Paus",10);
		baralho.inserir(c1);
		c1 = new Carta("Q (Rainha)","Paus",10);
		baralho.inserir(c1);
		c1 = new Carta("K (Rei)","Paus",10);
		baralho.inserir(c1);
		
		//OURO
		c1 = new Carta("ÁS","Ouro",1);
		baralho.inserir(c1);
		c1 = new Carta("2","Ouro",2);
		baralho.inserir(c1);
		c1 = new Carta("3","Ouro",3);
		baralho.inserir(c1);
		c1 = new Carta("4","Ouro",4);
		baralho.inserir(c1);
		c1 = new Carta("5","Ouro",5);
		baralho.inserir(c1);
		c1 = new Carta("6","Ouro",6);
		baralho.inserir(c1);
		c1 = new Carta("7","Ouro",7);
		baralho.inserir(c1);
		c1 = new Carta("8","Ouro",8);
		baralho.inserir(c1);
		c1 = new Carta("9","Ouro",9);
		baralho.inserir(c1);
		c1 = new Carta("10","Ouro",10);
		baralho.inserir(c1);
		c1 = new Carta("J (Valete)","Ouro",10);
		baralho.inserir(c1);
		c1 = new Carta("Q (Rainha)","Ouro",10);
		baralho.inserir(c1);
		c1 = new Carta("K (Rei)","Ouro",10);
		baralho.inserir(c1);

		//ESPADAS
		c1 = new Carta("ÁS","Espadas",1);
		baralho.inserir(c1);
		c1 = new Carta("2","Espadas",2);
		baralho.inserir(c1);
		c1 = new Carta("3","Espadas",3);
		baralho.inserir(c1);
		c1 = new Carta("4","Espadas",4);
		baralho.inserir(c1);
		c1 = new Carta("5","Espadas",5);
		baralho.inserir(c1);
		c1 = new Carta("6","Espadas",6);
		baralho.inserir(c1);
		c1 = new Carta("7","Espadas",7);
		baralho.inserir(c1);
		c1 = new Carta("8","Espadas",8);
		baralho.inserir(c1);
		c1 = new Carta("9","Espadas",9);
		baralho.inserir(c1);
		c1 = new Carta("10","Espadas",10);
		baralho.inserir(c1);
		c1 = new Carta("J (Valete)","Espadas",10);
		baralho.inserir(c1);
		c1 = new Carta("Q (Rainha)","Espadas",10);
		baralho.inserir(c1);
		c1 = new Carta("K (Rei)","Espadas",10);
		baralho.inserir(c1);


	}
	
}
