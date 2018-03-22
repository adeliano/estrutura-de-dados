package br.edu.ifce.estruturas.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
	private int tamanhoDoConjunto = 0;

	private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();
	
	public Conjunto(){
		for(int i= 0; i<19; i++){
			LinkedList<String> lista = new LinkedList<String>();
			tabela.add(lista);
		}
	}
	
	//função hash
	private int calculaIndiceDaTabela(String palavra){
		
		return palavra. toLowerCase().charAt(0)%26;
		
	}
	
	public void adiciona (String palavra){
		if(!this.contem(palavra)){
			int indice = calculaIndiceDaTabela(palavra);
			List<String> resultado = this.tabela.get(indice);
			resultado.add(palavra);
			this.tamanhoDoConjunto++;
		} else {
			System.out.println("já contem essa palavra");
		}
		
	}
	
	public void remove(String palavra){
		if(this.contem(palavra)){
			int indice = calculaIndiceDaTabela(palavra);
			List<String> lista = this.tabela.get(indice);
			lista.remove(palavra);
			this.tamanhoDoConjunto--;
		}
		
	}
	
	public boolean contem(String palavra){
		int indice = calculaIndiceDaTabela(palavra);
		List<String> lista = this.tabela.get(indice);
		return lista.contains(palavra);
		
	}
	
	public List<String> pegaTodas(){
		List<String> palavras = new ArrayList<String>();
		
		for(int i = 0; i <this.tabela.size(); i ++){
			palavras.addAll(this.tabela.get(i));
		}
		return palavras;
	}
	
	public int tamanho(){
		return tamanhoDoConjunto;
	}
	
}
