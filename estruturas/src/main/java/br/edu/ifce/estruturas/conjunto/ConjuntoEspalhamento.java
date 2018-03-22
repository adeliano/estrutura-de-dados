package br.edu.ifce.estruturas.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	private int tamanhoDoConjunto =0;
	private ArrayList<LinkedList<Integer>> tabela = new ArrayList<LinkedList<Integer>>();
	
	public ConjuntoEspalhamento(){
		for(int i= 0; i<26; i++){
			LinkedList<Integer> lista = new LinkedList<Integer>();
			tabela.add(lista);
		}
	}
	
	//função hash
	private int calculaIndiceDaTabela(int numero) {
		int codigo = 0; 
		
		String a = String.valueOf(numero);
		for(int i = 0; i<2; i++) { 
			int x = Character.getNumericValue(a.charAt(i));
			codigo += x;
		}
		return codigo;
	}
	public void adiciona (int numero){
		if(!this.contem(numero)){
			int indice = this.calculaIndiceDaTabela(numero);
			List<Integer> resultado = this.tabela.get(indice);
			resultado.add(numero);
			this.tamanhoDoConjunto++;
		} 
	}
	public void remove(int numero){
		if(this.contem(numero)){
			int indice = this.calculaIndiceDaTabela(numero);
			List<Integer> lista = this.tabela.get(indice);
			lista.remove(new Integer(indice));
			this.tamanhoDoConjunto--;
		}
		
	}
	public boolean contem(int numero){
		int indice = calculaIndiceDaTabela(numero);
		List<Integer> lista = this.tabela.get(indice);
		return lista.contains(numero);
		
	}
	public List<Integer> pegaTodas(){
		List<Integer> numero = new ArrayList<Integer>();
		
		for(int i = 0; i <this.tabela.size(); i ++){
			numero.addAll(this.tabela.get(i));
		}
		return numero;
	}
	public int tamanho(){
		return tamanhoDoConjunto;
	}
	
}
