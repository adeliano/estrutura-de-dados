package br.edu.ifce.estruturas.conjunto;

public class testeConjuntoLento {

	public static void main(String[] args) {
		
		ConjuntoLento c1 = new ConjuntoLento();
		
		long inicio = System.currentTimeMillis();
		for(int i = 0; i<10000; i++){
			c1.adiciona(i);
		}
		
		long fim = System.currentTimeMillis();
		
		System.out.println("tempo de adição:" + (fim-inicio)/1000.0);
		

	}

}
