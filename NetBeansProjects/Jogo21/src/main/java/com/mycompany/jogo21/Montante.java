package com.mycompany.jogo21;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Miguel
 */
import java.util.ArrayList;
import java.util.Collections;

public class Montante<Objeto> {

	private ArrayList<Objeto> objetos = new ArrayList<Objeto>();
	
	public Montante(){
		objetos = new ArrayList<Objeto>();
	}
	
	public void inserir(Objeto t){
		this.objetos.add(t);
	}
	
	public Object remover(){
		return this.objetos.remove(this.objetos.size() - 1);
	}
	
	public boolean vazia() {
		return objetos.isEmpty();
	}
	
	public Object get(int i){
		return this.objetos.get(i);
	}
	
	public int size(){
		return objetos.size();
	}
	
	public void embaralhar(){
		Collections.shuffle(objetos);
	}
}
