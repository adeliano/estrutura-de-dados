package br.edu.ifce.estruturas.pilha;


public class TestaPilha {
	
public static void main(String[] args) {
		
		Pilha pilha = new Pilha();
		
		Peca p1 = new Peca("Lampada");
		
	
		pilha.insere(p1);
		
		Peca p2 = new Peca("Helice");
		pilha.insere(p2);
		
		Peca pecaRemovida = pilha.remove();
		System.out.println(pecaRemovida.getNome());
		
		if(pilha.vazio()){
			System.out.println("pilha vazia");
		} else {
			System.out.println("pilha ocupada");
		}
	}

}
