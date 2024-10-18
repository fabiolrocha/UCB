package br.com.fabio.main;

import br.com.fabio.veiculo.impl.Bicicleta;
import br.com.fabio.veiculo.impl.Carro;
import br.com.fabio.veiculo.impl.Onibus;

public class Main {

	public static void main(String[] args) {
		
		Bicicleta objBicicleta = new Bicicleta();
		
		objBicicleta.mover();
		
		
		Carro objCarro = new Carro();
		
		objCarro.mover();
		
		
		Onibus objOnibus = new Onibus();
		
		objOnibus.mover();
	}

}
