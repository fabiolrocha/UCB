package br.com.fabio.principal;

import br.com.fabio.animal.Animal;

public class Principal {

	public static void main(String[] args) {
		
		Animal objetoAnimal1 = new Animal("Bino", "Cachorro", 17);
		
		objetoAnimal1.info();
		objetoAnimal1.som();
		
		Animal objetoAnimal2 = new Animal("Margareth", "Gato", 3);

		objetoAnimal2.info();
		objetoAnimal2.som();
	}

}
