package br.edu.ifce.estruturas.conjunto;

	import java.util.LinkedList;
	import java.util.List;

	public class ConjuntoLento {

		List<Integer> conjuntoLento = new LinkedList<Integer>();
		
		public boolean adiciona(Integer nome){
			if(conjuntoLento.contains(nome)){
				return false;
				
			}else {
				this.conjuntoLento.add(nome);
				return true;
			}
		}
}
