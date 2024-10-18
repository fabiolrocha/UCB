package br.com.fabio.conexao;

public class Main {

	public static void main(String[] args) {
		Conexao conexao1 = Conexao.getIstance();
		conexao1.acao();
		
		Conexao conexao2 = Conexao.getIstance();
		conexao2 = Conexao.getIstance();
		
		System.out.println(conexao1 == conexao2);
	}
}
