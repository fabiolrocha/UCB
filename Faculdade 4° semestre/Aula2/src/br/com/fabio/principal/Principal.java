package br.com.fabio.principal;

import br.com.fabio.veiculo.Veiculo;

public class Principal{

	public static void main (String[] args) {
		
		Veiculo objetoVeiculo1 = new Veiculo("Fiat", "Uno", 1997);
		
		objetoVeiculo1.acelerar();
		
		Veiculo objetoVeiculo2 = new Veiculo("Volks", "Gol", 2003);
		
		objetoVeiculo2.freiar();
		objetoVeiculo2.informacao();
	}
}