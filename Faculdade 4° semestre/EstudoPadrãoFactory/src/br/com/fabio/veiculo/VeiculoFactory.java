package br.com.fabio.veiculo;

public class VeiculoFactory {

	public LigarVeiculo criarVeiculo(String tipo) {
		
		if(tipo == "moto") {
			return new Moto();
		}else if (tipo == "carro") {
			return new Carro();
		}
		
		return null;
	}
	
}
