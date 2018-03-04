package br.edu.ifce.estruturas.conjunto;

public class TestaConjunto {

	public static void main(String[] args) {
		Conjunto testa = new Conjunto();
		
		testa.adiciona("i");
		testa.adiciona("adeliano");
		testa.adiciona("felipe");
		testa.adiciona("testa");
		testa.adiciona("ifce");
		
		System.out.println(testa.contem("ifce"));
		System.out.println(testa.tamanho());
		testa.remove("ifce");
		System.out.println(testa.tamanho());
		System.out.println(testa.pegaTodas());
		

	}

}
