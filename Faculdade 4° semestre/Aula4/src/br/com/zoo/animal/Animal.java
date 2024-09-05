package br.com.zoo.animal;

public class Animal {
	
	public String raca;
	public String cor;
	public int idade;
	
	
	public Animal(String raca, String cor, int idade) {
		super();
		this.raca = raca;
		this.cor = cor;
		this.idade = idade;
	}
	
	public void emitirSom() {
		System.out.println("O " + raca + " está emitindo som...");
	}
	
	public void dormir() {
		System.out.println("O " + raca + " está dormindo...");
	}
}
