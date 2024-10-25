package br.com.fabio.main;

import br.com.fabio.padrao.impl.Interruptor;
import br.com.fabio.padrao.impl.Luz;

public class Main {

	public static void main(String[] agr) {
		
		Interruptor objInterruptor = new Interruptor();
		Luz objLuz = new Luz();
		
		objInterruptor.adicionarListener(objLuz);
		
		objInterruptor.ligar();
		
	}
	
}
