package br.edu.ifce.estruturas.conjunto;

public class Teste {
	public static void main(String[] args) {
		ConjuntoEspalhamento testa = new ConjuntoEspalhamento();
		
		testa.adiciona(5);
		testa.adiciona(10);
		testa.adiciona(20);
		
		testa.remove(10);
		System.out.println(testa.contem(5));
		
	
		System.out.println(testa.tamanho());
		
		
	}

}
