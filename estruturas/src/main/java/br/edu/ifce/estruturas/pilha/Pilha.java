package br.edu.ifce.estruturas.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
	
	private List<Peca> listaPeca = new LinkedList<Peca>();
	
	public void insere(Peca p){
		this.listaPeca.add(p);
		
	}
	
	public Peca remove(){
		
		return this.listaPeca.remove(this.listaPeca.size()-1);
	}
	
	public boolean vazio(){
		if(this.listaPeca.size() == 0){
			return true;
		} else {
			return false;
		}
		
	}

}
