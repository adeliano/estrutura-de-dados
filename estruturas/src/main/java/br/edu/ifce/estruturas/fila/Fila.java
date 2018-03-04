package br.edu.ifce.estruturas.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {
	
	private List<Aluno> listaAluno = new LinkedList<Aluno>();
	public void insere(Aluno a1){
		this.listaAluno.add(a1);
		
	}
	
	public Aluno remove(){
		
		return this.listaAluno.remove(0);
		
		
	}
	public boolean vazia(){
		
		return this.listaAluno.isEmpty();
		
	}

}
