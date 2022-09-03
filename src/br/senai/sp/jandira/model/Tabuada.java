package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Tabuada {

	public int multiplicador;
	public int minimoMultiplicador;
	public int maximoMultiplicador;
	public ArrayList<String> resultado = new ArrayList<String>();

	public ArrayList<String> getNumeroResultado() {

		while(minimoMultiplicador <= maximoMultiplicador) {

			resultado.add(multiplicador + " x " +  minimoMultiplicador + " = " + (multiplicador * minimoMultiplicador));
			multiplicador++;

		}

		return resultado;

	}


}