package br.com.fabio.animal;

public class Animal {
	
	public String nome;
	public String raca;
	public int idade;
	
	public Animal(String nome, String raca, int idade) {
		super();
		this.nome= nome;
		this.raca = raca;
		this.idade = idade;
	}
	

	public void info() {
		System.out.println("Nome: " + nome + "\n" + "Raça: " + raca + "\n" + "Idade: " + idade + "\n");
	}
	
	public void som() {
		if (raca == "cachorro" || raca == "Cachorro") {
			System.out.println(nome + " está latindo");
		}else if (raca == "gato" || raca == "Gato") {
			System.out.println(nome + " está miando");
		}else {
			System.out.println(nome + " não tem som");
		}
	}
	
}
