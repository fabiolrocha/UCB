package br.com.fabio.main;

import br.com.fabio.veiculo.Carro;
import br.com.fabio.veiculo.LigarVeiculo;
import br.com.fabio.veiculo.VeiculoFactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VeiculoFactory objVeiculoFactory = new VeiculoFactory();
		
		LigarVeiculo moto = objVeiculoFactory.criarVeiculo("moto");
		moto.ligar();
		
		LigarVeiculo carro = objVeiculoFactory.criarVeiculo("carro");
		carro.ligar();
	}

}
