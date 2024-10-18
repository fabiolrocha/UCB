package br.com.fabio.conexao;

public class Conexao {
	
	private static Conexao conexao;
	
	private Conexao() {
		System.out.println("Banco conectado");
	}
	
	public static Conexao getIstance() {
		
		if (conexao == null) {
			conexao = new Conexao();
		}
		
		return conexao;
	}
	
	public void acao() {
		System.out.println("Fazendo consulta");
	}
}
