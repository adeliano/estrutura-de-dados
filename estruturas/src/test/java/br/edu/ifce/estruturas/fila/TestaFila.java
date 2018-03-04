package br.edu.ifce.estruturas.fila;

public class TestaFila {
	public static void main(String[] args) {
		Fila fila = new Fila();
		
		Aluno a1 = new Aluno();
		a1.setNome("teste");
		fila.insere(a1);
		
		
		Aluno a2 = new Aluno();
		a2.setNome("adeliano");
		fila.insere(a2);
		
		Aluno alunoRemovido = fila.remove();
		
		if(fila.vazia()){
			System.out.println("fila vazia");
		} else {
			System.out.println("contem");
		}
		
	}
	

}
