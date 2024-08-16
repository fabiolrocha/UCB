package br.com.fabio.veiculo;

public class Veiculo {

	//Variaveis
	private String marca;
	private String modelo;
	private int ano;
	
	
	//Inicializar as variaveis da classe
	public Veiculo(String marca, String modelo, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	//Metodos
	public void acelerar() {
		System.out.println(modelo + " Acelerando...");
	}
	public void freiar() {
		System.out.println(modelo + " Freiando...");
	}
	
	public void informacao() {
		System.out.println("\n" + "Marca: " + marca + "\n" + "Modelo: " + modelo + "\n" + "Ano: " + ano);
	}
	
}
