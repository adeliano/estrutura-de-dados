package br.edu.ifce.estruturas.vetor;

public class TesteAdicionaPosicao {
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		Aluno a4 = new Aluno();
		
		a1.setNome("Rafael");
		a2.setNome("Paulo");
		a3.setNome("Ana");
		a4.setNome("teste");
		
		Vetor lista = new Vetor();
		lista.adiciona(0, a1);
		lista.adiciona(1, a2);
		lista.adiciona(a3);
		lista.adiciona(2, a4);
		System.out.println(lista);
		}

}
