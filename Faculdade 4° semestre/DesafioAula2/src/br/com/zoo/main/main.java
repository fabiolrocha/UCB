package br.com.zoo.main;

import br.com.zoo.animal.Ave;
import br.com.zoo.animal.Mamifero;


public class main{

public static void main(String[] arg) {
    
    Ave objAve = new Ave("Papagaio", "Verde", 2, "Macias", "Curvo");

    objAve.emitirSom();
    objAve.dormir();
    objAve.voar();


    System.out.println("=====================================");

    Mamifero objMamifero = new Mamifero("Cachorro", "Marrom", 3, "Curta", "Viviparo");

    objMamifero.emitirSom();
    objMamifero.dormir();
    objMamifero.amamentar();

}

}