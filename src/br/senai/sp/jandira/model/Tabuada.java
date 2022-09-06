package br.senai.sp.jandira.model;

public class Tabuada {

	public int multiplicador;
	public int minimoMultiplicador;
	public int maximoMultiplicador;

	public String[] getResultado() {

		int tamanho = maximoMultiplicador - minimoMultiplicador + 1;
		String[] tabuada = new String[tamanho];
		int i = 0;
		
		while(minimoMultiplicador <= maximoMultiplicador) {
			
			int produto = multiplicador * minimoMultiplicador;
			
			String resultado = multiplicador + " X " + minimoMultiplicador + " = " + produto;	
			tabuada[i] = resultado;
			
			i++;
			minimoMultiplicador++;
			
		}

		return tabuada;

	}


}